package com.ammaryasser.totpator.presentation.ui.component

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.util.scheduleAtFixedRate
import java.util.Date


@Composable
fun CounterDown(
    duration: Float,
    color: Color = colorScheme.onBackground,
    onTimeOver: () -> Unit
) {
    val calcProgress = { (duration - Date().seconds % duration) / duration }
    var progress by remember { mutableFloatStateOf(calcProgress()) }

    LaunchedEffect(Unit) {
        scheduleAtFixedRate(0, 1) {
            progress = calcProgress()

            if (progress == 1f) onTimeOver()
        }
    }

    CircularProgressIndicator(
        progress = { progress },
        modifier = Modifier.size(size = 20.dp),
        color = color,
        strokeWidth = 10.dp,
        trackColor = color.copy(alpha = .2f),
    )
}