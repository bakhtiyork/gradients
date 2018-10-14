package com.bakhtiyor.gradients

import android.graphics.Color


object Gradients {
    private fun linear(name: String, angle: Double, colors: IntArray, positions: FloatArray) =
            WebGradientDrawable(name, LinearGradientShaderFactory(angle, colors, positions))


    //<editor-fold desc="Generated Code">

    /**
     * 1. Warm Flame
     */
    @JvmStatic
    fun warmFlame() = linear("Warm Flame", -45.0, intArrayOf(Color.parseColor("#ff9a9e"), Color.parseColor("#fad0c4"), Color.parseColor("#fad0c4")), floatArrayOf(0.0f, 0.99f, 1.0f))

    /**
     * 2. Night Fade
     */
    @JvmStatic
    fun nightFade() = linear("Night Fade", -90.0, intArrayOf(Color.parseColor("#a18cd1"), Color.parseColor("#fbc2eb")), floatArrayOf(0.0f, 1.0f))

    /**
     * 3. Spring Warmth
     */
    @JvmStatic
    fun springWarmth() = linear("Spring Warmth", -90.0, intArrayOf(Color.parseColor("#fad0c4"), Color.parseColor("#fad0c4"), Color.parseColor("#ffd1ff")), floatArrayOf(0.0f, 0.01f, 1.0f))

    /**
     * 4. Juicy Peach
     */
    @JvmStatic
    fun juicyPeach() = linear("Juicy Peach", 0.0, intArrayOf(Color.parseColor("#ffecd2"), Color.parseColor("#fcb69f")), floatArrayOf(0.0f, 1.0f))

    /**
     * 5. Young Passion
     */
    @JvmStatic
    fun youngPassion() = linear("Young Passion", 0.0, intArrayOf(Color.parseColor("#ff8177"), Color.parseColor("#ff867a"), Color.parseColor("#ff8c7f"), Color.parseColor("#f99185"), Color.parseColor("#cf556c"), Color.parseColor("#b12a5b")), floatArrayOf(0.0f, 0.0f, 0.21f, 0.52f, 0.78f, 1.0f))

    /**
     * 6. Lady Lips
     */
    @JvmStatic
    fun ladyLips() = linear("Lady Lips", -90.0, intArrayOf(Color.parseColor("#ff9a9e"), Color.parseColor("#fecfef"), Color.parseColor("#fecfef")), floatArrayOf(0.0f, 0.99f, 1.0f))

    /**
     * 7. Sunny Morning
     */
    @JvmStatic
    fun sunnyMorning() = linear("Sunny Morning", 30.0, intArrayOf(Color.parseColor("#f6d365"), Color.parseColor("#fda085")), floatArrayOf(0.0f, 1.0f))

    /**
     * 8. Rainy Ashville
     */
    @JvmStatic
    fun rainyAshville() = linear("Rainy Ashville", -90.0, intArrayOf(Color.parseColor("#fbc2eb"), Color.parseColor("#a6c1ee")), floatArrayOf(0.0f, 1.0f))

    /**
     * 9. Frozen Dreams
     */
    @JvmStatic
    fun frozenDreams() = linear("Frozen Dreams", -90.0, intArrayOf(Color.parseColor("#fdcbf1"), Color.parseColor("#fdcbf1"), Color.parseColor("#e6dee9")), floatArrayOf(0.0f, 0.01f, 1.0f))

    /**
     * 10. Winter Neva
     */
    @JvmStatic
    fun winterNeva() = linear("Winter Neva", 30.0, intArrayOf(Color.parseColor("#a1c4fd"), Color.parseColor("#c2e9fb")), floatArrayOf(0.0f, 1.0f))

    /**
     * 11. Dusty Grass
     */
    @JvmStatic
    fun dustyGrass() = linear("Dusty Grass", 30.0, intArrayOf(Color.parseColor("#d4fc79"), Color.parseColor("#96e6a1")), floatArrayOf(0.0f, 1.0f))

    /**
     * 12. Tempting Azure
     */
    @JvmStatic
    fun temptingAzure() = linear("Tempting Azure", 30.0, intArrayOf(Color.parseColor("#84fab0"), Color.parseColor("#8fd3f4")), floatArrayOf(0.0f, 1.0f))

    /**
     * 13. Heavy Rain
     */
    @JvmStatic
    fun heavyRain() = linear("Heavy Rain", -90.0, intArrayOf(Color.parseColor("#cfd9df"), Color.parseColor("#e2ebf0")), floatArrayOf(0.0f, 1.0f))

    /**
     * 14. Amy Crisp
     */
    @JvmStatic
    fun amyCrisp() = linear("Amy Crisp", 30.0, intArrayOf(Color.parseColor("#a6c0fe"), Color.parseColor("#f68084")), floatArrayOf(0.0f, 1.0f))

    /**
     * 15. Mean Fruit
     */
    @JvmStatic
    fun meanFruit() = linear("Mean Fruit", 30.0, intArrayOf(Color.parseColor("#fccb90"), Color.parseColor("#d57eeb")), floatArrayOf(0.0f, 1.0f))

    /**
     * 16. Deep Blue
     */
    @JvmStatic
    fun deepBlue() = linear("Deep Blue", 30.0, intArrayOf(Color.parseColor("#e0c3fc"), Color.parseColor("#8ec5fc")), floatArrayOf(0.0f, 1.0f))

    /**
     * 17. Ripe Malinka
     */
    @JvmStatic
    fun ripeMalinka() = linear("Ripe Malinka", 30.0, intArrayOf(Color.parseColor("#f093fb"), Color.parseColor("#f5576c")), floatArrayOf(0.0f, 1.0f))

    /**
     * 18. Cloudy Knoxville
     */
    @JvmStatic
    fun cloudyKnoxville() = linear("Cloudy Knoxville", 30.0, intArrayOf(Color.parseColor("#fdfbfb"), Color.parseColor("#ebedee")), floatArrayOf(0.0f, 1.0f))

    /**
     * 19. Malibu Beach
     */
    @JvmStatic
    fun malibuBeach() = linear("Malibu Beach", 0.0, intArrayOf(Color.parseColor("#4facfe"), Color.parseColor("#00f2fe")), floatArrayOf(0.0f, 1.0f))

    /**
     * 20. New Life
     */
    @JvmStatic
    fun newLife() = linear("New Life", 0.0, intArrayOf(Color.parseColor("#43e97b"), Color.parseColor("#38f9d7")), floatArrayOf(0.0f, 1.0f))

    /**
     * 21. True Sunset
     */
    @JvmStatic
    fun trueSunset() = linear("True Sunset", 0.0, intArrayOf(Color.parseColor("#fa709a"), Color.parseColor("#fee140")), floatArrayOf(0.0f, 1.0f))

    /**
     * 22. Morpheus Den
     */
    @JvmStatic
    fun morpheusDen() = linear("Morpheus Den", -90.0, intArrayOf(Color.parseColor("#30cfd0"), Color.parseColor("#330867")), floatArrayOf(0.0f, 1.0f))

