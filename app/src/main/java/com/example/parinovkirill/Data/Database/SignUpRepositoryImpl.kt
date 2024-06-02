package com.example.parinovkirill.Data.Database

import android.content.Context
import android.util.Log
import com.example.parinovkirill.Data.User.User
import com.example.parinovkirill.Domain.SignUpRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Singleton

@Singleton
object SignUpRepositoryImpl : SignUpRepository {

    override suspend fun insertUser(user: User, context: Context) {
        withContext(Dispatchers.IO) {
            val db = MainDb.getDb(context).getDao()
            db.insertUser(user)
        }
    }
}