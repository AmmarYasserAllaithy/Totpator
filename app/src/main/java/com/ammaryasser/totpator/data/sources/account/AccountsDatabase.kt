package com.ammaryasser.totpator.data.sources.account

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ammaryasser.totpator.data.models.Account


@Database(
    entities = [Account::class],
    version = 2,
    exportSchema = false
)
abstract class AccountsDatabase : RoomDatabase() {

    abstract fun accountDao(): AccountsDao

    companion object {
        @Volatile
        private var Instance: AccountsDatabase? = null

        fun getDatabase(context: Context): AccountsDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, AccountsDatabase::class.java, "totpator")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}