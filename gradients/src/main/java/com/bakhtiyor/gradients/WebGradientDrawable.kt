package com.bakhtiyor.gradients

import android.annotation.TargetApi
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Rect
import android.graphics.Region
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.graphics.drawable.shapes.Shape
import android.os.Build

/**
 * Delegate drawable class to hide internal implementation
 */
class WebGradientDrawable(val name: String, shaderFactory: ShapeDrawable.ShaderFactory) : Drawable() {
    protected val delegate: ShapeDrawable = ShapeDrawable()

    var shape: Shape
        get() = delegate.shape
        set(value) { delegate.shape = value }

    init {
        delegate.shape = RectShape()
        delegate.shaderFactory = shaderFactory
    }

    override fun draw(canvas: Canvas) {
        delegate.draw(canvas)
    }

    override fun setAlpha(alpha: Int) {
        delegate.alpha = alpha
    }

    override fun getOpacity(): Int {
        return delegate.opacity
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        delegate.colorFilter = colorFilter
    }

    override fun setChangingConfigurations(configs: Int) {
        delegate.changingConfigurations = configs
    }

    override fun setState(stateSet: IntArray): Boolean {
        return delegate.setState(stateSet)
    }

    override fun getCallback(): Callback? {
        return delegate.callback
    }

    override fun getMinimumWidth(): Int {
        return delegate.minimumWidth
    }

    override fun getCurrent(): Drawable {
        return delegate
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun getDirtyBounds(): Rect {
        return delegate.dirtyBounds
    }

    override fun setVisible(visible: Boolean, restart: Boolean): Boolean {
        return delegate.setVisible(visible, restart)
    }

    override fun setFilterBitmap(filter: Boolean) {
        delegate.isFilterBitmap = filter
    }

    override fun mutate(): Drawable {
        return delegate.mutate()
    }

    override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
        delegate.setBounds(left, top, right, bottom)
    }

    override fun setBounds(bounds: Rect) {
        delegate.setBounds(bounds)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun setHotspot(x: Float, y: Float) {
        delegate.setHotspot(x, y)
    }

    override fun getIntrinsicHeight(): Int {
        return delegate.getIntrinsicHeight()
    }

    override fun isStateful(): Boolean {
        return delegate.isStateful
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun setHotspotBounds(left: Int, top: Int, right: Int, bottom: Int) {
        delegate.setHotspotBounds(left, top, right, bottom)
    }

    override fun getTransparentRegion(): Region? {
        return delegate.transparentRegion
    }

    override fun getConstantState(): ConstantState? {
        return delegate.constantState
    }

    override fun getPadding(padding: Rect): Boolean {
        return delegate.getPadding(padding)
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    override fun isAutoMirrored(): Boolean {
        return delegate.isAutoMirrored
    }
}