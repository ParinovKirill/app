package com.example.parinovkirill.Presentation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.parinovkirill.R


class GenderSelectFragment : Fragment() {

    private lateinit var navController: NavController
    private lateinit var context: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navController = findNavController()
        context = requireContext()
        return inflater.inflate(R.layout.fragment_gender_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonNext = view.findViewById<Button>(R.id.buttonNext)
        val buttonGenderMale = view.findViewById<Button>(R.id.buttonGenderMale)
        val buttonGenderFemale = view.findViewById<Button>(R.id.buttonGenderFemale)

        buttonGenderFemale.setOnClickListener {
            setButtonFemaleFocus(buttonGenderFemale, buttonGenderMale)

        }

        buttonGenderMale.setOnClickListener {
            setButtonMaleFocus(buttonGenderMale, buttonGenderFemale)

        }


        buttonNext.setOnClickListener {
            navController.navigate(R.id.action_genderSelectFragment_to_userStatsSelectFragment)
        }
    }

    private fun setButtonMaleFocus(
        buttonGenderMale: Button,
        buttonGenderFemale: Button
    ) {
        buttonGenderMale.setBackgroundColor(ContextCompat.getColor(context, R.color.main))
        buttonGenderMale.setTextColor(ContextCompat.getColor(context, R.color.white))
        buttonGenderFemale.setBackgroundColor(ContextCompat.getColor(context, R.color.white))
        buttonGenderFemale.setTextColor(ContextCompat.getColor(context, R.color.mainDark))
    }

    private fun setButtonFemaleFocus(
        buttonGenderFemale: Button,
        buttonGenderMale: Button
    ) {
        buttonGenderFemale.setBackgroundColor(ContextCompat.getColor(context, R.color.main))
        buttonGenderFemale.setTextColor(ContextCompat.getColor(context, R.color.white))
        buttonGenderMale.setBackgroundColor(ContextCompat.getColor(context, R.color.white))
        buttonGenderMale.setTextColor(ContextCompat.getColor(context, R.color.mainDark))
    }

    companion object {

        @JvmStatic
        fun newInstance() = GenderSelectFragment()
    }
}