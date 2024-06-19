package com.ammaryasser.totpator.data.preference

import android.content.Context

import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

import java.io.IOException


// Declaring/Creating the DataStore File for Application
private val Context.dataStore by preferencesDataStore(name = "PrefsDataStore")


class PrefsDataStoreHelper(context: Context) : PrefsDataStoreAPI {

    /**
     *  dataSource access the DataStore file and manipulates based on our requirements.
     */
    private val dataSource = context.dataStore

    /**
     * This returns a flow of data from DataStore.
     * Basically as soon we update the value in Datastore,
     * the values returned by it also changes.
     */
    override suspend fun <T> getPref(key: PrefKey<T>, defaultValue: T): Flow<T> =
        dataSource.data
            .catch { ex -> if (ex is IOException) emit(emptyPreferences()) else throw ex }
            .map { prefs -> prefs[key] ?: defaultValue }

    /**
     * This returns the last saved value of the key.
     * If we change the value,
     * it wont effect the values produced by this function
     */
    override suspend fun <T> getFirstPref(key: PrefKey<T>, defaultValue: T): T =
        dataSource.data.first()[key] ?: defaultValue

    override suspend fun <T> putPref(key: PrefKey<T>, value: T) {
        dataSource.edit { prefs -> prefs[key] = value }
    }

    override suspend fun <T> removePref(key: PrefKey<T>) {
        dataSource.edit { prefs -> prefs.remove(key) }
    }

    override suspend fun <T> clearAllPrefs() {
        dataSource.edit { prefs -> prefs.clear() }
    }

}