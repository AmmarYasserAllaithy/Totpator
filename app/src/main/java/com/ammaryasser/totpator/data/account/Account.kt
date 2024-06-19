package com.ammaryasser.totpator.data.account

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "accounts")
data class Account(

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var issuer: String,
    var username: String = "",
    var key: String,
    var notes: String = "",
    var createdAt: Long = System.currentTimeMillis()

) : Serializable