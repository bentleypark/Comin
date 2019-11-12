package com.share.comin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.share.comin.Model.ListContet
import com.share.comin.R

class FirstFragmentAdapter(val context: Context, val list: ArrayList<ListContet>) : BaseAdapter() {
    override fun getView(position: Int, contentView: View?, parent: ViewGroup?): View {

        val view: View
        val holder: ViewHolder

        if (contentView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, null)
            holder = ViewHolder()

            holder.iv = view.findViewById(R.id.iv_item_img)
            holder.tv1 = view.findViewById(R.id.tv_item_title)
            holder.tv2 = view.findViewById(R.id.tv_item_review)
            holder.tv3 = view.findViewById(R.id.tv_item_classification)

            view.tag = holder
        }
        else {
            holder = contentView.tag as ViewHolder
            view = contentView
        }

        val item = list[position]
        holder.tv1?.text = item.title

        return view
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list.size
    }

    private class ViewHolder {

        var iv: ImageView? = null
        var tv1: TextView? = null
        var tv2: TextView? = null
        var tv3: TextView? = null

    }

}