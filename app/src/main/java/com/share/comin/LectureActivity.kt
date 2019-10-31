package com.share.comin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.share.comin.Adapter.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture.*
import kotlinx.android.synthetic.main.tablayout_item.view.*

class LectureActivity : AppCompatActivity(R.layout.activity_lecture) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list_viewpager.adapter = FragmentAdapter(supportFragmentManager)

        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("AI")))

        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("CSS")))
        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("HTML")))
        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("ID")))
        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("JPG")))
        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("JS")))
        tablayout.addTab(tablayout.newTab().setCustomView(creatTabView("MP4")))

        list_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tablayout))

        tablayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                list_viewpager.currentItem = tab!!.position
            }

        })

    }

    private fun creatTabView(tabName: String) : View {
        val tabView = LayoutInflater.from(baseContext).inflate(R.layout.tablayout_item, null)

        tabView.tablayout_item_title.text = tabName
        return tabView
    }
}
