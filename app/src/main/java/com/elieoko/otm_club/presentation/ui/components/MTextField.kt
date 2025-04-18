package com.elieoko.otm_club.presentation.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elieoko.otm_club.R

@Composable
fun MTextField(
    value : String = "",
    title : String ="",
    onChangeValue : (String)-> Unit = {},
    iconStart : Int = R.drawable.ic_launcher_foreground,
    iconEnd : Int = 0,
    colorUniversalBorder : Color = Color(0xFF464E4F)

){
    OutlinedTextField(
        value = value,
        onValueChange = onChangeValue,
        label = { Text(title) },
        leadingIcon = {
            Icon(
                painter = painterResource(id = iconStart),
                contentDescription = null,
                modifier = Modifier.size(25.dp),
                tint = Color.Black
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = colorUniversalBorder,
            unfocusedBorderColor = colorUniversalBorder,
            focusedLabelColor = colorUniversalBorder,
            unfocusedLabelColor = colorUniversalBorder,
            cursorColor = colorUniversalBorder,
            focusedLeadingIconColor = colorUniversalBorder,
            unfocusedLeadingIconColor = colorUniversalBorder
        ),
        textStyle = TextStyle(color = colorUniversalBorder),
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(topEnd = 18.dp, bottomStart = 18.dp)
    )
}

@Composable
@Preview
fun Mtex(){
    MTextField()
}