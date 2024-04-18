package com.example.parinovkirill.Data.Database

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.parinovkirill.Data.User.User
import com.example.parinovkirill.Domain.DaoDb

@Database(entities = [User::class], version = 1)
abstract class MainDb : RoomDatabase() {
    abstract fun getDao(): DaoDb
    companion object {
        fun getDb(context: Context): MainDb {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDb::class.java,
                "Main.db"
            ).build()
        }
    }
}