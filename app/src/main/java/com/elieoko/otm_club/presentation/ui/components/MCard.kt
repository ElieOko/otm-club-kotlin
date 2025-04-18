package com.elieoko.otm_club.presentation.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import java.nio.file.Files.size

data class BorderColorPosition(
    val left : Color =  Color.Unspecified,
    val top : Color = Color.Unspecified ,
    val bottom : Color = Color.Gray ,
    val right : Color =  Color.Unspecified
)

data class StrokeWidthPosition(
    val left   : Float =   3f,
    val top    : Float = 3f ,
    val bottom : Float = 3f,
    val right  : Float = 3f
)

@Composable
fun CardCustomBorderColor(
    with: Int=358,
    height :Int=200,
    colorBorder: BorderColorPosition = BorderColorPosition(),
    strokeWidth: StrokeWidthPosition = StrokeWidthPosition(),
    shapeFigure : Shape = RectangleShape,
    cardColor: Color = Color.White.copy(0.4f),
    elevation: CardElevation = CardDefaults.cardElevation(),
    content: @Composable () -> Unit
){
    Card(
        Modifier
            .size(
                width = with.dp,
                height = height.dp
            ),
        elevation = elevation,
        shape = shapeFigure
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(cardColor)){
            /*
            * @Component
            */
            content()
            Canvas(Modifier.fillMaxSize()){
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawLine( //bottom line
                    start = Offset(x = 0f, y = canvasHeight),
                    end = Offset(x = canvasWidth, y = canvasHeight),
                    strokeWidth = strokeWidth.bottom,
                    color = colorBorder.bottom
                )
                drawLine( //top line
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = canvasWidth, y = 0f),
                    strokeWidth = strokeWidth.top,
                    color = colorBorder.top
                )
                drawLine( //left line
                    start = Offset(x = 0f, y = 0f),
                    end = Offset(x = 0f, y = canvasHeight),
                    strokeWidth = strokeWidth.left,
                    color = colorBorder.left
                )
                drawLine( //right line
                    start = Offset(x = canvasWidth, y = 0f),
                    end = Offset(x = canvasWidth, y = canvasHeight),
                    strokeWidth = strokeWidth.right,
                    color = colorBorder.right
                )
            }
        }
    }
}
