package com.share.comin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.share.comin.databinding.GridviewItemBinding

class GridviewAdapter (val context: Context) : BaseAdapter(){

    private val img_list = arrayOf(
        R.drawable.ai,
        R.drawable.css,
        R.drawable.html,
        R.drawable.id,
        R.drawable.jpg,
        R.drawable.js,
        R.drawable.mp4,
        R.drawable.pdf,
        R.drawable.png,
        R.drawable.profile,
        R.drawable.tiff,
        R.drawable.write_button
    )

    private val text_list = arrayOf(
        "ai", "css", "html", "id", "jpg", "js", "mp4", "pdf", "png", "profile", "tiff", "write_button"
    )



    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val binding = GridviewItemBinding.inflate(LayoutInflater.from(context), p2, false)
        binding.ivGridviewImg.setImageResource(img_list[p0])
        binding.tvGrdiviewTxt.text = text_list[p0]

        return binding.root
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return img_list.size
    }

}