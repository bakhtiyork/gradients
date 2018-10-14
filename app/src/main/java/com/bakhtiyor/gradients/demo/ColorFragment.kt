package com.bakhtiyor.gradients.demo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bakhtiyor.gradients.Gradients
import com.bakhtiyor.gradients.WebGradientDrawable


class ColorFragment : Fragment() {
    private val ARG_PARAM_COLOR = "color"
    private var colorName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            colorName = it.getString(ARG_PARAM_COLOR)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        colorName?.let {
            val gradientDrawable: WebGradientDrawable? = Gradients.find(it)
            if (gradientDrawable != null) {
                view.background = gradientDrawable
                view.setOnClickListener { fragmentManager?.popBackStack() }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(color: String) =
                ColorFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM_COLOR, color)
                    }
                }
    }
}
