package com.elieoko.otm_club.presentation.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun Label(value:String,modifier: Modifier = Modifier,size:Int = 14,color: Color= Color.White,fontWeight: FontWeight=FontWeight.Normal, fontFamily: FontFamily = FontFamily.Default, textAlign: TextAlign = TextAlign.Unspecified){
    Text(value, modifier = modifier, fontSize = size.sp, color = color, fontWeight = fontWeight, fontFamily = fontFamily, textAlign = textAlign)
}