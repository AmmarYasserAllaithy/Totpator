package com.ammaryasser.totpator.data.sources.account

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ammaryasser.totpator.data.models.Account
import kotlinx.coroutines.flow.Flow


@Dao
interface AccountsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(account: Account)

    @Delete
    suspend fun delete(account: Account)

    @Query("SELECT * FROM accounts WHERE id = :id")
    fun getById(id: Int): Flow<Account>

    @Query("SELECT * FROM accounts")
    fun getAll(): Flow<List<Account>>

}