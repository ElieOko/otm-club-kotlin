package com.elieoko.otm_club.presentation.ui.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elieoko.otm_club.domain.models.Item
import com.elieoko.otm_club.presentation.ui.components.UXIcon
import com.elieoko.otm_club.R
import com.elieoko.otm_club.presentation.ui.components.BorderColorPosition
import com.elieoko.otm_club.presentation.ui.components.CardCustomBorderColor
import com.elieoko.otm_club.presentation.ui.components.Label
import com.elieoko.otm_club.presentation.ui.components.Space
import com.elieoko.otm_club.presentation.ui.components.StrokeWidthPosition

@Composable
fun HomePage(){
    HomePageBody()
}

@Composable
fun HomePageBody(){
    val listItems = listOf<Item>(
        Item("Programmation",R.drawable.code),
        Item("Reseaux",R.drawable.network),
        Item("Conception",R.drawable.concepts),
        Item("Architecture",R.drawable.architecture),
        Item("Programmation",R.drawable.code),
        Item("Reseaux",R.drawable.network),
        Item("Conception",R.drawable.concepts),
        Item("Architecture",R.drawable.architecture),
        )
    val state = rememberScrollState()
    Column {
        Row(Modifier.fillMaxWidth().padding(6.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Label("Modules Disponibles", fontFamily = FontFamily.Serif, color = Color.Black.copy(0.5f), fontWeight = FontWeight.Bold, size = 18)
            Label("(10)", fontFamily = FontFamily.Serif, color = Color.Black.copy(0.5f), fontWeight = FontWeight.Bold, size = 18)
        }
        Space(y = 5)
        Row(
            modifier = Modifier.fillMaxWidth().padding(1.dp).horizontalScroll(state)
        ) {
            listItems.map {
                CardCustomBorderColor(
                    with = 120,
                    height = 120,
                    strokeWidth = StrokeWidthPosition(bottom = 33f),
                    colorBorder = BorderColorPosition(bottom = Color.Blue.copy(0.2f)),
                    shapeFigure =  RoundedCornerShape(topEnd = 45.dp, bottomStart = 45.dp),
                    ){

                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        IconButton(onClick = {}) {
                            Image(
                                painter = painterResource(id = it.icon),
                                contentDescription = null,
                                contentScale = ContentScale.FillHeight,
                                colorFilter = ColorFilter.tint(color = Color.Blue.copy(0.2f)),
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(RoundedCornerShape(10))
                            )
                        }
                        Text(text = it.name, fontWeight = FontWeight.Bold, color = Color.Black.copy(0.5f))
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }
}

@Composable
@Preview
fun HomePagePreview(){
    HomePageBody()
}