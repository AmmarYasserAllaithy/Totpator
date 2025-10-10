package com.ammaryasser.totpator.data.repos

import android.content.Context
import com.ammaryasser.totpator.data.models.Account
import com.ammaryasser.totpator.data.sources.account.AccountsDao
import com.ammaryasser.totpator.data.sources.account.AccountsDatabase
import kotlinx.coroutines.flow.Flow


class AccountsRepo(private val accountsDao: AccountsDao) {

    suspend fun insertOrUpdateAccount(account: Account) = accountsDao.insertOrUpdate(account)

    suspend fun deleteAccount(account: Account) = accountsDao.delete(account)

    fun getAccountById(id: Int): Flow<Account> = accountsDao.getById(id)

    fun getAllAccounts(): Flow<List<Account>> = accountsDao.getAll()


    companion object {
        private var repo: AccountsRepo? = null

        fun build(context: Context): AccountsRepo {
            return repo ?: synchronized(this) {
                AccountsRepo(AccountsDatabase.getDatabase(context).accountDao())
                    .also { repo = it }
            }
        }
    }

}