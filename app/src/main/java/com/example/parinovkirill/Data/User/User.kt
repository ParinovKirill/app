package com.example.parinovkirill.Data.User

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo("gender")
    val gender: String? = null,
    @ColumnInfo("height")
    val height: Int? = null,
    @ColumnInfo("weight")
    val weight: Float? = null,
    @ColumnInfo("imt")
    val tmi: Float? = null,
    @ColumnInfo("calories")
    val calories: Float? = null,
    )