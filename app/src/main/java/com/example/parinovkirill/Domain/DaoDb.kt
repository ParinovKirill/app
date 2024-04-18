package com.example.parinovkirill.Domain

import androidx.room.Dao
import androidx.room.Insert
import com.example.parinovkirill.Data.User.User

@Dao
interface DaoDb {
    @Insert
    fun insertUser(user: User)
}