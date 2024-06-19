package com.ammaryasser.totpator.data.preference

import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow


typealias PrefKey<T> = Preferences.Key<T>


interface PrefsDataStoreAPI {

    suspend fun <T> getPref(key: PrefKey<T>, defaultValue: T): Flow<T>

    suspend fun <T> getFirstPref(key: PrefKey<T>, defaultValue: T): T

    suspend fun <T> putPref(key: PrefKey<T>, value: T)

    suspend fun <T> removePref(key: PrefKey<T>)

    suspend fun <T> clearAllPrefs()

}