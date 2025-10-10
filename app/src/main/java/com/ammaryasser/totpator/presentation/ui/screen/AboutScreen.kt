package com.ammaryasser.totpator.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.R
import com.ammaryasser.totpator.presentation.ui.component.TopBar


@Composable
fun AboutScreen(onNavBack: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {

        TopBar(
            title = stringResource(R.string.about),
            navBack = true,
            onBack = onNavBack
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Image(painterResource(R.drawable.logo), "")

            Text(
                text = stringResource(R.string.app_name),
                style = typography.displaySmall,
                color = colorScheme.primary,
                textAlign = TextAlign.Center,
            )

            Text(
                text = stringResource(R.string.app_about),
                style = typography.bodyLarge,
                color = colorScheme.onBackground,
                textAlign = TextAlign.Center,
            )

        }

    }
}