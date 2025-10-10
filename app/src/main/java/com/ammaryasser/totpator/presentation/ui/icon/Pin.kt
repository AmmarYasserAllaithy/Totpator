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
fun Pin(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "pin",
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
                moveTo(6.25f, 33.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.791f)
                quadToRelative(-0.771f, -0.792f, -0.771f, -1.834f)
                verticalLineTo(9.542f)
                quadToRelative(0f, -1.042f, 0.771f, -1.834f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.834f)
                verticalLineToRelative(20.916f)
                quadToRelative(0f, 1.042f, -0.771f, 1.834f)
                quadToRelative(-0.771f, 0.791f, -1.854f, 0.791f)
                close()
                moveToRelative(5.208f, -7.958f)
                quadToRelative(0.375f, 0f, 0.625f, -0.25f)
                reflectiveQuadToRelative(0.25f, -0.625f)
                verticalLineToRelative(-8.458f)
                quadToRelative(0f, -0.375f, -0.271f, -0.646f)
                quadToRelative(-0.27f, -0.271f, -0.687f, -0.271f)
                quadToRelative(-0.167f, 0f, -0.375f, 0.083f)
                quadToRelative(-0.208f, 0.084f, -0.375f, 0.167f)
                lineToRelative(-1.958f, 1.333f)
                quadToRelative(-0.292f, 0.209f, -0.355f, 0.542f)
                quadToRelative(-0.062f, 0.333f, 0.146f, 0.625f)
                quadToRelative(0.209f, 0.292f, 0.521f, 0.354f)
                quadToRelative(0.313f, 0.063f, 0.604f, -0.146f)
                lineToRelative(1f, -0.666f)
                verticalLineToRelative(7.083f)
                quadToRelative(0f, 0.375f, 0.25f, 0.625f)
                reflectiveQuadToRelative(0.625f, 0.25f)
                close()
                moveToRelative(5.5f, 0f)
                horizontalLineToRelative(4.792f)
                quadToRelative(0.333f, 0f, 0.562f, -0.25f)
                quadToRelative(0.23f, -0.25f, 0.23f, -0.542f)
                quadToRelative(0f, -0.333f, -0.23f, -0.562f)
                quadToRelative(-0.229f, -0.229f, -0.52f, -0.229f)
                horizontalLineToRelative(-3.584f)
                verticalLineToRelative(-0.084f)
                quadToRelative(0.709f, -0.666f, 1.334f, -1.229f)
                quadToRelative(0.625f, -0.562f, 1.083f, -1.062f)
                quadToRelative(0.875f, -0.875f, 1.313f, -1.605f)
                quadToRelative(0.437f, -0.729f, 0.437f, -1.687f)
                quadToRelative(0f, -1.25f, -0.896f, -2.125f)
                reflectiveQuadToRelative(-2.354f, -0.875f)
                quadToRelative(-0.875f, 0f, -1.583f, 0.354f)
                quadToRelative(-0.709f, 0.354f, -1.167f, 0.938f)
                quadToRelative(-0.208f, 0.333f, -0.083f, 0.687f)
                quadToRelative(0.125f, 0.354f, 0.541f, 0.563f)
                quadToRelative(0.25f, 0.125f, 0.521f, 0.041f)
                quadToRelative(0.271f, -0.083f, 0.521f, -0.333f)
                quadToRelative(0.25f, -0.208f, 0.583f, -0.354f)
                quadToRelative(0.334f, -0.146f, 0.667f, -0.146f)
                quadToRelative(0.708f, 0f, 1.125f, 0.375f)
                quadToRelative(0.417f, 0.375f, 0.417f, 0.958f)
                quadToRelative(0f, 0.667f, -0.355f, 1.188f)
                quadToRelative(-0.354f, 0.521f, -0.979f, 1.104f)
                quadToRelative(-0.75f, 0.708f, -1.395f, 1.354f)
                quadToRelative(-0.646f, 0.646f, -1.563f, 1.479f)
                quadToRelative(-0.208f, 0.209f, -0.313f, 0.479f)
                quadToRelative(-0.104f, 0.271f, -0.104f, 0.521f)
                quadToRelative(0f, 0.459f, 0.292f, 0.75f)
                quadToRelative(0.292f, 0.292f, 0.708f, 0.292f)
                close()
                moveToRelative(11.667f, 0f)
                quadToRelative(1.458f, 0f, 2.417f, -0.771f)
                quadToRelative(0.958f, -0.771f, 0.958f, -2.229f)
                quadToRelative(0f, -0.917f, -0.5f, -1.563f)
                quadToRelative(-0.5f, -0.645f, -1.333f, -0.812f)
                verticalLineToRelative(-0.042f)
                quadToRelative(0.708f, -0.25f, 1.083f, -0.791f)
                quadToRelative(0.375f, -0.542f, 0.375f, -1.375f)
                quadToRelative(0f, -1.209f, -0.854f, -1.938f)
                quadToRelative(-0.854f, -0.729f, -2.188f, -0.729f)
                quadToRelative(-0.708f, 0f, -1.354f, 0.313f)
                quadToRelative(-0.646f, 0.312f, -1.187f, 0.895f)
                quadToRelative(-0.209f, 0.25f, -0.125f, 0.625f)
                quadToRelative(0.083f, 0.375f, 0.5f, 0.584f)
                quadToRelative(0.166f, 0.083f, 0.437f, 0.041f)
                quadToRelative(0.271f, -0.041f, 0.479f, -0.291f)
                quadToRelative(0.292f, -0.209f, 0.584f, -0.354f)
                quadToRelative(0.291f, -0.146f, 0.666f, -0.146f)
                quadToRelative(0.584f, 0f, 0.979f, 0.354f)
                quadToRelative(0.396f, 0.354f, 0.396f, 0.896f)
                quadToRelative(0f, 0.666f, -0.479f, 0.958f)
                quadToRelative(-0.479f, 0.292f, -1.187f, 0.292f)
                quadToRelative(-0.334f, 0f, -0.48f, 0.229f)
                quadToRelative(-0.145f, 0.229f, -0.145f, 0.521f)
                quadToRelative(0f, 0.333f, 0.166f, 0.583f)
                quadToRelative(0.167f, 0.25f, 0.5f, 0.25f)
                quadToRelative(0.792f, 0f, 1.375f, 0.375f)
                quadToRelative(0.584f, 0.375f, 0.584f, 1.125f)
                quadToRelative(0f, 0.667f, -0.459f, 1.063f)
                quadToRelative(-0.458f, 0.395f, -1.208f, 0.395f)
                quadToRelative(-0.458f, 0f, -0.896f, -0.208f)
                quadToRelative(-0.437f, -0.208f, -0.729f, -0.667f)
                quadToRelative(-0.208f, -0.25f, -0.458f, -0.333f)
                quadToRelative(-0.25f, -0.083f, -0.542f, 0f)
                quadToRelative(-0.333f, 0.125f, -0.458f, 0.458f)
                quadToRelative(-0.125f, 0.334f, 0.041f, 0.625f)
                quadToRelative(0.417f, 0.792f, 1.188f, 1.23f)
                quadToRelative(0.771f, 0.437f, 1.854f, 0.437f)
                close()
                moveTo(6.25f, 30.458f)
                horizontalLineToRelative(27.5f)
                verticalLineTo(9.542f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(20.916f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(9.542f)
                verticalLineToRelative(20.916f)
                close()
            }
        }.build()
    }
}