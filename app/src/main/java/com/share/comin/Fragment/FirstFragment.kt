package com.share.comin.Fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.share.comin.Adapter.FirstFragmentAdapter
import com.share.comin.Model.ListContet
import com.share.comin.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_first, container, false)

        val list_array = arrayListOf<ListContet>(

            ListContet("a", "b", 1, "c"),
            ListContet("d", "e", 1, "f")
        )

        val adapter = FirstFragmentAdapter(requireContext(), list_array)
        view.lv_first_fragment.adapter = adapter


        return view
    }


}
