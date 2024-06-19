package com.ammaryasser.totpator.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ammaryasser.totpator.data.account.Account
import com.ammaryasser.totpator.repository.AccountRepository
import kotlinx.coroutines.launch


class MainScreenViewModel(app: Application) : AndroidViewModel(app) {

    private val repo = AccountRepository.build(app.applicationContext)

    private val _accounts = MutableLiveData<List<Account>>()
    val accounts: LiveData<List<Account>> get() = _accounts

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> get() = _loading


    init {
        fetchAccounts()
    }


    private fun fetchAccounts() {
        _loading.postValue(true)

        viewModelScope.launch {
            repo.getAllAccounts().collect {
                _accounts.postValue(it)
                _loading.postValue(false)
            }
        }
    }

    fun deleteAccount(account: Account) {
        viewModelScope.launch {
            repo.deleteAccount(account)
        }
    }


    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val app = (this[APPLICATION_KEY] as Application)

                MainScreenViewModel(app)
            }
        }
    }
}