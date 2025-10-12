package com.ammaryasser.totpator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ammaryasser.totpator.presentation.ui.screen.AboutScreen
import com.ammaryasser.totpator.presentation.ui.screen.FormScreen
import com.ammaryasser.totpator.presentation.ui.screen.MainScreen
import com.ammaryasser.totpator.presentation.ui.screen.PreferencesScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    isDarkTheme: Boolean,
    fontId: Int,
    onToggleTheme: () -> Unit,
    onToggleFontFamily: () -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(route = Screen.Main.route) {
            MainScreen(
                onAddAccount = {
                    navController.navigate(Screen.Form.route)
                },
                onEditAccount = { id ->
                    navController.navigate(Screen.Form.editRouteOfId(id))
                },
                onNavToPreferencesScreen = {
                    navController.navigate(Screen.Preferences.route)
                },
                onNavToAboutScreen = {
                    navController.navigate(Screen.About.route)
                })
        }

        composable(
            route = Screen.Form.fullRoute(),
            arguments = listOf(
                navArgument(Screen.Form.ID_KEY) {
                    type = NavType.IntType
                    defaultValue = -1
                },
            )
        ) {
            FormScreen(
                toBeEditedAccId = it.arguments?.getInt(Screen.Form.ID_KEY),
                onNavBack = {
                    navController.popBackStack()
                })
        }

        composable(route = Screen.About.route) {
            AboutScreen {
                navController.popBackStack()
            }
        }

        composable(route = Screen.Preferences.route) {
            PreferencesScreen(
                isDarkTheme = isDarkTheme,
                fontId = fontId,
                onToggleTheme = onToggleTheme,
                onToggleFontFamily = onToggleFontFamily,
                onNavBack = {
                    navController.popBackStack()
                })
        }
    }
}