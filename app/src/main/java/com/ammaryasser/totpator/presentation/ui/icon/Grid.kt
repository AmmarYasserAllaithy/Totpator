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
fun GridView(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "grid_view",
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
                moveTo(7.875f, 18.667f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.771f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.854f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.083f, 0.771f, -1.854f)
                quadToRelative(0.771f, -0.771f, 1.854f, -0.771f)
                horizontalLineToRelative(8.167f)
                quadToRelative(1.083f, 0f, 1.875f, 0.771f)
                quadToRelative(0.791f, 0.771f, 0.791f, 1.854f)
                verticalLineToRelative(8.167f)
                quadToRelative(0f, 1.083f, -0.791f, 1.854f)
                quadToRelative(-0.792f, 0.771f, -1.875f, 0.771f)
                close()
                moveToRelative(0f, 16.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.771f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.854f)
                verticalLineToRelative(-8.167f)
                quadToRelative(0f, -1.083f, 0.771f, -1.875f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(8.167f)
                quadToRelative(1.083f, 0f, 1.875f, 0.791f)
                quadToRelative(0.791f, 0.792f, 0.791f, 1.875f)
                verticalLineToRelative(8.167f)
                quadToRelative(0f, 1.083f, -0.791f, 1.854f)
                quadToRelative(-0.792f, 0.771f, -1.875f, 0.771f)
                close()
                moveToRelative(16.083f, -16.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.771f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.854f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.083f, 0.771f, -1.854f)
                quadToRelative(0.771f, -0.771f, 1.854f, -0.771f)
                horizontalLineToRelative(8.167f)
                quadToRelative(1.083f, 0f, 1.854f, 0.771f)
                quadToRelative(0.771f, 0.771f, 0.771f, 1.854f)
                verticalLineToRelative(8.167f)
                quadToRelative(0f, 1.083f, -0.771f, 1.854f)
                quadToRelative(-0.771f, 0.771f, -1.854f, 0.771f)
                close()
                moveToRelative(0f, 16.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.771f)
                quadToRelative(-0.771f, -0.771f, -0.771f, -1.854f)
                verticalLineToRelative(-8.167f)
                quadToRelative(0f, -1.083f, 0.771f, -1.875f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(8.167f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.875f)
                verticalLineToRelative(8.167f)
                quadToRelative(0f, 1.083f, -0.771f, 1.854f)
                quadToRelative(-0.771f, 0.771f, -1.854f, 0.771f)
                close()
                moveTo(7.875f, 16.042f)
                horizontalLineToRelative(8.167f)
                verticalLineTo(7.875f)
                horizontalLineTo(7.875f)
                close()
                moveToRelative(16.083f, 0f)
                horizontalLineToRelative(8.167f)
                verticalLineTo(7.875f)
                horizontalLineToRelative(-8.167f)
                close()
                moveToRelative(0f, 16.083f)
                horizontalLineToRelative(8.167f)
                verticalLineToRelative(-8.167f)
                horizontalLineToRelative(-8.167f)
                close()
                moveToRelative(-16.083f, 0f)
                horizontalLineToRelative(8.167f)
                verticalLineToRelative(-8.167f)
                horizontalLineTo(7.875f)
                close()
                moveToRelative(16.083f, -16.083f)
                close()
                moveToRelative(0f, 7.916f)
                close()
                moveToRelative(-7.916f, 0f)
                close()
                moveToRelative(0f, -7.916f)
                close()
            }
        }.build()
    }
}