package com.innovapp.demoavan.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) var id: Int,
    val name: String,
    val lastName: String,
    val email: String,
    val pass: String
)