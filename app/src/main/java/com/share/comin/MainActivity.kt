package com.share.comin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.share.comin.Adapter.GridviewAdapter
import com.share.comin.Adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewpager.adapter = ViewPagerAdapter(this)

        gridview.adapter = GridviewAdapter(this)
        gridview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, LectureActivity::class.java)
            startActivity(intent)
        }
    }

}
