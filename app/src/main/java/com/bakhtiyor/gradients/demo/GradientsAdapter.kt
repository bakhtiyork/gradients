package com.bakhtiyor.gradients.demo

import android.graphics.drawable.shapes.OvalShape
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bakhtiyor.gradients.Gradients
import java.lang.ref.WeakReference


class GradientsAdapter(onClickListener: View.OnClickListener) : RecyclerView.Adapter<GradientsAdapter.ViewHolder>() {
    private val items = Gradients.names()
    private var refListener: WeakReference<View.OnClickListener> = WeakReference(onClickListener)

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.view_item, parent, false)
        return ViewHolder(view, refListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = items[position]
        val drawable = Gradients.find(item)?.apply { shape = OvalShape() }
        viewHolder.apply {
            text.text = item
            view.background = drawable
            view.tag = item
        }

    }

    class ViewHolder(v: View, refListener: WeakReference<View.OnClickListener>) : RecyclerView.ViewHolder(v) {
        val text: TextView = v.findViewById(R.id.text)
        val view: View = v.findViewById(R.id.view)

        init {
            view.setOnClickListener { view ->
                val listener = refListener.get()
                listener?.let { listener.onClick(view) }
            }
        }
    }
}