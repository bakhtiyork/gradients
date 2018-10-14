import java.io.File
import java.util.regex.Pattern
import kotlin.system.exitProcess

/**
 * Usage:
 * kotlinc -script generate.kts <path to local clone of https://github.com/itmeo/webgradients.git>
 *
 * Generated content:
 * 1. Gradient methods (linear gradients only for now)
 * 2. names() - method returns all names of gradients
 * 3. find(name: String) - method returns gradient drawable by name
 */


// <editor-fold desc="Regular expressions">
val namePattern = Pattern.compile("\\/\\*\\d+([\\D]+)\\*\\/")
val linearGradientPattern = Pattern.compile("\\s+background-image: linear-gradient\\((.+)\\);")
val backgroundPattern = Pattern.compile("\\s+background: (.+);")
val radialPattern = Pattern.compile("radial-gradient(?=\\()(?:(?=.*?\\((?!.*?\\1)(.*\\)(?!.*\\2).*))(?=.*?\\)(?!.*?\\2)(.*)).)+?.*?(?=\\1)[^(]*(?=\\2$)")
val linearPattern = Pattern.compile("linear-gradient(?=\\()(?:(?=.*?\\((?!.*?\\1)(.*\\)(?!.*\\2).*))(?=.*?\\)(?!.*?\\2)(.*)).)+?.*?(?=\\1)[^(]*(?=\\2$)")
// </editor-fold>

// <editor-fold desc="Global variables">
val names = mutableMapOf<String, Int>()
val methodNames = mutableListOf<String>()
val methodMap = mutableMapOf<String, String>()
// </editor-fold>


if (args.size == 0) {
    println("Please, provide path to clone of https://github.com/itmeo/webgradients.git")
    exitProcess(0)
}


val fileContent = readFileContent()
val output = parseCSSFile(fileContent)
println(output)


// *************************************************************************************************

fun readFileContent() = File("${args[0]}/webgradients.css").readText(Charsets.UTF_8)

fun parseCSSFile(content: String): String {
    val buffer = StringBuffer()
    val gradientDefs = content.split("\n\n")

    for ((i, definition) in gradientDefs.withIndex()) {
        val lines = definition.split("\n")
        val m1 = namePattern.matcher(lines[0])
        if (m1.matches()) {
            val name = m1.group(1).trim()
            val m2 = linearGradientPattern.matcher(lines[2])
            if (m2.matches() && !lines[3].contains("background-blend-mode")) {
                var methodName = name.replace(" ", "").decapitalize()
                if (names.containsKey(methodName)) {
                    var cnt = names.get(methodName)!! + 1
                    methodName += cnt.toString()
                    names.put(methodName, cnt)
                } else {
                    names.put(methodName, 1)
                }
                methodNames.add(methodName)
                methodMap.put(name, methodName)
                val value = genLinearGradientMethod(methodName, name, m2.group(1), "${i + 1}. ${name}")
                buffer.append(value).append("\n")
            }
        }
    }

    buffer.append(genNamesMethod())
    buffer.append(genFindMethod())
    return buffer.toString()
}

fun genNamesMethod() = "@JvmStatic\nfun names() = " +
        methodMap.entries.map { "\"${it.key}\"" }
                .joinToString(", ", prefix = "listOf(", postfix = ")\n")


fun genFindMethod() = "@JvmStatic\nfun find(name: String) : WebGradientDrawable? =" +
        methodMap.entries.map { "\t\t\"${it.key}\" -> ${it.value}()" }
                .joinToString("\n",
                        prefix = "\n\t when(name) {\n",
                        postfix = "\n\t\telse -> null\n}\n")


fun genLinearGradientMethod(methodName: String, colorName: String, input: String, comment: String): String {
    val out = parseLinearGradientParams(input)
    val result = "/**\n" +
            " * ${comment}\n" +
            " */\n" +
            "@JvmStatic\n" +
            "fun ${methodName}() = " +
            "linear(\"${colorName}\", ${out.first}, ${out.second}, ${out.third})\n"
    return result
}


fun parseLinearGradientParams(input: String): Triple<String, String, String> {
    val parts = input.split(",(?![^()]*+\\))".toRegex()).map { it.trim() }
    val deg = when (parts[0]) {
        "to top" -> -90
        "to right" -> 0
        "to bottom" -> 90
        else -> parts[0].replace("deg", "").trim().toInt() - 90
    }
    val colors = mutableListOf<String>()
    val positions = mutableListOf<Float>()
    val tail = parts.drop(1)
    for (part in tail) {
        val elems = part.trim().split("\\s(?![^()]*+\\))".toRegex())
        colors.add(elems[0])
        val position = elems[1].replace("%", "").toFloat() / 100.0f
        positions.add(position)
    }
    val colorString = colors.map { if (it.startsWith("rgba")) it else "Color.parseColor(\"${it}\")" }
            .joinToString(", ", prefix = "intArrayOf(", postfix = ")")
    val positionString = positions.map { "${it}f" }
            .joinToString(", ", prefix = "floatArrayOf(", postfix = ")")
    return Triple("${deg}.0", colorString, positionString)
}