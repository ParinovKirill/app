package com.example.parinovkirill.Presentation.Welcome

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.parinovkirill.Data.User.User
import com.example.parinovkirill.Domain.InsertUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val insertUserUseCase: InsertUserUseCase
) : ViewModel() {

    private var user = User()

    fun setUser(user: User) {
        this.user = user
    }

    fun getUser(): User {
        return user
    }

    fun insertUser(user: User, context: Context) {
        viewModelScope.launch {
            insertUserUseCase.insertUser(user, context)
        }
    }
}