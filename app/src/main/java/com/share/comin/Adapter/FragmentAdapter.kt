package com.share.comin.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.share.comin.Fragment.FirstFragment
import com.share.comin.Fragment.SecondFragment
import com.share.comin.Fragment.ThirdFragment

class FragmentAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }

    override fun getCount(): Int {
        return 3
    }

}