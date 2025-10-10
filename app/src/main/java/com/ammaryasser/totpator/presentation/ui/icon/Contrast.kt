package com.ammaryasser.totpator.presentation.ui.icon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


@Composable
fun Contrast(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "contrast",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 36.375f)
                quadToRelative(-3.417f, 0f, -6.396f, -1.292f)
                quadToRelative(-2.979f, -1.291f, -5.208f, -3.5f)
                quadToRelative(-2.229f, -2.208f, -3.5f, -5.187f)
                reflectiveQuadTo(3.625f, 20f)
                quadToRelative(0f, -3.417f, 1.292f, -6.396f)
                quadToRelative(1.291f, -2.979f, 3.5f, -5.208f)
                quadToRelative(2.208f, -2.229f, 5.187f, -3.5f)
                reflectiveQuadTo(20f, 3.625f)
                quadToRelative(3.417f, 0f, 6.396f, 1.292f)
                quadToRelative(2.979f, 1.291f, 5.208f, 3.5f)
                quadToRelative(2.229f, 2.208f, 3.5f, 5.187f)
                reflectiveQuadTo(36.375f, 20f)
                quadToRelative(0f, 3.417f, -1.292f, 6.396f)
                quadToRelative(-1.291f, 2.979f, -3.5f, 5.208f)
                quadToRelative(-2.208f, 2.229f, -5.187f, 3.5f)
                reflectiveQuadTo(20f, 36.375f)
                close()
                moveToRelative(1.25f, -2.667f)
                quadToRelative(5.292f, -0.5f, 8.896f, -4.354f)
                quadTo(33.75f, 25.5f, 33.75f, 20f)
                quadToRelative(0f, -5.458f, -3.562f, -9.312f)
                quadToRelative(-3.563f, -3.855f, -8.938f, -4.355f)
                close()
            }
        }.build()
    }
}