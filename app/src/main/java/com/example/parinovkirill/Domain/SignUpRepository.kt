package com.example.parinovkirill.Domain

import android.content.Context
import com.example.parinovkirill.Data.User.User

interface SignUpRepository {

    suspend fun insertUser(user: User, context: Context)

}