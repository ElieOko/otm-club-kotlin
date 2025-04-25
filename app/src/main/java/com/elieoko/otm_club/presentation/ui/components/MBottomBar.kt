package com.elieoko.otm_club.presentation.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun BottomAppBarWithCenterButton(
    selectedIndex: Int = 0,
    onItemSelected: (Int) -> Unit = {}
) {
    val icons = listOf(Icons.Default.Home, Icons.Default.Search, Icons.Default.AccountCircle, Icons.Default.Notifications)
    val labels = listOf("Home", "Search", "", "History")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            icons.forEachIndexed { index, icon ->
                if (index == 2) {
                    Spacer(modifier = Modifier.width(48.dp)) // espace pour le FAB
                } else {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .clickable { onItemSelected(index) }
                            .padding(8.dp)
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = labels[index],
                            tint = if (selectedIndex == index) Color.White else Color.Gray
                        )
                        Text(
                            text = labels[index],
                            fontSize = 10.sp,
                            color = if (selectedIndex == index) Color.White else Color.Gray
                        )
                    }
                }
            }
        }


    // FloatingActionButton central
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        FloatingActionButton(
            onClick = { onItemSelected(2) },
            containerColor = Color.White,
            contentColor = Color.Black
        ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Scan")
        }
    }
}

