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
fun TypeSpecimen(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "type_specimen",
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
                moveTo(15.75f, 24.792f)
                horizontalLineToRelative(2.042f)
                lineToRelative(1.541f, -4.042f)
                horizontalLineTo(26f)
                lineToRelative(1.542f, 4.042f)
                horizontalLineToRelative(2f)
                lineTo(23.625f, 9.917f)
                horizontalLineToRelative(-1.958f)
                close()
                moveToRelative(4.167f, -5.709f)
                lineToRelative(2.666f, -7f)
                horizontalLineToRelative(0.167f)
                lineToRelative(2.625f, 7f)
                close()
                moveToRelative(-8.375f, 12.042f)
                quadToRelative(-1.084f, 0f, -1.875f, -0.792f)
                quadToRelative(-0.792f, -0.791f, -0.792f, -1.875f)
                verticalLineTo(6.25f)
                quadToRelative(0f, -1.083f, 0.792f, -1.854f)
                quadToRelative(0.791f, -0.771f, 1.875f, -0.771f)
                horizontalLineTo(33.75f)
                quadToRelative(1.083f, 0f, 1.854f, 0.771f)
                quadToRelative(0.771f, 0.771f, 0.771f, 1.854f)
                verticalLineToRelative(22.208f)
                quadToRelative(0f, 1.084f, -0.771f, 1.875f)
                quadToRelative(-0.771f, 0.792f, -1.854f, 0.792f)
                close()
                moveToRelative(0f, -2.667f)
                horizontalLineTo(33.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(11.542f)
                verticalLineToRelative(22.208f)
                close()
                moveTo(6.25f, 36.375f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.771f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.854f)
                verticalLineTo(8.875f)
                horizontalLineTo(6.25f)
                verticalLineTo(33.75f)
                horizontalLineToRelative(24.875f)
                verticalLineToRelative(2.625f)
                close()
                moveTo(11.542f, 6.25f)
                verticalLineToRelative(22.208f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()
    }
}
/*
@Composable
fun Typography(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "custom_typography",
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
                moveTo(449.834f, -86.667f)
                verticalLineTo(-308.5f)
                horizontalLineToRelative(63.333f)
                verticalLineToRelative(79.167f)
                horizontalLineTo(834f)
                verticalLineTo(-166f)
                horizontalLineTo(513.167f)
                verticalLineToRelative(79.333f)
                horizontalLineToRelative(-63.333f)
                close()
                moveTo(126f, -166f)
                verticalLineToRelative(-63.333f)
                horizontalLineToRelative(260.501f)
                verticalLineTo(-166f)
                horizontalLineTo(126f)
                close()
                moveToRelative(140.167f, -234f)
                horizontalLineToRelative(69.166f)
                lineToRelative(43.914f, -122.167f)
                horizontalLineToRelative(202.3f)
                lineTo(625.334f, -400f)
                horizontalLineToRelative(68.833f)
                lineTo(513.5f, -873.333f)
                horizontalLineToRelative(-67.333f)
                lineTo(266.167f, -400f)
                close()
                moveToRelative(134.499f, -179.333f)
                lineToRelative(78.001f, -219.501f)
                horizontalLineToRelative(2.666f)
                lineToRelative(78.001f, 219.501f)
                horizontalLineTo(400.666f)
                close()
            }
        }.build()
    }
}
*/