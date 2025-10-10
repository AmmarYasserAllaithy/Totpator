package com.ammaryasser.totpator.navigation

sealed class Screen(val route: String) {

    data object Main : Screen("main_screen")

    data object Form : Screen("form_screen") {
        const val ID_KEY = "id"

        fun fullRoute() = "$route?edit={$ID_KEY}"

        fun editRouteOfId(id: Int) = "$route?edit=$id"
    }

    data object Preferences : Screen("preferences_screen")

    data object About : Screen("about_screen")

}