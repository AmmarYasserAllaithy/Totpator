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
fun CorporateFare(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "corporate_fare",
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
                moveTo(6.667f, 34.208f)
                quadToRelative(-1.084f, 0f, -1.855f, -0.77f)
                quadToRelative(-0.77f, -0.771f, -0.77f, -1.855f)
                verticalLineTo(8.125f)
                quadToRelative(0f, -1.125f, 0.77f, -1.896f)
                quadToRelative(0.771f, -0.771f, 1.855f, -0.771f)
                horizontalLineToRelative(10.416f)
                quadToRelative(1.084f, 0f, 1.855f, 0.792f)
                quadToRelative(0.77f, 0.792f, 0.77f, 1.875f)
                verticalLineTo(12f)
                horizontalLineToRelative(13.625f)
                quadToRelative(1.084f, 0f, 1.855f, 0.771f)
                quadToRelative(0.77f, 0.771f, 0.77f, 1.854f)
                verticalLineToRelative(16.958f)
                quadToRelative(0f, 1.084f, -0.77f, 1.855f)
                quadToRelative(-0.771f, 0.77f, -1.855f, 0.77f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(10.416f)
                verticalLineToRelative(-3.875f)
                horizontalLineTo(6.667f)
                close()
                moveToRelative(0f, -6.541f)
                horizontalLineToRelative(10.416f)
                verticalLineToRelative(-3.875f)
                horizontalLineTo(6.667f)
                close()
                moveToRelative(0f, -6.5f)
                horizontalLineToRelative(10.416f)
                verticalLineToRelative(-3.917f)
                horizontalLineTo(6.667f)
                close()
                moveToRelative(0f, -6.542f)
                horizontalLineToRelative(10.416f)
                verticalLineTo(8.125f)
                horizontalLineTo(6.667f)
                close()
                moveToRelative(13.041f, 19.583f)
                horizontalLineToRelative(13.625f)
                verticalLineTo(14.625f)
                horizontalLineTo(19.708f)
                close()
                moveToRelative(3.209f, -10.416f)
                verticalLineToRelative(-2.625f)
                horizontalLineToRelative(6.541f)
                verticalLineToRelative(2.625f)
                close()
                moveToRelative(0f, 6.541f)
                verticalLineToRelative(-2.666f)
                horizontalLineToRelative(6.541f)
                verticalLineToRelative(2.666f)
                close()
            }
        }.build()
    }
}