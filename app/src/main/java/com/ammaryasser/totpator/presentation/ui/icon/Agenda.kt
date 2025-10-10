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
fun ViewAgenda(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "view_agenda",
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
                moveTo(7.875f, 18.583f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.791f)
                quadTo(5.25f, 17f, 5.25f, 15.958f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -1.041f, 0.792f, -1.833f)
                quadToRelative(0.791f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(24.25f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.792f, 0.792f, 1.833f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 1.042f, -0.792f, 1.834f)
                quadToRelative(-0.791f, 0.791f, -1.833f, 0.791f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineToRelative(-8f)
                horizontalLineTo(7.875f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(0f, 18.709f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.792f)
                quadToRelative(-0.792f, -0.792f, -0.792f, -1.833f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -1.042f, 0.792f, -1.834f)
                quadToRelative(0.791f, -0.791f, 1.833f, -0.791f)
                horizontalLineToRelative(24.25f)
                quadToRelative(1.042f, 0f, 1.833f, 0.791f)
                quadToRelative(0.792f, 0.792f, 0.792f, 1.834f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 1.041f, -0.792f, 1.833f)
                quadToRelative(-0.791f, 0.792f, -1.833f, 0.792f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineToRelative(-8f)
                horizontalLineTo(7.875f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(0f, -24.084f)
                verticalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
                moveToRelative(0f, 16.084f)
                verticalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
            }
        }.build()
    }
}