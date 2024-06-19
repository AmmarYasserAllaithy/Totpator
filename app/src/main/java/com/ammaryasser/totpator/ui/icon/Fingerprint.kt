package com.ammaryasser.totpator.ui.icon

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
fun Fingerprint(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "fingerprint",
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
                moveTo(20.042f, 3.417f)
                quadToRelative(2.666f, 0f, 5.208f, 0.646f)
                quadToRelative(2.542f, 0.645f, 4.917f, 1.854f)
                quadToRelative(0.25f, 0.125f, 0.291f, 0.333f)
                quadToRelative(0.042f, 0.208f, -0.041f, 0.333f)
                quadToRelative(-0.125f, 0.209f, -0.313f, 0.292f)
                quadToRelative(-0.187f, 0.083f, -0.437f, -0.042f)
                quadTo(27.458f, 5.708f, 25f, 5.104f)
                quadTo(22.542f, 4.5f, 20.042f, 4.5f)
                reflectiveQuadToRelative(-4.896f, 0.583f)
                quadToRelative(-2.396f, 0.584f, -4.604f, 1.75f)
                quadToRelative(-0.209f, 0.125f, -0.396f, 0.084f)
                quadToRelative(-0.188f, -0.042f, -0.271f, -0.25f)
                quadToRelative(-0.125f, -0.167f, -0.083f, -0.355f)
                quadTo(9.833f, 6.125f, 10f, 6f)
                quadToRelative(2.333f, -1.25f, 4.875f, -1.917f)
                quadToRelative(2.542f, -0.666f, 5.167f, -0.666f)
                close()
                moveToRelative(0f, 4.125f)
                quadToRelative(4.416f, 0f, 8.333f, 1.896f)
                quadToRelative(3.917f, 1.895f, 6.5f, 5.437f)
                quadToRelative(0.167f, 0.25f, 0.125f, 0.417f)
                quadToRelative(-0.042f, 0.166f, -0.208f, 0.333f)
                quadToRelative(-0.125f, 0.125f, -0.354f, 0.125f)
                quadToRelative(-0.23f, 0f, -0.438f, -0.25f)
                quadToRelative(-2.375f, -3.333f, -6.083f, -5.125f)
                quadToRelative(-3.709f, -1.792f, -7.875f, -1.792f)
                quadToRelative(-4.167f, 0.042f, -7.834f, 1.834f)
                quadToRelative(-3.666f, 1.791f, -6.083f, 5.125f)
                quadToRelative(-0.167f, 0.208f, -0.375f, 0.25f)
                quadToRelative(-0.208f, 0.041f, -0.375f, -0.084f)
                quadToRelative(-0.208f, -0.125f, -0.229f, -0.312f)
                quadToRelative(-0.021f, -0.188f, 0.104f, -0.438f)
                quadToRelative(2.542f, -3.541f, 6.458f, -5.479f)
                quadToRelative(3.917f, -1.937f, 8.334f, -1.937f)
                close()
                moveToRelative(0f, 8.166f)
                quadToRelative(3.791f, 0f, 6.479f, 2.542f)
                quadToRelative(2.687f, 2.542f, 2.687f, 6.208f)
                quadToRelative(0f, 0.25f, -0.146f, 0.396f)
                quadToRelative(-0.145f, 0.146f, -0.395f, 0.146f)
                reflectiveQuadToRelative(-0.396f, -0.146f)
                quadToRelative(-0.146f, -0.146f, -0.146f, -0.396f)
                quadToRelative(0f, -3.25f, -2.396f, -5.479f)
                reflectiveQuadToRelative(-5.687f, -2.229f)
                quadToRelative(-3.292f, 0f, -5.667f, 2.229f)
                reflectiveQuadTo(12f, 24.458f)
                quadToRelative(0f, 3.5f, 1.208f, 5.917f)
                quadToRelative(1.209f, 2.417f, 3.542f, 4.875f)
                quadToRelative(0.208f, 0.208f, 0.208f, 0.396f)
                quadToRelative(0f, 0.187f, -0.166f, 0.354f)
                quadToRelative(-0.125f, 0.208f, -0.396f, 0.167f)
                quadToRelative(-0.271f, -0.042f, -0.479f, -0.209f)
                quadToRelative(-2.334f, -2.5f, -3.667f, -5.187f)
                quadToRelative(-1.333f, -2.688f, -1.333f, -6.313f)
                quadToRelative(0f, -3.666f, 2.687f, -6.208f)
                quadToRelative(2.688f, -2.542f, 6.438f, -2.542f)
                close()
                moveTo(20f, 23.917f)
                quadToRelative(0.25f, 0f, 0.396f, 0.145f)
                quadToRelative(0.146f, 0.146f, 0.146f, 0.396f)
                quadToRelative(0f, 3.375f, 2.354f, 5.48f)
                quadToRelative(2.354f, 2.104f, 5.562f, 2.104f)
                quadToRelative(0.375f, 0f, 0.834f, -0.063f)
                quadToRelative(0.458f, -0.062f, 1f, -0.104f)
                quadToRelative(0.25f, -0.042f, 0.396f, 0.083f)
                quadToRelative(0.145f, 0.125f, 0.187f, 0.292f)
                quadToRelative(0f, 0.208f, -0.083f, 0.354f)
                quadToRelative(-0.084f, 0.146f, -0.334f, 0.229f)
                quadToRelative(-0.666f, 0.167f, -1.208f, 0.209f)
                quadToRelative(-0.542f, 0.041f, -0.792f, 0.041f)
                quadToRelative(-3.708f, 0f, -6.354f, -2.416f)
                quadToRelative(-2.646f, -2.417f, -2.646f, -6.209f)
                quadToRelative(0f, -0.25f, 0.146f, -0.396f)
                quadToRelative(0.146f, -0.145f, 0.396f, -0.145f)
                close()
                moveToRelative(0.042f, -4.125f)
                quadToRelative(2f, 0f, 3.416f, 1.354f)
                quadToRelative(1.417f, 1.354f, 1.417f, 3.312f)
                quadToRelative(0f, 1.542f, 1.125f, 2.563f)
                quadToRelative(1.125f, 1.021f, 2.667f, 1.021f)
                quadToRelative(1.5f, 0f, 2.604f, -1.021f)
                reflectiveQuadToRelative(1.104f, -2.563f)
                quadToRelative(0f, -4.958f, -3.625f, -8.354f)
                quadToRelative(-3.625f, -3.396f, -8.708f, -3.396f)
                quadToRelative(-5.084f, 0f, -8.73f, 3.396f)
                quadToRelative(-3.645f, 3.396f, -3.645f, 8.354f)
                quadToRelative(0f, 1.209f, 0.25f, 2.75f)
                quadToRelative(0.25f, 1.542f, 0.916f, 3.375f)
                quadToRelative(0.084f, 0.25f, 0f, 0.417f)
                quadToRelative(-0.083f, 0.167f, -0.291f, 0.25f)
                quadToRelative(-0.209f, 0.083f, -0.417f, 0.021f)
                quadToRelative(-0.208f, -0.063f, -0.333f, -0.313f)
                quadToRelative(-0.542f, -1.541f, -0.854f, -3.187f)
                quadToRelative(-0.313f, -1.646f, -0.313f, -3.313f)
                quadToRelative(0f, -5.333f, 3.979f, -9.125f)
                quadToRelative(3.979f, -3.791f, 9.438f, -3.791f)
                quadToRelative(5.541f, 0f, 9.479f, 3.75f)
                quadToRelative(3.937f, 3.75f, 3.937f, 9.166f)
                quadToRelative(0f, 1.959f, -1.396f, 3.292f)
                quadToRelative(-1.395f, 1.333f, -3.395f, 1.333f)
                quadToRelative(-2.042f, 0f, -3.459f, -1.333f)
                quadToRelative(-1.416f, -1.333f, -1.416f, -3.292f)
                quadToRelative(0f, -1.541f, -1.104f, -2.562f)
                quadToRelative(-1.105f, -1.021f, -2.646f, -1.021f)
                quadToRelative(-1.542f, 0f, -2.667f, 1.021f)
                quadToRelative(-1.125f, 1.021f, -1.125f, 2.562f)
                quadToRelative(0f, 4.292f, 2.5f, 7.084f)
                quadToRelative(2.5f, 2.791f, 6.375f, 3.916f)
                quadToRelative(0.25f, 0.084f, 0.333f, 0.271f)
                quadToRelative(0.084f, 0.188f, 0.042f, 0.354f)
                quadToRelative(-0.042f, 0.25f, -0.208f, 0.355f)
                quadToRelative(-0.167f, 0.104f, -0.417f, 0.02f)
                quadToRelative(-4.25f, -1.083f, -6.958f, -4.25f)
                quadToRelative(-2.709f, -3.166f, -2.709f, -7.75f)
                quadToRelative(0f, -1.958f, 1.417f, -3.312f)
                quadToRelative(1.417f, -1.354f, 3.417f, -1.354f)
                close()
            }
        }.build()
    }
}