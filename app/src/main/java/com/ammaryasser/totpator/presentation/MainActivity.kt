package com.ammaryasser.totpator.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import com.ammaryasser.totpator.data.repos.PrefsRepo
import com.ammaryasser.totpator.navigation.NavGraph
import com.ammaryasser.totpator.presentation.ui.theme.TotpatorTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            val preferenceRepo = PrefsRepo(LocalContext.current)
            val isDark = isSystemInDarkTheme()
            var applyDarkTheme by remember { mutableStateOf(isDark) }
            var fontId by remember { mutableIntStateOf(0) }

            LaunchedEffect(Unit) {
                lifecycleScope.launch {
                    applyDarkTheme = preferenceRepo.getIsDarkTheme(applyDarkTheme)
                    fontId = preferenceRepo.getFontId(fontId)
                }
            }

            TotpatorTheme(applyDarkTheme, fontId) {
                NavGraph(
                    navController = rememberNavController(),
                    isDarkTheme = applyDarkTheme,
                    fontId = fontId,
                    onToggleTheme = {
                        applyDarkTheme = !applyDarkTheme
                        lifecycleScope.launch {
                            preferenceRepo.putIsDarkTheme(applyDarkTheme)
                        }
                    },
                    onToggleFontFamily = {
                        fontId = if (fontId == 0) 1 else 0
                        lifecycleScope.launch {
                            preferenceRepo.putFontId(fontId)
                        }
                    }
                )
            }
        }
    }
}