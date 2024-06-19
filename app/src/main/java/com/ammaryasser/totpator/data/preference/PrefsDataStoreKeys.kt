package com.ammaryasser.totpator.data.preference

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey


// TODO("Convert to enum")
object PrefsDataStoreKeys {

    val VIEW_AS_GRID_KEY = booleanPreferencesKey("VIEW_AS_GRID")

    val IS_DARK_THEME_KEY = booleanPreferencesKey("IS_DARK_THEME")

    val FONT_ID_KEY = intPreferencesKey("FONT_ID")

}