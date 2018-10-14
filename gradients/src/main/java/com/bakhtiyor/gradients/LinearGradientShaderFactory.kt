package com.bakhtiyor.gradients

import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.ShapeDrawable

/**
 * Linear
 */
class LinearGradientShaderFactory(val angle: Double, val colors: IntArray, val positions: FloatArray): ShapeDrawable.ShaderFactory() {
    override fun resize(width: Int, height: Int): Shader {
        val radians = Math.toRadians(angle)
        val hyp = Math.sqrt((width*width + height*height).toDouble())

        var startX = 0f
        var startY = 0f
        var endX = (Math.cos(radians) * hyp).toFloat()
        var endY = (Math.sin(radians) * hyp).toFloat()

        if (endX < 0) {
            startX = width.toFloat()
            endX = width.toFloat() + endX
        }
        if (endY < 0) {
            startY = height.toFloat()
            endY = height.toFloat() + endY
        }

        return LinearGradient(startX, startY, endX, endY, colors, positions, Shader.TileMode.REPEAT)
    }

}