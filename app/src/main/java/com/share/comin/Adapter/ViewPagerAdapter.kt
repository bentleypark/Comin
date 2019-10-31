package com.share.comin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.share.comin.databinding.ViewpagerItemBinding


class ViewPagerAdapter(private val context: Context) : PagerAdapter() {


    private val image = arrayOf(
        com.share.comin.R.drawable.ai,
        com.share.comin.R.drawable.css,
        com.share.comin.R.drawable.html
    )

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return image.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = ViewpagerItemBinding.inflate(LayoutInflater.from(context), container, false)
        binding.ivViewpagerItem.setImageResource(image[position])

        container.addView(binding.root, 0)

        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}