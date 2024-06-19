package com.ammaryasser.totpator.ui.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons.Outlined
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxValue.EndToStart
import androidx.compose.material3.SwipeToDismissBoxValue.Settled
import androidx.compose.material3.SwipeToDismissBoxValue.StartToEnd
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.ui.theme.WHITE
import com.ammaryasser.totpator.util.roundedShape
import com.ammaryasser.totpator.util.schedule


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SwipeCard(
    issuer: String,
    username: String,
    totp: String,
    notes: String,
    duration: Float = 30f,
    onTotpExpire: () -> Unit,
    onSwipeToStart: () -> Unit,
    onSwipeToEnd: () -> Unit,
    onClick: () -> Unit,
) {
    var isTotpCopied by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = roundedShape,
        elevation = CardDefaults.cardElevation(1.dp),
        onClick = {
            onClick()
            isTotpCopied = true
            schedule(1) { isTotpCopied = false }
        },
    ) {

        val dismissState = rememberSwipeToDismissBoxState(
            confirmValueChange = {
                if (it == StartToEnd) onSwipeToEnd()
                else if (it == EndToStart) onSwipeToStart()
                false
            }
        )

        SwipeToDismissBox(
            state = dismissState,
            modifier = Modifier.clip(roundedShape),
            backgroundContent = {
                val direction = dismissState.dismissDirection

                val color by animateColorAsState(
                    when (dismissState.targetValue) {
                        EndToStart -> Color.Red.copy(alpha = 0.8f)
                        StartToEnd -> colorScheme.secondary.copy(alpha = 0.8f)
                        else -> colorScheme.background
                    }
                )

                val scale by animateFloatAsState(
                    if (dismissState.targetValue == Settled) 0f else 1.2f
                )

                val icon = when (direction) {
                    StartToEnd -> Outlined.Edit
                    EndToStart -> Outlined.Delete
                    else -> Outlined.Delete
                }

                val alignment = when (direction) {
                    StartToEnd -> Alignment.CenterStart
                    EndToStart -> Alignment.CenterEnd
                    else -> Alignment.Center
                }

                Box(
                    Modifier
                        .fillMaxSize()
                        .background(color)
                        .padding(horizontal = 16.dp)
                ) {
                    Icon(
                        icon, "", tint = WHITE,
                        modifier = Modifier
                            .scale(scale)
                            .align(alignment)
                    )
                }
            },
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorScheme.surface)
                    .padding(vertical = 8.dp, horizontal = 10.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                CardText(issuer, typography.titleSmall, colorScheme.primary)

                if (username.isNotBlank()) CardText(username, typography.bodySmall, maxLines = 2)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    CardText(
                        totp,
                        typography.headlineMedium,
                        if (isTotpCopied) colorScheme.secondary else colorScheme.onBackground
                    )

                    CounterDown(duration, colorScheme.primary, onTotpExpire)
                }

                if (notes.isNotBlank()) CardText(notes, typography.bodySmall, maxLines = 2)
            }
        }

    }
}


@Composable
fun CardText(
    text: String,
    style: TextStyle = TextStyle(),
    color: Color = colorScheme.onBackground,
    maxLines: Int = 1
) {
    Text(
        text = text,
        style = style,
        color = color,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
    )
}