package com.example.parinovkirill.Presentation.Welcome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.example.parinovkirill.Presentation.Home.HomeActivity
import com.example.parinovkirill.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton


@AndroidEntryPoint
class UserStatsSelectFragment : Fragment() {

    private val viewModel: SignUpViewModel by viewModels({ requireActivity() })

    private lateinit var edHeight: EditText
    private lateinit var edWeight: EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_stats_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonNext = view.findViewById<Button>(R.id.buttonNext)
        edHeight = view.findViewById(R.id.edHeight)
        edWeight = view.findViewById(R.id.edWeight)

        buttonNext.setOnClickListener {
            val weight = edWeight.text.toString().toFloat()
            val height = edHeight.text.toString().toInt()

            val user = viewModel.getUser()
            val newUser = user.copy(weight = weight, height = height)

            viewModel.setUser(newUser)
            viewModel.insertUser(newUser, requireContext())

            val intent = Intent(context, HomeActivity::class.java)
            startActivity(intent)
        }

    }

    companion object {

        @JvmStatic
        fun newInstance() = UserStatsSelectFragment()
    }
}