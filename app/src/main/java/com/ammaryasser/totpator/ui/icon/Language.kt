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
fun Language(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "language",
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
                quadToRelative(-3.417f, 0f, -6.417f, -1.271f)
                reflectiveQuadToRelative(-5.208f, -3.5f)
                quadToRelative(-2.208f, -2.229f, -3.479f, -5.229f)
                reflectiveQuadToRelative(-1.271f, -6.417f)
                quadToRelative(0f, -3.458f, 1.271f, -6.416f)
                quadToRelative(1.271f, -2.959f, 3.479f, -5.188f)
                quadToRelative(2.208f, -2.229f, 5.208f, -3.479f)
                reflectiveQuadTo(20f, 3.625f)
                quadToRelative(3.417f, 0f, 6.417f, 1.25f)
                reflectiveQuadToRelative(5.208f, 3.479f)
                quadToRelative(2.208f, 2.229f, 3.479f, 5.188f)
                quadToRelative(1.271f, 2.958f, 1.271f, 6.416f)
                quadToRelative(0f, 3.417f, -1.271f, 6.417f)
                reflectiveQuadToRelative(-3.479f, 5.229f)
                quadToRelative(-2.208f, 2.229f, -5.208f, 3.5f)
                reflectiveQuadTo(20f, 36.375f)
                close()
                moveToRelative(6.5f, -22.625f)
                horizontalLineToRelative(5.833f)
                quadTo(31f, 11.083f, 28.771f, 9.313f)
                quadToRelative(-2.229f, -1.771f, -5.146f, -2.605f)
                quadToRelative(1f, 1.542f, 1.687f, 3.23f)
                quadTo(26f, 11.625f, 26.5f, 13.75f)
                close()
                moveToRelative(-10.25f, 0f)
                horizontalLineToRelative(7.583f)
                quadToRelative(-0.458f, -2.125f, -1.458f, -4.062f)
                quadToRelative(-1f, -1.938f, -2.375f, -3.48f)
                quadToRelative(-1.25f, 1.25f, -2.146f, 3.042f)
                quadToRelative(-0.896f, 1.792f, -1.604f, 4.5f)
                close()
                moveToRelative(-9.5f, 9.833f)
                horizontalLineTo(13f)
                quadToRelative(-0.125f, -1.041f, -0.167f, -1.916f)
                quadToRelative(-0.041f, -0.875f, -0.041f, -1.709f)
                quadToRelative(0f, -1f, 0.062f, -1.812f)
                quadToRelative(0.063f, -0.813f, 0.188f, -1.771f)
                horizontalLineTo(6.75f)
                quadToRelative(-0.292f, 0.958f, -0.396f, 1.771f)
                quadToRelative(-0.104f, 0.812f, -0.104f, 1.812f)
                reflectiveQuadToRelative(0.104f, 1.834f)
                quadToRelative(0.104f, 0.833f, 0.396f, 1.791f)
                close()
                moveToRelative(9.625f, 9.709f)
                quadToRelative(-1f, -1.542f, -1.687f, -3.271f)
                quadTo(14f, 28.292f, 13.5f, 26.208f)
                horizontalLineTo(7.667f)
                quadToRelative(1.458f, 2.709f, 3.479f, 4.354f)
                quadToRelative(2.021f, 1.646f, 5.229f, 2.73f)
                close()
                moveTo(7.667f, 13.75f)
                horizontalLineToRelative(5.875f)
                quadToRelative(0.458f, -2.042f, 1.125f, -3.708f)
                quadToRelative(0.666f, -1.667f, 1.666f, -3.292f)
                quadToRelative(-2.916f, 0.792f, -5.104f, 2.542f)
                quadToRelative(-2.187f, 1.75f, -3.562f, 4.458f)
                close()
                moveTo(20f, 33.875f)
                quadToRelative(1.375f, -1.542f, 2.292f, -3.396f)
                quadToRelative(0.916f, -1.854f, 1.5f, -4.271f)
                horizontalLineTo(16.25f)
                quadToRelative(0.542f, 2.334f, 1.479f, 4.23f)
                quadToRelative(0.938f, 1.895f, 2.271f, 3.437f)
                close()
                moveToRelative(-4.292f, -10.292f)
                horizontalLineToRelative(8.625f)
                quadToRelative(0.167f, -1.166f, 0.209f, -1.979f)
                quadToRelative(0.041f, -0.812f, 0.041f, -1.646f)
                quadToRelative(0f, -0.833f, -0.041f, -1.625f)
                quadToRelative(-0.042f, -0.791f, -0.209f, -1.958f)
                horizontalLineToRelative(-8.625f)
                quadToRelative(-0.166f, 1.167f, -0.208f, 1.958f)
                quadToRelative(-0.042f, 0.792f, -0.042f, 1.625f)
                quadToRelative(0f, 0.834f, 0.042f, 1.646f)
                quadToRelative(0.042f, 0.813f, 0.208f, 1.979f)
                close()
                moveToRelative(7.959f, 9.667f)
                quadToRelative(2.833f, -0.917f, 5.062f, -2.708f)
                quadToRelative(2.229f, -1.792f, 3.604f, -4.334f)
                horizontalLineToRelative(-5.791f)
                quadToRelative(-0.5f, 2.042f, -1.209f, 3.771f)
                quadToRelative(-0.708f, 1.729f, -1.666f, 3.271f)
                close()
                moveToRelative(3.291f, -9.667f)
                horizontalLineToRelative(6.334f)
                quadToRelative(0.25f, -0.958f, 0.354f, -1.791f)
                quadToRelative(0.104f, -0.834f, 0.104f, -1.834f)
                reflectiveQuadToRelative(-0.104f, -1.812f)
                quadToRelative(-0.104f, -0.813f, -0.354f, -1.771f)
                horizontalLineTo(27f)
                quadToRelative(0.125f, 1.292f, 0.167f, 2.083f)
                quadToRelative(0.041f, 0.792f, 0.041f, 1.5f)
                quadToRelative(0f, 0.875f, -0.062f, 1.688f)
                quadToRelative(-0.063f, 0.812f, -0.188f, 1.937f)
                close()
            }
        }.build()
    }
}