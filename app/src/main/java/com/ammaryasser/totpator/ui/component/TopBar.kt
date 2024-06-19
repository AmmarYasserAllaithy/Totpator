package com.ammaryasser.totpator.ui.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String = stringResource(R.string.app_name),
    navBack: Boolean = false,
    onBack: () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
) {
    TopAppBar(
        title = { Text(title) },
        actions = actions,
        modifier = Modifier.clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 8.dp)),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorScheme.primary,
            titleContentColor = colorScheme.onPrimary
        ),
        navigationIcon = {
            if (navBack)
                IconButton(onClick = onBack) {
                    Icon(
                        Icons.AutoMirrored.Outlined.KeyboardArrowLeft,
                        "",
                        tint = colorScheme.onPrimary
                    )
                }
        }
    )
}