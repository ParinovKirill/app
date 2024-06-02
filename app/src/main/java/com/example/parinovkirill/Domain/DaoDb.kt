package com.example.parinovkirill.Domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.parinovkirill.Data.User.User

@Dao
interface DaoDb {
    @Insert
    fun insertUser(user: User)

    @Query("SELECT * FROM user")
    fun getUser(): User
}