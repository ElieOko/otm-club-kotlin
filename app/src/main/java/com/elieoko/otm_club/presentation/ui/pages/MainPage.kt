package com.elieoko.otm_club.presentation.ui.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.elieoko.otm_club.R
import com.elieoko.otm_club.domain.models.Item
import com.elieoko.otm_club.domain.route.ScreenRoute
import com.elieoko.otm_club.presentation.ui.components.Space
import com.elieoko.otm_club.presentation.ui.pages.activity.ActivityPage
import com.elieoko.otm_club.presentation.ui.pages.home.HomePage
import com.elieoko.otm_club.presentation.ui.pages.home.ITClubTeamsPage
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainPage(navC: NavHostController) {
    var state = rememberScrollState()
    val scope = rememberCoroutineScope()
    val route = listOf<Item>(Item("home",R.drawable.home), Item("Equipe",R.drawable.team), Item("Activite",R.drawable.architecture), Item("Contact",R.drawable.assist))
    var position by remember { mutableIntStateOf(0) }
    Scaffold(
        containerColor = Color(0xFF25262C),
        contentColor = Color.White,
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                NavigationBar(
                    containerColor = Color(0xFFE0E7FF), // Light blueish background
                    contentColor = Color(0xFF1E3A8A),   // Deep Indigo
                    modifier = Modifier
                        .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                        .background(Color(0xFF0284C7)) // same as containerColor for safety
                ) {
                    route.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = position == index,
                            onClick = { position = index },
                            icon = {
                                Icon(
                                    painter = painterResource(item.icon),
                                    contentDescription = item.name,
                                    modifier = Modifier.size(28.dp)
                                )
                            },
                            label = {
                                Text(
                                    text = item.name,
                                    fontSize = 11.sp
                                )
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = Color.White,
                                selectedTextColor = Color.White,
                                indicatorColor = Color(0xFF3B82F6), // Bright blue indicator
                                unselectedIconColor = Color.Gray,
                                unselectedTextColor = Color.Gray
                            )
                        )
                    }
                }
            }
        }
    ) {
        Column(Modifier.verticalScroll(state).background(Color(0xFF25262C))) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.hec_studeny),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(280.dp)
                        .clip(RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp))
                )

                Column {
                    Space(y = 14)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        IconButton(
                            onClick = { /* back */ },
                            modifier = Modifier
                                .background(Color.White.copy(alpha = 0.7f), CircleShape)
                        ) {
                            Icon(painterResource(R.drawable.user), contentDescription = "Back", modifier = Modifier.size(28.dp))
                        }

                        IconButton(
                            onClick = {

                                scope.launch {
                                    navC.navigate(route = ScreenRoute.AuthLogin.name){
                                        popUpTo(navC.graph.id){
                                            inclusive = true
                                        }
                                    }
                                }
                            },
                            modifier = Modifier
                                .background(Color.White.copy(alpha = 0.7f), CircleShape)
                        ) {
                            Icon(painterResource(R.drawable.logout), contentDescription = "logout", modifier = Modifier.size(28.dp))
                        }
                    }
                }


                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 24.dp, bottom = 24.dp)
                ) {
                    Text("HEC", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Text("Ensemble agissons pour l'epanouissement", color = Color.White, fontSize = 14.sp)
                }
            }
            when(position){
                0 ->{
                    HomePage()
                }
                1 ->{
                    ITClubTeamsPage()
                }
                2->{
                    ActivityPage()
                }
            }
        }
    }
}