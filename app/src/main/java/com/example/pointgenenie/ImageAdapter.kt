package com.example.pointgenenie

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val context: Context, private val imageList: List<Int>) : BaseAdapter() {
    override fun getCount(): Int = imageList.size

    override fun getItem(position: Int): Any = imageList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val imageView = ImageView(context)
        imageView.setImageResource(imageList[position])
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.layoutParams = AbsListView.LayoutParams(300, 300) // Set desired width and height
        return imageView
    }
}
