package com.ammaryasser.totpator.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.R
import com.ammaryasser.totpator.TotpatorApp
import com.ammaryasser.totpator.ui.component.Preference
import com.ammaryasser.totpator.ui.component.TopBar
import com.ammaryasser.totpator.ui.icon.Contrast
import com.ammaryasser.totpator.ui.icon.Language
import com.ammaryasser.totpator.ui.icon.Pin
import com.ammaryasser.totpator.ui.icon.TypeSpecimen
import com.ammaryasser.totpator.util.showToast


@Composable
fun PreferencesScreen(
    isDarkTheme: Boolean,
    fontId: Int,
    onToggleTheme: () -> Unit,
    onToggleFontFamily: () -> Unit,
    onNavBack: () -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {

        TopBar(
            title = stringResource(R.string.preferences),
            navBack = true,
            onBack = onNavBack
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .verticalScroll(rememberScrollState()),
        ) {

            ThemeGroup(isDarkTheme, fontId, onToggleTheme, onToggleFontFamily)

            CustomDivider()

            DisplayGroup()

            CustomDivider()

            SecurityGroup()

        }

    }
}

@Composable
fun ThemeGroup(
    isDarkTheme: Boolean,
    fontId: Int,
    onToggleTheme: () -> Unit,
    onToggleFontFamily: () -> Unit,
) {
    SubTitle(stringResource(R.string.theme))

    Preference(
        icon = Contrast(),
        title = stringResource(R.string.app_theme),
        subTitle = stringResource(
            R.string.tap_to_apply_theme,
            stringResource(if (isDarkTheme) R.string.theme_light else R.string.theme_dark)
        ),
        onClick = onToggleTheme
    )

    Preference(
        icon = TypeSpecimen(),
        title = stringResource(R.string.font_family),
        subTitle = stringResource(
            R.string.tap_to_apply_font,
            stringResource(if (fontId == 0) R.string.family_delius else R.string.family_poppins)
        ),
        onClick = onToggleFontFamily
    )
}


@Composable
fun DisplayGroup() {
    SubTitle(stringResource(R.string.display))

    Preference(
        icon = Language(),
        title = stringResource(R.string.display_lang),
        subTitle = stringResource(R.string.tap_to_select_lang),
    ) {
        showToast(TotpatorApp.context().getString(R.string.coming_soon))
    }
}

@Composable
fun SecurityGroup() {
    SubTitle(stringResource(R.string.security))

    Preference(
        icon = Pin(),
        title = (stringResource(R.string.setup_pin_code)),
        subTitle = (stringResource(R.string.no_pin)),
    ) {
        showToast(TotpatorApp.context().getString(R.string.coming_soon))
    }

    Preference(
        icon = Icons.Outlined.Lock,
        title = (stringResource(R.string.lock_when_app_is_idle)),
        subTitle = (stringResource(R.string.after_minutes)),
    ) {
        showToast(TotpatorApp.context().getString(R.string.coming_soon))
    }

    // todo: unlock with biometrics
    // todo: allow screenshots
}


@Composable
fun SubTitle(text: String) {
    val subtitleModifier = Modifier.padding(8.dp)

    Text(
        text = text,
        modifier = subtitleModifier,
        color = colorScheme.primary.copy(.9f)
    )
}


@Composable
fun CustomDivider() {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(1.dp)
            .background(colorScheme.onSurface.copy(.05f))
    )
}