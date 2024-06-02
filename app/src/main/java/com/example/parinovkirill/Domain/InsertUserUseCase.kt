package com.example.parinovkirill.Domain

import android.content.Context
import android.util.Log
import com.example.parinovkirill.Data.Database.SignUpRepositoryImpl
import com.example.parinovkirill.Data.User.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InsertUserUseCase @Inject constructor(private val repository: SignUpRepositoryImpl) {

    suspend fun insertUser(user: User, context: Context) {
        repository.insertUser(user, context)
    }
}