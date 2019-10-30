package com.share.comin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.share.comin.databinding.ViewpagerItemBinding

class ViewPagerAdapter(private val context: Context) : PagerAdapter() {

    private val image = arrayOf(
        R.drawable.html,
        R.drawable.ai,
        R.drawable.css,
        R.drawable.html,
        R.drawable.ai
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

        container.addView(binding.root)

        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}