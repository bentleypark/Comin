package com.share.comin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewpager_item.view.*

class ViewPager2Adaper(private val context: Context) : RecyclerView.Adapter<PagerVH>() {

    private val image = arrayOf(
        R.drawable.html,
        R.drawable.ai,
        R.drawable.css,
        R.drawable.html,
        R.drawable.ai
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item, parent, false))


    override fun getItemCount(): Int = image.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) =
        holder.itemView.run {
            iv_viewpager_item.setImageResource(image[position])
        }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
}
