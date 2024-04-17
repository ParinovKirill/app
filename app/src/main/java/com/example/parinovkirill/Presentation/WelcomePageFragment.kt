package com.example.parinovkirill.Presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.parinovkirill.R

class WelcomePageFragment : Fragment() {

    private lateinit var binding: ViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome_page, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = WelcomePageFragment()
    }
}