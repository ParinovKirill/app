package com.example.parinovkirill.Presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parinovkirill.R


class GenderSelectFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gender_select, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = GenderSelectFragment()
    }
}