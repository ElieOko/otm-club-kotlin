package com.elieoko.otm_club.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elieoko.otm_club.R
import com.elieoko.otm_club.domain.models.Item

@Composable
fun UXIcon(
    item: Item
){
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Card{
            Icon(painterResource(item.icon), contentDescription = "", modifier = Modifier.size(55.dp))
        }
        Space(y = 10)
        Label(item.name, textAlign = TextAlign.Center, color = Color.Black)
    }
}