    /**
     * 23. Rare Wind
     */
    @JvmStatic
    fun rareWind() = linear("Rare Wind", -90.0, intArrayOf(Color.parseColor("#a8edea"), Color.parseColor("#fed6e3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 24. Near Moon
     */
    @JvmStatic
    fun nearMoon() = linear("Near Moon", -90.0, intArrayOf(Color.parseColor("#5ee7df"), Color.parseColor("#b490ca")), floatArrayOf(0.0f, 1.0f))

    /**
     * 25. Wild Apple
     */
    @JvmStatic
    fun wildApple() = linear("Wild Apple", -90.0, intArrayOf(Color.parseColor("#d299c2"), Color.parseColor("#fef9d7")), floatArrayOf(0.0f, 1.0f))

    /**
     * 26. Saint Petersburg
     */
    @JvmStatic
    fun saintPetersburg() = linear("Saint Petersburg", 45.0, intArrayOf(Color.parseColor("#f5f7fa"), Color.parseColor("#c3cfe2")), floatArrayOf(0.0f, 1.0f))

    /**
     * 28. Plum Plate
     */
    @JvmStatic
    fun plumPlate() = linear("Plum Plate", 45.0, intArrayOf(Color.parseColor("#667eea"), Color.parseColor("#764ba2")), floatArrayOf(0.0f, 1.0f))

    /**
     * 29. Everlasting Sky
     */
    @JvmStatic
    fun everlastingSky() = linear("Everlasting Sky", 45.0, intArrayOf(Color.parseColor("#fdfcfb"), Color.parseColor("#e2d1c3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 30. Happy Fisher
     */
    @JvmStatic
    fun happyFisher() = linear("Happy Fisher", 30.0, intArrayOf(Color.parseColor("#89f7fe"), Color.parseColor("#66a6ff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 31. Blessing
     */
    @JvmStatic
    fun blessing() = linear("Blessing", -90.0, intArrayOf(Color.parseColor("#fddb92"), Color.parseColor("#d1fdff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 32. Sharpeye Eagle
     */
    @JvmStatic
    fun sharpeyeEagle() = linear("Sharpeye Eagle", -90.0, intArrayOf(Color.parseColor("#9890e3"), Color.parseColor("#b1f4cf")), floatArrayOf(0.0f, 1.0f))

    /**
     * 33. Ladoga Bottom
     */
    @JvmStatic
    fun ladogaBottom() = linear("Ladoga Bottom", -90.0, intArrayOf(Color.parseColor("#ebc0fd"), Color.parseColor("#d9ded8")), floatArrayOf(0.0f, 1.0f))

    /**
     * 34. Lemon Gate
     */
    @JvmStatic
    fun lemonGate() = linear("Lemon Gate", -90.0, intArrayOf(Color.parseColor("#96fbc4"), Color.parseColor("#f9f586")), floatArrayOf(0.0f, 1.0f))

    /**
     * 35. Itmeo Branding
     */
    @JvmStatic
    fun itmeoBranding() = linear("Itmeo Branding", 90.0, intArrayOf(Color.parseColor("#2af598"), Color.parseColor("#009efd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 36. Zeus Miracle
     */
    @JvmStatic
    fun zeusMiracle() = linear("Zeus Miracle", -90.0, intArrayOf(Color.parseColor("#cd9cf2"), Color.parseColor("#f6f3ff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 37. Old Hat
     */
    @JvmStatic
    fun oldHat() = linear("Old Hat", 0.0, intArrayOf(Color.parseColor("#e4afcb"), Color.parseColor("#b8cbb8"), Color.parseColor("#b8cbb8"), Color.parseColor("#e2c58b"), Color.parseColor("#c2ce9c"), Color.parseColor("#7edbdc")), floatArrayOf(0.0f, 0.0f, 0.0f, 0.3f, 0.64f, 1.0f))

    /**
     * 38. Star Wine
     */
    @JvmStatic
    fun starWine() = linear("Star Wine", 0.0, intArrayOf(Color.parseColor("#b8cbb8"), Color.parseColor("#b8cbb8"), Color.parseColor("#b465da"), Color.parseColor("#cf6cc9"), Color.parseColor("#ee609c"), Color.parseColor("#ee609c")), floatArrayOf(0.0f, 0.0f, 0.0f, 0.33f, 0.66f, 1.0f))

    /**
     * 39. Deep Blue
     */
    @JvmStatic
    fun deepBlue2() = linear("Deep Blue", 0.0, intArrayOf(Color.parseColor("#6a11cb"), Color.parseColor("#2575fc")), floatArrayOf(0.0f, 1.0f))

    /**
     * 41. Happy Acid
     */
    @JvmStatic
    fun happyAcid() = linear("Happy Acid", -90.0, intArrayOf(Color.parseColor("#37ecba"), Color.parseColor("#72afd3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 42. Awesome Pine
     */
    @JvmStatic
    fun awesomePine() = linear("Awesome Pine", -90.0, intArrayOf(Color.parseColor("#ebbba7"), Color.parseColor("#cfc7f8")), floatArrayOf(0.0f, 1.0f))

    /**
     * 43. New York
     */
    @JvmStatic
    fun newYork() = linear("New York", -90.0, intArrayOf(Color.parseColor("#fff1eb"), Color.parseColor("#ace0f9")), floatArrayOf(0.0f, 1.0f))

    /**
     * 44. Shy Rainbow
     */
    @JvmStatic
    fun shyRainbow() = linear("Shy Rainbow", 0.0, intArrayOf(Color.parseColor("#eea2a2"), Color.parseColor("#bbc1bf"), Color.parseColor("#57c6e1"), Color.parseColor("#b49fda"), Color.parseColor("#7ac5d8")), floatArrayOf(0.0f, 0.19f, 0.42f, 0.79f, 1.0f))

    /**
     * 46. Mixed Hopes
     */
    @JvmStatic
    fun mixedHopes() = linear("Mixed Hopes", -90.0, intArrayOf(Color.parseColor("#c471f5"), Color.parseColor("#fa71cd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 47. Fly High
     */
    @JvmStatic
    fun flyHigh() = linear("Fly High", -90.0, intArrayOf(Color.parseColor("#48c6ef"), Color.parseColor("#6f86d6")), floatArrayOf(0.0f, 1.0f))

    /**
     * 48. Strong Bliss
     */
    @JvmStatic
    fun strongBliss() = linear("Strong Bliss", 0.0, intArrayOf(Color.parseColor("#f78ca0"), Color.parseColor("#f9748f"), Color.parseColor("#fd868c"), Color.parseColor("#fe9a8b")), floatArrayOf(0.0f, 0.19f, 0.6f, 1.0f))

    /**
     * 49. Fresh Milk
     */
    @JvmStatic
    fun freshMilk() = linear("Fresh Milk", -90.0, intArrayOf(Color.parseColor("#feada6"), Color.parseColor("#f5efef")), floatArrayOf(0.0f, 1.0f))

    /**
     * 50. Snow Again
     */
    @JvmStatic
    fun snowAgain() = linear("Snow Again", -90.0, intArrayOf(Color.parseColor("#e6e9f0"), Color.parseColor("#eef1f5")), floatArrayOf(0.0f, 1.0f))

    /**
     * 51. February Ink
     */
    @JvmStatic
    fun februaryInk() = linear("February Ink", -90.0, intArrayOf(Color.parseColor("#accbee"), Color.parseColor("#e7f0fd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 52. Kind Steel
     */
    @JvmStatic
    fun kindSteel() = linear("Kind Steel", -110.0, intArrayOf(Color.parseColor("#e9defa"), Color.parseColor("#fbfcdb")), floatArrayOf(0.0f, 1.0f))

    /**
     * 53. Soft Grass
     */
    @JvmStatic
    fun softGrass() = linear("Soft Grass", -90.0, intArrayOf(Color.parseColor("#c1dfc4"), Color.parseColor("#deecdd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 54. Grown Early
     */
    @JvmStatic
    fun grownEarly() = linear("Grown Early", -90.0, intArrayOf(Color.parseColor("#0ba360"), Color.parseColor("#3cba92")), floatArrayOf(0.0f, 1.0f))

    /**
     * 55. Sharp Blues
     */
    @JvmStatic
    fun sharpBlues() = linear("Sharp Blues", -90.0, intArrayOf(Color.parseColor("#00c6fb"), Color.parseColor("#005bea")), floatArrayOf(0.0f, 1.0f))

    /**
     * 56. Shady Water
     */
    @JvmStatic
    fun shadyWater() = linear("Shady Water", 0.0, intArrayOf(Color.parseColor("#74ebd5"), Color.parseColor("#9face6")), floatArrayOf(0.0f, 1.0f))

    /**
     * 57. Dirty Beauty
     */
    @JvmStatic
    fun dirtyBeauty() = linear("Dirty Beauty", -90.0, intArrayOf(Color.parseColor("#6a85b6"), Color.parseColor("#bac8e0")), floatArrayOf(0.0f, 1.0f))

    /**
     * 58. Great Whale
     */
    @JvmStatic
    fun greatWhale() = linear("Great Whale", -90.0, intArrayOf(Color.parseColor("#a3bded"), Color.parseColor("#6991c7")), floatArrayOf(0.0f, 1.0f))

    /**
     * 59. Teen Notebook
     */
    @JvmStatic
    fun teenNotebook() = linear("Teen Notebook", -90.0, intArrayOf(Color.parseColor("#9795f0"), Color.parseColor("#fbc8d4")), floatArrayOf(0.0f, 1.0f))

    /**
     * 60. Polite Rumors
     */
    @JvmStatic
    fun politeRumors() = linear("Polite Rumors", -90.0, intArrayOf(Color.parseColor("#a7a6cb"), Color.parseColor("#8989ba"), Color.parseColor("#8989ba")), floatArrayOf(0.0f, 0.52f, 1.0f))

    /**
     * 61. Sweet Period
     */
    @JvmStatic
    fun sweetPeriod() = linear("Sweet Period", -90.0, intArrayOf(Color.parseColor("#3f51b1"), Color.parseColor("#5a55ae"), Color.parseColor("#7b5fac"), Color.parseColor("#8f6aae"), Color.parseColor("#a86aa4"), Color.parseColor("#cc6b8e"), Color.parseColor("#f18271"), Color.parseColor("#f3a469"), Color.parseColor("#f7c978")), floatArrayOf(0.0f, 0.13f, 0.25f, 0.38f, 0.5f, 0.62f, 0.75f, 0.87f, 1.0f))

    /**
     * 62. Wide Matrix
     */
    @JvmStatic
    fun wideMatrix() = linear("Wide Matrix", -90.0, intArrayOf(Color.parseColor("#fcc5e4"), Color.parseColor("#fda34b"), Color.parseColor("#ff7882"), Color.parseColor("#c8699e"), Color.parseColor("#7046aa"), Color.parseColor("#0c1db8"), Color.parseColor("#020f75")), floatArrayOf(0.0f, 0.15f, 0.35f, 0.52f, 0.71f, 0.87f, 1.0f))

    /**
     * 63. Soft Cherish
     */
    @JvmStatic
    fun softCherish() = linear("Soft Cherish", -90.0, intArrayOf(Color.parseColor("#dbdcd7"), Color.parseColor("#dddcd7"), Color.parseColor("#e2c9cc"), Color.parseColor("#e7627d"), Color.parseColor("#b8235a"), Color.parseColor("#801357"), Color.parseColor("#3d1635"), Color.parseColor("#1c1a27")), floatArrayOf(0.0f, 0.24f, 0.3f, 0.46f, 0.59f, 0.71f, 0.84f, 1.0f))

    /**
     * 64. Red Salvation
     */
    @JvmStatic
    fun redSalvation() = linear("Red Salvation", -90.0, intArrayOf(Color.parseColor("#f43b47"), Color.parseColor("#453a94")), floatArrayOf(0.0f, 1.0f))

    /**
     * 65. Burning Spring
     */
    @JvmStatic
    fun burningSpring() = linear("Burning Spring", -90.0, intArrayOf(Color.parseColor("#4fb576"), Color.parseColor("#44c489"), Color.parseColor("#28a9ae"), Color.parseColor("#28a2b7"), Color.parseColor("#4c7788"), Color.parseColor("#6c4f63"), Color.parseColor("#432c39")), floatArrayOf(0.0f, 0.3f, 0.46f, 0.59f, 0.71f, 0.86f, 1.0f))

    /**
     * 66. Night Party
     */
    @JvmStatic
    fun nightParty() = linear("Night Party", -90.0, intArrayOf(Color.parseColor("#0250c5"), Color.parseColor("#d43f8d")), floatArrayOf(0.0f, 1.0f))

    /**
     * 67. Sky Glider
     */
    @JvmStatic
    fun skyGlider() = linear("Sky Glider", -90.0, intArrayOf(Color.parseColor("#88d3ce"), Color.parseColor("#6e45e2")), floatArrayOf(0.0f, 1.0f))

    /**
     * 68. Heaven Peach
     */
    @JvmStatic
    fun heavenPeach() = linear("Heaven Peach", -90.0, intArrayOf(Color.parseColor("#d9afd9"), Color.parseColor("#97d9e1")), floatArrayOf(0.0f, 1.0f))

    /**
     * 69. Purple Division
     */
    @JvmStatic
    fun purpleDivision() = linear("Purple Division", -90.0, intArrayOf(Color.parseColor("#7028e4"), Color.parseColor("#e5b2ca")), floatArrayOf(0.0f, 1.0f))

    /**
     * 70. Aqua Splash
     */
    @JvmStatic
    fun aquaSplash() = linear("Aqua Splash", -75.0, intArrayOf(Color.parseColor("#13547a"), Color.parseColor("#80d0c7")), floatArrayOf(0.0f, 1.0f))

    /**
     * 72. Spiky Naga
     */
    @JvmStatic
    fun spikyNaga() = linear("Spiky Naga", -90.0, intArrayOf(Color.parseColor("#505285"), Color.parseColor("#585e92"), Color.parseColor("#65689f"), Color.parseColor("#7474b0"), Color.parseColor("#7e7ebb"), Color.parseColor("#8389c7"), Color.parseColor("#9795d4"), Color.parseColor("#a2a1dc"), Color.parseColor("#b5aee4")), floatArrayOf(0.0f, 0.12f, 0.25f, 0.37f, 0.5f, 0.62f, 0.75f, 0.87f, 1.0f))

    /**
     * 73. Love Kiss
     */
    @JvmStatic
    fun loveKiss() = linear("Love Kiss", -90.0, intArrayOf(Color.parseColor("#ff0844"), Color.parseColor("#ffb199")), floatArrayOf(0.0f, 1.0f))

    /**
     * 75. Clean Mirror
     */
    @JvmStatic
    fun cleanMirror() = linear("Clean Mirror", -45.0, intArrayOf(Color.parseColor("#93a5cf"), Color.parseColor("#e4efe9")), floatArrayOf(0.0f, 1.0f))

    /**
     * 76. Premium Dark
     */
    @JvmStatic
    fun premiumDark() = linear("Premium Dark", 0.0, intArrayOf(Color.parseColor("#434343"), Color.parseColor("black")), floatArrayOf(0.0f, 1.0f))

    /**
     * 77. Cold Evening
     */
    @JvmStatic
    fun coldEvening() = linear("Cold Evening", -90.0, intArrayOf(Color.parseColor("#0c3483"), Color.parseColor("#a2b6df"), Color.parseColor("#6b8cce"), Color.parseColor("#a2b6df")), floatArrayOf(0.0f, 1.0f, 1.0f, 1.0f))

    /**
     * 78. Cochiti Lake
     */
    @JvmStatic
    fun cochitiLake() = linear("Cochiti Lake", -45.0, intArrayOf(Color.parseColor("#93a5cf"), Color.parseColor("#e4efe9")), floatArrayOf(0.0f, 1.0f))

    /**
     * 79. Summer Games
     */
    @JvmStatic
    fun summerGames() = linear("Summer Games", 0.0, intArrayOf(Color.parseColor("#92fe9d"), Color.parseColor("#00c9ff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 80. Passionate Bed
     */
    @JvmStatic
    fun passionateBed() = linear("Passionate Bed", 0.0, intArrayOf(Color.parseColor("#ff758c"), Color.parseColor("#ff7eb3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 81. Mountain Rock
     */
    @JvmStatic
    fun mountainRock() = linear("Mountain Rock", 0.0, intArrayOf(Color.parseColor("#868f96"), Color.parseColor("#596164")), floatArrayOf(0.0f, 1.0f))

    /**
     * 82. Desert Hump
     */
    @JvmStatic
    fun desertHump() = linear("Desert Hump", -90.0, intArrayOf(Color.parseColor("#c79081"), Color.parseColor("#dfa579")), floatArrayOf(0.0f, 1.0f))

    /**
     * 83. Jungle Day
     */
    @JvmStatic
    fun jungleDay() = linear("Jungle Day", -45.0, intArrayOf(Color.parseColor("#8baaaa"), Color.parseColor("#ae8b9c")), floatArrayOf(0.0f, 1.0f))

    /**
     * 84. Phoenix Start
     */
    @JvmStatic
    fun phoenixStart() = linear("Phoenix Start", 0.0, intArrayOf(Color.parseColor("#f83600"), Color.parseColor("#f9d423")), floatArrayOf(0.0f, 1.0f))

    /**
     * 85. October Silence
     */
    @JvmStatic
    fun octoberSilence() = linear("October Silence", -110.0, intArrayOf(Color.parseColor("#b721ff"), Color.parseColor("#21d4fd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 86. Faraway River
     */
    @JvmStatic
    fun farawayRiver() = linear("Faraway River", -110.0, intArrayOf(Color.parseColor("#6e45e2"), Color.parseColor("#88d3ce")), floatArrayOf(0.0f, 1.0f))

    /**
     * 87. Alchemist Lab
     */
    @JvmStatic
    fun alchemistLab() = linear("Alchemist Lab", -110.0, intArrayOf(Color.parseColor("#d558c8"), Color.parseColor("#24d292")), floatArrayOf(0.0f, 1.0f))

    /**
     * 88. Over Sun
     */
    @JvmStatic
    fun overSun() = linear("Over Sun", -30.0, intArrayOf(Color.parseColor("#abecd6"), Color.parseColor("#fbed96")), floatArrayOf(0.0f, 1.0f))

    /**
     * 89. Premium White
     */
    @JvmStatic
    fun premiumWhite() = linear("Premium White", -90.0, intArrayOf(Color.parseColor("#d5d4d0"), Color.parseColor("#d5d4d0"), Color.parseColor("#eeeeec"), Color.parseColor("#efeeec"), Color.parseColor("#e9e9e7")), floatArrayOf(0.0f, 0.01f, 0.31f, 0.75f, 1.0f))

    /**
     * 90. Mars Party
     */
    @JvmStatic
    fun marsParty() = linear("Mars Party", -90.0, intArrayOf(Color.parseColor("#5f72bd"), Color.parseColor("#9b23ea")), floatArrayOf(0.0f, 1.0f))

    /**
     * 91. Eternal Constance
     */
    @JvmStatic
    fun eternalConstance() = linear("Eternal Constance", -90.0, intArrayOf(Color.parseColor("#09203f"), Color.parseColor("#537895")), floatArrayOf(0.0f, 1.0f))

    /**
     * 92. Japan Blush
     */
    @JvmStatic
    fun japanBlush() = linear("Japan Blush", -110.0, intArrayOf(Color.parseColor("#ddd6f3"), Color.parseColor("#faaca8"), Color.parseColor("#faaca8")), floatArrayOf(0.0f, 1.0f, 1.0f))

    /**
     * 93. Smiling Rain
     */
    @JvmStatic
    fun smilingRain() = linear("Smiling Rain", -110.0, intArrayOf(Color.parseColor("#dcb0ed"), Color.parseColor("#99c99c")), floatArrayOf(0.0f, 1.0f))

    /**
     * 94. Cloudy Apple
     */
    @JvmStatic
    fun cloudyApple() = linear("Cloudy Apple", -90.0, intArrayOf(Color.parseColor("#f3e7e9"), Color.parseColor("#e3eeff"), Color.parseColor("#e3eeff")), floatArrayOf(0.0f, 0.99f, 1.0f))

    /**
     * 95. Big Mango
     */
    @JvmStatic
    fun bigMango() = linear("Big Mango", -90.0, intArrayOf(Color.parseColor("#c71d6f"), Color.parseColor("#d09693")), floatArrayOf(0.0f, 1.0f))

    /**
     * 96. Healthy Water
     */
    @JvmStatic
    fun healthyWater() = linear("Healthy Water", -30.0, intArrayOf(Color.parseColor("#96deda"), Color.parseColor("#50c9c3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 97. Amour Amour
     */
    @JvmStatic
    fun amourAmour() = linear("Amour Amour", -90.0, intArrayOf(Color.parseColor("#f77062"), Color.parseColor("#fe5196")), floatArrayOf(0.0f, 1.0f))

    /**
     * 98. Risky Concrete
     */
    @JvmStatic
    fun riskyConcrete() = linear("Risky Concrete", -90.0, intArrayOf(Color.parseColor("#c4c5c7"), Color.parseColor("#dcdddf"), Color.parseColor("#ebebeb")), floatArrayOf(0.0f, 0.52f, 1.0f))

    /**
     * 99. Strong Stick
     */
    @JvmStatic
    fun strongStick() = linear("Strong Stick", 0.0, intArrayOf(Color.parseColor("#a8caba"), Color.parseColor("#5d4157")), floatArrayOf(0.0f, 1.0f))

    /**
     * 100. Vicious Stance
     */
    @JvmStatic
    fun viciousStance() = linear("Vicious Stance", -30.0, intArrayOf(Color.parseColor("#29323c"), Color.parseColor("#485563")), floatArrayOf(0.0f, 1.0f))

    /**
     * 101. Palo Alto
     */
    @JvmStatic
    fun paloAlto() = linear("Palo Alto", -150.0, intArrayOf(Color.parseColor("#16a085"), Color.parseColor("#f4d03f")), floatArrayOf(0.0f, 1.0f))

    /**
     * 102. Happy Memories
     */
    @JvmStatic
    fun happyMemories() = linear("Happy Memories", -150.0, intArrayOf(Color.parseColor("#ff5858"), Color.parseColor("#f09819")), floatArrayOf(0.0f, 1.0f))

    /**
     * 103. Midnight Bloom
     */
    @JvmStatic
    fun midnightBloom() = linear("Midnight Bloom", -110.0, intArrayOf(Color.parseColor("#2b5876"), Color.parseColor("#4e4376")), floatArrayOf(0.0f, 1.0f))

    /**
     * 104. Crystalline
     */
    @JvmStatic
    fun crystalline() = linear("Crystalline", -110.0, intArrayOf(Color.parseColor("#00cdac"), Color.parseColor("#8ddad5")), floatArrayOf(0.0f, 1.0f))

    /**
     * 106. Party Bliss
     */
    @JvmStatic
    fun partyBliss() = linear("Party Bliss", -90.0, intArrayOf(Color.parseColor("#4481eb"), Color.parseColor("#04befe")), floatArrayOf(0.0f, 1.0f))

    /**
     * 107. Confident Cloud
     */
    @JvmStatic
    fun confidentCloud() = linear("Confident Cloud", -90.0, intArrayOf(Color.parseColor("#dad4ec"), Color.parseColor("#dad4ec"), Color.parseColor("#f3e7e9")), floatArrayOf(0.0f, 0.01f, 1.0f))

    /**
     * 108. Le Cocktail
     */
    @JvmStatic
    fun leCocktail() = linear("Le Cocktail", -45.0, intArrayOf(Color.parseColor("#874da2"), Color.parseColor("#c43a30")), floatArrayOf(0.0f, 1.0f))

    /**
     * 109. River City
     */
    @JvmStatic
    fun riverCity() = linear("River City", -90.0, intArrayOf(Color.parseColor("#4481eb"), Color.parseColor("#04befe")), floatArrayOf(0.0f, 1.0f))

    /**
     * 110. Frozen Berry
     */
    @JvmStatic
    fun frozenBerry() = linear("Frozen Berry", -90.0, intArrayOf(Color.parseColor("#e8198b"), Color.parseColor("#c7eafd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 112. Child Care
     */
    @JvmStatic
    fun childCare() = linear("Child Care", -110.0, intArrayOf(Color.parseColor("#f794a4"), Color.parseColor("#fdd6bd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 113. Flying Lemon
     */
    @JvmStatic
    fun flyingLemon() = linear("Flying Lemon", -30.0, intArrayOf(Color.parseColor("#64b3f4"), Color.parseColor("#c2e59c")), floatArrayOf(0.0f, 1.0f))

    /**
     * 114. New Retrowave
     */
    @JvmStatic
    fun newRetrowave() = linear("New Retrowave", -90.0, intArrayOf(Color.parseColor("#3b41c5"), Color.parseColor("#a981bb"), Color.parseColor("#ffc8a9")), floatArrayOf(0.0f, 0.49f, 1.0f))

    /**
     * 115. Hidden Jaguar
     */
    @JvmStatic
    fun hiddenJaguar() = linear("Hidden Jaguar", -90.0, intArrayOf(Color.parseColor("#0fd850"), Color.parseColor("#f9f047")), floatArrayOf(0.0f, 1.0f))

    /**
     * 116. Above The Sky
     */
    @JvmStatic
    fun aboveTheSky() = linear("Above The Sky", -90.0, intArrayOf(Color.parseColor("lightgrey"), Color.parseColor("lightgrey"), Color.parseColor("#e0e0e0"), Color.parseColor("#efefef"), Color.parseColor("#d9d9d9"), Color.parseColor("#bcbcbc")), floatArrayOf(0.0f, 0.01f, 0.26f, 0.48f, 0.75f, 1.0f))

    /**
     * 117. Nega
     */
    @JvmStatic
    fun nega() = linear("Nega", -45.0, intArrayOf(Color.parseColor("#ee9ca7"), Color.parseColor("#ffdde1")), floatArrayOf(0.0f, 1.0f))

    /**
     * 118. Dense Water
     */
    @JvmStatic
    fun denseWater() = linear("Dense Water", 0.0, intArrayOf(Color.parseColor("#3ab5b0"), Color.parseColor("#3d99be"), Color.parseColor("#56317a")), floatArrayOf(0.0f, 0.31f, 1.0f))

    /**
     * 120. Seashore
     */
    @JvmStatic
    fun seashore() = linear("Seashore", -90.0, intArrayOf(Color.parseColor("#209cff"), Color.parseColor("#68e0cf")), floatArrayOf(0.0f, 1.0f))

    /**
     * 121. Marble Wall
     */
    @JvmStatic
    fun marbleWall() = linear("Marble Wall", -90.0, intArrayOf(Color.parseColor("#bdc2e8"), Color.parseColor("#bdc2e8"), Color.parseColor("#e6dee9")), floatArrayOf(0.0f, 0.01f, 1.0f))

    /**
     * 122. Cheerful Caramel
     */
    @JvmStatic
    fun cheerfulCaramel() = linear("Cheerful Caramel", -90.0, intArrayOf(Color.parseColor("#e6b980"), Color.parseColor("#eacda3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 123. Night Sky
     */
    @JvmStatic
    fun nightSky() = linear("Night Sky", -90.0, intArrayOf(Color.parseColor("#1e3c72"), Color.parseColor("#1e3c72"), Color.parseColor("#2a5298")), floatArrayOf(0.0f, 0.01f, 1.0f))

    /**
     * 124. Magic Lake
     */
    @JvmStatic
    fun magicLake() = linear("Magic Lake", -90.0, intArrayOf(Color.parseColor("#d5dee7"), Color.parseColor("#ffafbd"), Color.parseColor("#c9ffbf")), floatArrayOf(0.0f, 0.0f, 1.0f))

    /**
     * 125. Young Grass
     */
    @JvmStatic
    fun youngGrass() = linear("Young Grass", -90.0, intArrayOf(Color.parseColor("#9be15d"), Color.parseColor("#00e3ae")), floatArrayOf(0.0f, 1.0f))

    /**
     * 126. Colorful Peach
     */
    @JvmStatic
    fun colorfulPeach() = linear("Colorful Peach", 0.0, intArrayOf(Color.parseColor("#ed6ea0"), Color.parseColor("#ec8c69")), floatArrayOf(0.0f, 1.0f))

    /**
     * 127. Gentle Care
     */
    @JvmStatic
    fun gentleCare() = linear("Gentle Care", 0.0, intArrayOf(Color.parseColor("#ffc3a0"), Color.parseColor("#ffafbd")), floatArrayOf(0.0f, 1.0f))

    /**
     * 128. Plum Bath
     */
    @JvmStatic
    fun plumBath() = linear("Plum Bath", -90.0, intArrayOf(Color.parseColor("#cc208e"), Color.parseColor("#6713d2")), floatArrayOf(0.0f, 1.0f))

    /**
     * 129. Happy Unicorn
     */
    @JvmStatic
    fun happyUnicorn() = linear("Happy Unicorn", -90.0, intArrayOf(Color.parseColor("#b3ffab"), Color.parseColor("#12fff7")), floatArrayOf(0.0f, 1.0f))

    /**
     * 131. African Field
     */
    @JvmStatic
    fun africanField() = linear("African Field", -90.0, intArrayOf(Color.parseColor("#65bd60"), Color.parseColor("#5ac1a8"), Color.parseColor("#3ec6ed"), Color.parseColor("#b7ddb7"), Color.parseColor("#fef381")), floatArrayOf(0.0f, 0.25f, 0.5f, 0.75f, 1.0f))

    /**
     * 132. Solid Stone
     */
    @JvmStatic
    fun solidStone() = linear("Solid Stone", 0.0, intArrayOf(Color.parseColor("#243949"), Color.parseColor("#517fa4")), floatArrayOf(0.0f, 1.0f))

    /**
     * 133. Orange Juice
     */
    @JvmStatic
    fun orangeJuice() = linear("Orange Juice", -110.0, intArrayOf(Color.parseColor("#fc6076"), Color.parseColor("#ff9a44")), floatArrayOf(0.0f, 1.0f))

    /**
     * 134. Glass Water
     */
    @JvmStatic
    fun glassWater() = linear("Glass Water", -90.0, intArrayOf(Color.parseColor("#dfe9f3"), Color.parseColor("white")), floatArrayOf(0.0f, 1.0f))

    /**
     * 136. North Miracle
     */
    @JvmStatic
    fun northMiracle() = linear("North Miracle", 0.0, intArrayOf(Color.parseColor("#00dbde"), Color.parseColor("#fc00ff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 137. Fruit Blend
     */
    @JvmStatic
    fun fruitBlend() = linear("Fruit Blend", 0.0, intArrayOf(Color.parseColor("#f9d423"), Color.parseColor("#ff4e50")), floatArrayOf(0.0f, 1.0f))

    /**
     * 138. Millennium Pine
     */
    @JvmStatic
    fun millenniumPine() = linear("Millennium Pine", -90.0, intArrayOf(Color.parseColor("#50cc7f"), Color.parseColor("#f5d100")), floatArrayOf(0.0f, 1.0f))

    /**
     * 139. High Flight
     */
    @JvmStatic
    fun highFlight() = linear("High Flight", 0.0, intArrayOf(Color.parseColor("#0acffe"), Color.parseColor("#495aff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 140. Mole Hall
     */
    @JvmStatic
    fun moleHall() = linear("Mole Hall", -110.0, intArrayOf(Color.parseColor("#616161"), Color.parseColor("#9bc5c3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 142. Space Shift
     */
    @JvmStatic
    fun spaceShift() = linear("Space Shift", -30.0, intArrayOf(Color.parseColor("#3d3393"), Color.parseColor("#2b76b9"), Color.parseColor("#2cacd1"), Color.parseColor("#35eb93")), floatArrayOf(0.0f, 0.37f, 0.65f, 1.0f))

    /**
     * 143. Forest Inei
     */
    @JvmStatic
    fun forestInei() = linear("Forest Inei", -90.0, intArrayOf(Color.parseColor("#df89b5"), Color.parseColor("#bfd9fe")), floatArrayOf(0.0f, 1.0f))

    /**
     * 144. Royal Garden
     */
    @JvmStatic
    fun royalGarden() = linear("Royal Garden", 0.0, intArrayOf(Color.parseColor("#ed6ea0"), Color.parseColor("#ec8c69")), floatArrayOf(0.0f, 1.0f))

    /**
     * 145. Rich Metal
     */
    @JvmStatic
    fun richMetal() = linear("Rich Metal", 0.0, intArrayOf(Color.parseColor("#d7d2cc"), Color.parseColor("#304352")), floatArrayOf(0.0f, 1.0f))

    /**
     * 146. Juicy Cake
     */
    @JvmStatic
    fun juicyCake() = linear("Juicy Cake", -90.0, intArrayOf(Color.parseColor("#e14fad"), Color.parseColor("#f9d423")), floatArrayOf(0.0f, 1.0f))

    /**
     * 147. Smart Indigo
     */
    @JvmStatic
    fun smartIndigo() = linear("Smart Indigo", -90.0, intArrayOf(Color.parseColor("#b224ef"), Color.parseColor("#7579ff")), floatArrayOf(0.0f, 1.0f))

    /**
     * 148. Sand Strike
     */
    @JvmStatic
    fun sandStrike() = linear("Sand Strike", 0.0, intArrayOf(Color.parseColor("#c1c161"), Color.parseColor("#c1c161"), Color.parseColor("#d4d4b1")), floatArrayOf(0.0f, 0.0f, 1.0f))

    /**
     * 149. Norse Beauty
     */
    @JvmStatic
    fun norseBeauty() = linear("Norse Beauty", 0.0, intArrayOf(Color.parseColor("#ec77ab"), Color.parseColor("#7873f5")), floatArrayOf(0.0f, 1.0f))

    /**
     * 150. Aqua Guidance
     */
    @JvmStatic
    fun aquaGuidance() = linear("Aqua Guidance", -90.0, intArrayOf(Color.parseColor("#007adf"), Color.parseColor("#00ecbc")), floatArrayOf(0.0f, 1.0f))

    /**
     * 151. Sun Veggie
     */
    @JvmStatic
    fun sunVeggie() = linear("Sun Veggie", -315.0, intArrayOf(Color.parseColor("#20E2D7"), Color.parseColor("#F9FEA5")), floatArrayOf(0.0f, 1.0f))

    /**
     * 152. Sea Lord
     */
    @JvmStatic
    fun seaLord() = linear("Sea Lord", -315.0, intArrayOf(Color.parseColor("#2CD8D5"), Color.parseColor("#C5C1FF"), Color.parseColor("#FFBAC3")), floatArrayOf(0.0f, 0.56f, 1.0f))

    /**
     * 153. Black Sea
     */
    @JvmStatic
    fun blackSea() = linear("Black Sea", -315.0, intArrayOf(Color.parseColor("#2CD8D5"), Color.parseColor("#6B8DD6"), Color.parseColor("#8E37D7")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 154. Grass Shampoo
     */
    @JvmStatic
    fun grassShampoo() = linear("Grass Shampoo", -315.0, intArrayOf(Color.parseColor("#DFFFCD"), Color.parseColor("#90F9C4"), Color.parseColor("#39F3BB")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 155. Landing Aircraft
     */
    @JvmStatic
    fun landingAircraft() = linear("Landing Aircraft", -315.0, intArrayOf(Color.parseColor("#5D9FFF"), Color.parseColor("#B8DCFF"), Color.parseColor("#6BBBFF")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 156. Witch Dance
     */
    @JvmStatic
    fun witchDance() = linear("Witch Dance", -315.0, intArrayOf(Color.parseColor("#A8BFFF"), Color.parseColor("#884D80")), floatArrayOf(0.0f, 1.0f))

    /**
     * 157. Sleepless Night
     */
    @JvmStatic
    fun sleeplessNight() = linear("Sleepless Night", -315.0, intArrayOf(Color.parseColor("#5271C4"), Color.parseColor("#B19FFF"), Color.parseColor("#ECA1FE")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 158. Angel Care
     */
    @JvmStatic
    fun angelCare() = linear("Angel Care", -315.0, intArrayOf(Color.parseColor("#FFE29F"), Color.parseColor("#FFA99F"), Color.parseColor("#FF719A")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 159. Crystal River
     */
    @JvmStatic
    fun crystalRiver() = linear("Crystal River", -315.0, intArrayOf(Color.parseColor("#22E1FF"), Color.parseColor("#1D8FE1"), Color.parseColor("#625EB1")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 160. Soft Lipstick
     */
    @JvmStatic
    fun softLipstick() = linear("Soft Lipstick", -315.0, intArrayOf(Color.parseColor("#B6CEE8"), Color.parseColor("#F578DC")), floatArrayOf(0.0f, 1.0f))

    /**
     * 161. Salt Mountain
     */
    @JvmStatic
    fun saltMountain() = linear("Salt Mountain", -315.0, intArrayOf(Color.parseColor("#FFFEFF"), Color.parseColor("#D7FFFE")), floatArrayOf(0.0f, 1.0f))

    /**
     * 162. Perfect White
     */
    @JvmStatic
    fun perfectWhite() = linear("Perfect White", -315.0, intArrayOf(Color.parseColor("#E3FDF5"), Color.parseColor("#FFE6FA")), floatArrayOf(0.0f, 1.0f))

    /**
     * 163. Fresh Oasis
     */
    @JvmStatic
    fun freshOasis() = linear("Fresh Oasis", -315.0, intArrayOf(Color.parseColor("#7DE2FC"), Color.parseColor("#B9B6E5")), floatArrayOf(0.0f, 1.0f))

    /**
     * 164. Strict November
     */
    @JvmStatic
    fun strictNovember() = linear("Strict November", -315.0, intArrayOf(Color.parseColor("#CBBACC"), Color.parseColor("#2580B3")), floatArrayOf(0.0f, 1.0f))

    /**
     * 165. Morning Salad
     */
    @JvmStatic
    fun morningSalad() = linear("Morning Salad", -315.0, intArrayOf(Color.parseColor("#B7F8DB"), Color.parseColor("#50A7C2")), floatArrayOf(0.0f, 1.0f))

    /**
     * 166. Deep Relief
     */
    @JvmStatic
    fun deepRelief() = linear("Deep Relief", -315.0, intArrayOf(Color.parseColor("#7085B6"), Color.parseColor("#87A7D9"), Color.parseColor("#DEF3F8")), floatArrayOf(0.0f, 0.5f, 1.0f))

    /**
     * 167. Sea Strike
     */
    @JvmStatic
    fun seaStrike() = linear("Sea Strike", -315.0, intArrayOf(Color.parseColor("#77FFD2"), Color.parseColor("#6297DB"), Color.parseColor("#1EECFF")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 168. Night Call
     */
    @JvmStatic
    fun nightCall() = linear("Night Call", -315.0, intArrayOf(Color.parseColor("#AC32E4"), Color.parseColor("#7918F2"), Color.parseColor("#4801FF")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 169. Supreme Sky
     */
    @JvmStatic
    fun supremeSky() = linear("Supreme Sky", -315.0, intArrayOf(Color.parseColor("#D4FFEC"), Color.parseColor("#57F2CC"), Color.parseColor("#4596FB")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 170. Light Blue
     */
    @JvmStatic
    fun lightBlue() = linear("Light Blue", -315.0, intArrayOf(Color.parseColor("#9EFBD3"), Color.parseColor("#57E9F2"), Color.parseColor("#45D4FB")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 171. Mind Crawl
     */
    @JvmStatic
    fun mindCrawl() = linear("Mind Crawl", -315.0, intArrayOf(Color.parseColor("#473B7B"), Color.parseColor("#3584A7"), Color.parseColor("#30D2BE")), floatArrayOf(0.0f, 0.51f, 1.0f))

    /**
     * 172. Lily Meadow
     */
    @JvmStatic
    fun lilyMeadow() = linear("Lily Meadow", -315.0, intArrayOf(Color.parseColor("#65379B"), Color.parseColor("#886AEA"), Color.parseColor("#6457C6")), floatArrayOf(0.0f, 0.53f, 1.0f))

    /**
     * 173. Sugar Lollipop
     */
    @JvmStatic
    fun sugarLollipop() = linear("Sugar Lollipop", -315.0, intArrayOf(Color.parseColor("#A445B2"), Color.parseColor("#D41872"), Color.parseColor("#FF0066")), floatArrayOf(0.0f, 0.52f, 1.0f))

    /**
     * 174. Sweet Dessert
     */
    @JvmStatic
    fun sweetDessert() = linear("Sweet Dessert", -315.0, intArrayOf(Color.parseColor("#7742B2"), Color.parseColor("#F180FF"), Color.parseColor("#FD8BD9")), floatArrayOf(0.0f, 0.52f, 1.0f))

    /**
     * 175. Magic Ray
     */
    @JvmStatic
    fun magicRay() = linear("Magic Ray", -315.0, intArrayOf(Color.parseColor("#FF3CAC"), Color.parseColor("#562B7C"), Color.parseColor("#2B86C5")), floatArrayOf(0.0f, 0.52f, 1.0f))

    /**
     * 176. Teen Party
     */
    @JvmStatic
    fun teenParty() = linear("Teen Party", -315.0, intArrayOf(Color.parseColor("#FF057C"), Color.parseColor("#8D0B93"), Color.parseColor("#321575")), floatArrayOf(0.0f, 0.5f, 1.0f))

    /**
     * 177. Frozen Heat
     */
    @JvmStatic
    fun frozenHeat() = linear("Frozen Heat", -315.0, intArrayOf(Color.parseColor("#FF057C"), Color.parseColor("#7C64D5"), Color.parseColor("#4CC3FF")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 178. Gagarin View
     */
    @JvmStatic
    fun gagarinView() = linear("Gagarin View", -315.0, intArrayOf(Color.parseColor("#69EACB"), Color.parseColor("#EACCF8"), Color.parseColor("#6654F1")), floatArrayOf(0.0f, 0.48f, 1.0f))

    /**
     * 179. Fabled Sunset
     */
    @JvmStatic
    fun fabledSunset() = linear("Fabled Sunset", -315.0, intArrayOf(Color.parseColor("#231557"), Color.parseColor("#44107A"), Color.parseColor("#FF1361"), Color.parseColor("#FFF800")), floatArrayOf(0.0f, 0.29f, 0.67f, 1.0f))

    /**
     * 180. Perfect Blue
     */
    @JvmStatic
    fun perfectBlue() = linear("Perfect Blue", -315.0, intArrayOf(Color.parseColor("#3D4E81"), Color.parseColor("#5753C9"), Color.parseColor("#6E7FF3")), floatArrayOf(0.0f, 0.48f, 1.0f))

    @JvmStatic
    fun names() = listOf("Warm Flame", "Night Fade", "Spring Warmth", "Juicy Peach", "Young Passion", "Lady Lips", "Sunny Morning", "Rainy Ashville", "Frozen Dreams", "Winter Neva", "Dusty Grass", "Tempting Azure", "Heavy Rain", "Amy Crisp", "Mean Fruit", "Deep Blue", "Ripe Malinka", "Cloudy Knoxville", "Malibu Beach", "New Life", "True Sunset", "Morpheus Den", "Rare Wind", "Near Moon", "Wild Apple", "Saint Petersburg", "Plum Plate", "Everlasting Sky", "Happy Fisher", "Blessing", "Sharpeye Eagle", "Ladoga Bottom", "Lemon Gate", "Itmeo Branding", "Zeus Miracle", "Old Hat", "Star Wine", "Happy Acid", "Awesome Pine", "New York", "Shy Rainbow", "Mixed Hopes", "Fly High", "Strong Bliss", "Fresh Milk", "Snow Again", "February Ink", "Kind Steel", "Soft Grass", "Grown Early", "Sharp Blues", "Shady Water", "Dirty Beauty", "Great Whale", "Teen Notebook", "Polite Rumors", "Sweet Period", "Wide Matrix", "Soft Cherish", "Red Salvation", "Burning Spring", "Night Party", "Sky Glider", "Heaven Peach", "Purple Division", "Aqua Splash", "Spiky Naga", "Love Kiss", "Clean Mirror", "Premium Dark", "Cold Evening", "Cochiti Lake", "Summer Games", "Passionate Bed", "Mountain Rock", "Desert Hump", "Jungle Day", "Phoenix Start", "October Silence", "Faraway River", "Alchemist Lab", "Over Sun", "Premium White", "Mars Party", "Eternal Constance", "Japan Blush", "Smiling Rain", "Cloudy Apple", "Big Mango", "Healthy Water", "Amour Amour", "Risky Concrete", "Strong Stick", "Vicious Stance", "Palo Alto", "Happy Memories", "Midnight Bloom", "Crystalline", "Party Bliss", "Confident Cloud", "Le Cocktail", "River City", "Frozen Berry", "Child Care", "Flying Lemon", "New Retrowave", "Hidden Jaguar", "Above The Sky", "Nega", "Dense Water", "Seashore", "Marble Wall", "Cheerful Caramel", "Night Sky", "Magic Lake", "Young Grass", "Colorful Peach", "Gentle Care", "Plum Bath", "Happy Unicorn", "African Field", "Solid Stone", "Orange Juice", "Glass Water", "North Miracle", "Fruit Blend", "Millennium Pine", "High Flight", "Mole Hall", "Space Shift", "Forest Inei", "Royal Garden", "Rich Metal", "Juicy Cake", "Smart Indigo", "Sand Strike", "Norse Beauty", "Aqua Guidance", "Sun Veggie", "Sea Lord", "Black Sea", "Grass Shampoo", "Landing Aircraft", "Witch Dance", "Sleepless Night", "Angel Care", "Crystal River", "Soft Lipstick", "Salt Mountain", "Perfect White", "Fresh Oasis", "Strict November", "Morning Salad", "Deep Relief", "Sea Strike", "Night Call", "Supreme Sky", "Light Blue", "Mind Crawl", "Lily Meadow", "Sugar Lollipop", "Sweet Dessert", "Magic Ray", "Teen Party", "Frozen Heat", "Gagarin View", "Fabled Sunset", "Perfect Blue")

    @JvmStatic
    fun find(name: String): WebGradientDrawable? =
            when (name) {
                "Warm Flame" -> warmFlame()
                "Night Fade" -> nightFade()
                "Spring Warmth" -> springWarmth()
                "Juicy Peach" -> juicyPeach()
                "Young Passion" -> youngPassion()
                "Lady Lips" -> ladyLips()
                "Sunny Morning" -> sunnyMorning()
                "Rainy Ashville" -> rainyAshville()
                "Frozen Dreams" -> frozenDreams()
                "Winter Neva" -> winterNeva()
                "Dusty Grass" -> dustyGrass()
                "Tempting Azure" -> temptingAzure()
                "Heavy Rain" -> heavyRain()
                "Amy Crisp" -> amyCrisp()
                "Mean Fruit" -> meanFruit()
                "Deep Blue" -> deepBlue2()
                "Ripe Malinka" -> ripeMalinka()
                "Cloudy Knoxville" -> cloudyKnoxville()
                "Malibu Beach" -> malibuBeach()
                "New Life" -> newLife()
                "True Sunset" -> trueSunset()
                "Morpheus Den" -> morpheusDen()
                "Rare Wind" -> rareWind()
                "Near Moon" -> nearMoon()
                "Wild Apple" -> wildApple()
                "Saint Petersburg" -> saintPetersburg()
                "Plum Plate" -> plumPlate()
                "Everlasting Sky" -> everlastingSky()
                "Happy Fisher" -> happyFisher()
                "Blessing" -> blessing()
                "Sharpeye Eagle" -> sharpeyeEagle()
                "Ladoga Bottom" -> ladogaBottom()
                "Lemon Gate" -> lemonGate()
                "Itmeo Branding" -> itmeoBranding()
                "Zeus Miracle" -> zeusMiracle()
                "Old Hat" -> oldHat()
                "Star Wine" -> starWine()
                "Happy Acid" -> happyAcid()
                "Awesome Pine" -> awesomePine()
                "New York" -> newYork()
                "Shy Rainbow" -> shyRainbow()
                "Mixed Hopes" -> mixedHopes()
                "Fly High" -> flyHigh()
                "Strong Bliss" -> strongBliss()
                "Fresh Milk" -> freshMilk()
                "Snow Again" -> snowAgain()
                "February Ink" -> februaryInk()
                "Kind Steel" -> kindSteel()
                "Soft Grass" -> softGrass()
                "Grown Early" -> grownEarly()
                "Sharp Blues" -> sharpBlues()
                "Shady Water" -> shadyWater()
                "Dirty Beauty" -> dirtyBeauty()
                "Great Whale" -> greatWhale()
                "Teen Notebook" -> teenNotebook()
                "Polite Rumors" -> politeRumors()
                "Sweet Period" -> sweetPeriod()
                "Wide Matrix" -> wideMatrix()
                "Soft Cherish" -> softCherish()
                "Red Salvation" -> redSalvation()
                "Burning Spring" -> burningSpring()
                "Night Party" -> nightParty()
                "Sky Glider" -> skyGlider()
                "Heaven Peach" -> heavenPeach()
                "Purple Division" -> purpleDivision()
                "Aqua Splash" -> aquaSplash()
                "Spiky Naga" -> spikyNaga()
                "Love Kiss" -> loveKiss()
                "Clean Mirror" -> cleanMirror()
                "Premium Dark" -> premiumDark()
                "Cold Evening" -> coldEvening()
                "Cochiti Lake" -> cochitiLake()
                "Summer Games" -> summerGames()
                "Passionate Bed" -> passionateBed()
                "Mountain Rock" -> mountainRock()
                "Desert Hump" -> desertHump()
                "Jungle Day" -> jungleDay()
                "Phoenix Start" -> phoenixStart()
                "October Silence" -> octoberSilence()
                "Faraway River" -> farawayRiver()
                "Alchemist Lab" -> alchemistLab()
                "Over Sun" -> overSun()
                "Premium White" -> premiumWhite()
                "Mars Party" -> marsParty()
                "Eternal Constance" -> eternalConstance()
                "Japan Blush" -> japanBlush()
                "Smiling Rain" -> smilingRain()
                "Cloudy Apple" -> cloudyApple()
                "Big Mango" -> bigMango()
                "Healthy Water" -> healthyWater()
                "Amour Amour" -> amourAmour()
                "Risky Concrete" -> riskyConcrete()
                "Strong Stick" -> strongStick()
                "Vicious Stance" -> viciousStance()
                "Palo Alto" -> paloAlto()
                "Happy Memories" -> happyMemories()
                "Midnight Bloom" -> midnightBloom()
                "Crystalline" -> crystalline()
                "Party Bliss" -> partyBliss()
                "Confident Cloud" -> confidentCloud()
                "Le Cocktail" -> leCocktail()
                "River City" -> riverCity()
                "Frozen Berry" -> frozenBerry()
                "Child Care" -> childCare()
                "Flying Lemon" -> flyingLemon()
                "New Retrowave" -> newRetrowave()
                "Hidden Jaguar" -> hiddenJaguar()
                "Above The Sky" -> aboveTheSky()
                "Nega" -> nega()
                "Dense Water" -> denseWater()
                "Seashore" -> seashore()
                "Marble Wall" -> marbleWall()
                "Cheerful Caramel" -> cheerfulCaramel()
                "Night Sky" -> nightSky()
                "Magic Lake" -> magicLake()
                "Young Grass" -> youngGrass()
                "Colorful Peach" -> colorfulPeach()
                "Gentle Care" -> gentleCare()
                "Plum Bath" -> plumBath()
                "Happy Unicorn" -> happyUnicorn()
                "African Field" -> africanField()
                "Solid Stone" -> solidStone()
                "Orange Juice" -> orangeJuice()
                "Glass Water" -> glassWater()
                "North Miracle" -> northMiracle()
                "Fruit Blend" -> fruitBlend()
                "Millennium Pine" -> millenniumPine()
                "High Flight" -> highFlight()
                "Mole Hall" -> moleHall()
                "Space Shift" -> spaceShift()
                "Forest Inei" -> forestInei()
                "Royal Garden" -> royalGarden()
                "Rich Metal" -> richMetal()
                "Juicy Cake" -> juicyCake()
                "Smart Indigo" -> smartIndigo()
                "Sand Strike" -> sandStrike()
                "Norse Beauty" -> norseBeauty()
                "Aqua Guidance" -> aquaGuidance()
                "Sun Veggie" -> sunVeggie()
                "Sea Lord" -> seaLord()
                "Black Sea" -> blackSea()
                "Grass Shampoo" -> grassShampoo()
                "Landing Aircraft" -> landingAircraft()
                "Witch Dance" -> witchDance()
                "Sleepless Night" -> sleeplessNight()
                "Angel Care" -> angelCare()
                "Crystal River" -> crystalRiver()
                "Soft Lipstick" -> softLipstick()
                "Salt Mountain" -> saltMountain()
                "Perfect White" -> perfectWhite()
                "Fresh Oasis" -> freshOasis()
                "Strict November" -> strictNovember()
                "Morning Salad" -> morningSalad()
                "Deep Relief" -> deepRelief()
                "Sea Strike" -> seaStrike()
                "Night Call" -> nightCall()
                "Supreme Sky" -> supremeSky()
                "Light Blue" -> lightBlue()
                "Mind Crawl" -> mindCrawl()
                "Lily Meadow" -> lilyMeadow()
                "Sugar Lollipop" -> sugarLollipop()
                "Sweet Dessert" -> sweetDessert()
                "Magic Ray" -> magicRay()
                "Teen Party" -> teenParty()
                "Frozen Heat" -> frozenHeat()
                "Gagarin View" -> gagarinView()
                "Fabled Sunset" -> fabledSunset()
                "Perfect Blue" -> perfectBlue()
                else -> null
            }


    //</editor-fold>
}


