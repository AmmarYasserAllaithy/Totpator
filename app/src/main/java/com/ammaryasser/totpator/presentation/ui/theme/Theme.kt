package com.ammaryasser.totpator.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


private val DarkColorScheme = darkColorScheme(
    primary = YELLOW,
    secondary = GREEN,
    tertiary = BLUE,
    background = BLACK,
    surface = Color(0xFF383835),
    // on
    onPrimary = BLACK,
    onSecondary = WHITE,
    onTertiary = WHITE,
    onBackground = WHITE,
    onSurface = Color(250, 245, 240),
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF165890),
    secondary = GREEN,
    tertiary = Pink40,
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFF3F3F6),
    // on
    onPrimary = WHITE,
    onSecondary = WHITE,
    onTertiary = WHITE,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
)

@Composable
fun TotpatorTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    fontId: Int = 0,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography.applyFontFamily(supportedFonts[fontId]),
        content = content
    )
}