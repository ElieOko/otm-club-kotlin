package com.elieoko.otm_club.presentation.ui.pages.activity

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elieoko.otm_club.R
import com.elieoko.otm_club.domain.models.Item

@Composable
@Preview
fun ActivityPage(){
    val listActivity = listOf<Item>(
        Item("Atelier d'apprentissage", R.drawable.learn, "1h30 minutes"),
        Item("Conference", R.drawable.speech, "1h45 minutes"),
        Item("Hackathon", R.drawable.game_, "3jours"),
        Item("Support & Assistance", R.drawable.assist, "7/7j")
    )
    Column(Modifier.padding(10.dp)) {
        listActivity.forEach {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E7FF).copy(0.4f)),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Icon(painterResource(it.icon), contentDescription = null, modifier = Modifier.size(40.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(it.name, style = MaterialTheme.typography.titleMedium)
                        Text(it.desc, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }

    }
}