package com.ammaryasser.totpator.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ammaryasser.totpator.data.account.Account
import com.ammaryasser.totpator.repository.AccountRepository
import kotlinx.coroutines.launch


class FormScreenViewModel(app: Application) : AndroidViewModel(app) {

    private val repo = AccountRepository.build(app.applicationContext)


    fun saveAccount(account: Account) {
        viewModelScope.launch {
            repo.insertOrUpdateAccount(account)
        }
    }

    fun getAccountById(id: Int) = repo.getAccountById(id)


    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val app = (this[APPLICATION_KEY] as Application)

                FormScreenViewModel(app)
            }
        }
    }
}