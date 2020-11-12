package com.bakhtiyor.gradients.demo


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = GradientsAdapter(this)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = GridLayoutManager(view.context, columnsCount(activity))
    }

    override fun onClick(v: View?) {
        v?.tag?.let { tag ->
            val colorName = tag as String
            showColor(colorName)
        }
    }

    private fun showColor(colorName: String) {
        val fragment = ColorFragment.newInstance(colorName)
        fragmentManager?.run {
            beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out,
                            android.R.anim.fade_in, android.R.anim.fade_out)
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit()
        }
    }

    fun columnsCount(context: Context?): Int {
        val colWidth = resources.getDimensionPixelSize(R.dimen.colon_width)
        val displayWidth = context?.resources?.displayMetrics?.widthPixels
        val cols = if (displayWidth != null) displayWidth / colWidth else 3
        return cols
    }
}
