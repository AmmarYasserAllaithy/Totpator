package com.ammaryasser.totpator.repository

import android.content.Context
import com.ammaryasser.totpator.data.account.Account
import com.ammaryasser.totpator.data.account.AccountDao
import com.ammaryasser.totpator.data.account.AccountDatabase
import kotlinx.coroutines.flow.Flow


class AccountRepository(private val accountDao: AccountDao) {

    suspend fun insertOrUpdateAccount(account: Account) = accountDao.insertOrUpdate(account)

    suspend fun deleteAccount(account: Account) = accountDao.delete(account)

    fun getAccountById(id: Int): Flow<Account> = accountDao.getById(id)

    fun getAllAccounts(): Flow<List<Account>> = accountDao.getAll()


    companion object {
        private var repo: AccountRepository? = null

        fun build(context: Context): AccountRepository {
            return repo ?: synchronized(this) {
                AccountRepository(AccountDatabase.getDatabase(context).accountDao())
                    .also { repo = it }
            }
        }
    }

}