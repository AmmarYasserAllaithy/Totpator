package com.ammaryasser.totpator.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons.Rounded
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.util.roundedShape


@Composable
fun FAB(modifier: Modifier, onClick: () -> Unit) {
    FloatingActionButton(
        modifier = modifier.padding(16.dp),
        onClick = onClick,
        shape = roundedShape,
        containerColor = MaterialTheme.colorScheme.primary,
    ) {
        Icon(Rounded.Add, "")
    }
}