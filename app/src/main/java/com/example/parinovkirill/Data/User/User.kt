package com.example.parinovkirill.Data.User

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo("gender")
    val gender: String,
    @ColumnInfo("height")
    val height: Int,
    @ColumnInfo("weight")
    val weight: Float,
    @ColumnInfo("imt")
    val tmi: Float,
    @ColumnInfo("calories")
    val calories: Float,
    )