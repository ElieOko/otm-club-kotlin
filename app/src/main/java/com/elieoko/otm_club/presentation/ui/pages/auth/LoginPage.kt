package com.elieoko.otm_club.presentation.ui.pages.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.elieoko.otm_club.presentation.ui.components.Label
import com.elieoko.otm_club.presentation.ui.components.MButtonIcon
import com.elieoko.otm_club.presentation.ui.components.MTextField
import com.elieoko.otm_club.presentation.ui.components.Space
import com.elieoko.otm_club.R
import com.elieoko.otm_club.domain.route.ScreenRoute
import kotlinx.coroutines.launch

@Composable
fun LoginPage(navC: NavHostController) {
    LoginPageBody(navC)
}

@Composable
fun LoginPageBody(navC: NavHostController? = null) {
    val scope = rememberCoroutineScope()
    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF332C41),
                Color(0xFF194044),
                Color(0xFF2B4B4F),
                Color(0xFF0E0748)
            )
        )
    }
    Column(Modifier.fillMaxSize().background(Color(0xFF25262C))) {
        Column(
            modifier = Modifier
                .background(color = Color(0xFF25262C))
                .verticalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth().padding(0.dp),
                shape = RoundedCornerShape(bottomEnd = 45.dp, bottomStart = 45.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF14161E).copy(0.7f)
                )) {
                Column(Modifier.padding(30.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Label("Bienvenue, dans le club d'informatique", color = Color.White, size = 28, fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold)
                    Space(y=8)
                    Label("N'aviez vous pas un compte ?", size = 18, fontFamily = FontFamily.Serif)
                    Space(y=18)
                    MButtonIcon(backgroundColor = Color(0xFFFFC107), click = {
                        scope.launch {
                            navC?.navigate(route = ScreenRoute.AuthRegister.name){
                                popUpTo(navC.graph.id){
                                    inclusive = true
                                }
                            }
                        }
                    }, icon = {}, label = "S'enregistrer", textColor = Color.White)
                }
            }
            Column(Modifier.padding(20.dp)) {
                Label("Rejoignez votre communaute OTM", color = Color.White, size = 25, fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold)
                Space(y = 23)
                MTextField(title = "Telephone", iconStart = R.drawable.phone_, colorUniversalBorder = Color(
                    0xFFD79840
                ).copy(0.7f))
                Space(y=10)
                MTextField(title = "Mot de passe", iconStart = R.drawable.password, colorUniversalBorder = Color(
                    0xFFD79840
                ).copy(0.7f))
                Space(y=35)
                MButtonIcon(modifier = Modifier.fillMaxWidth(),backgroundColor = Color(0xFFFFC107), click = {
                    scope.launch {
                        navC?.navigate(route = ScreenRoute.Home.name){
                            popUpTo(navC.graph.id){
                                inclusive = true
                            }
                        }
                    }
                }, icon = {}, label = "Connexion", textColor = Color.White)
            }
        }
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Row(Modifier.fillMaxWidth().padding(10.dp), horizontalArrangement = Arrangement.SpaceEvenly) {

                Image(
                    painter = painterResource(R.drawable.lasy),
                    contentScale = ContentScale.Fit,
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape).size(100.dp).border(
                            BorderStroke(2.dp, rainbowColorsBrush),
                            CircleShape
                        )
                )

                Image(
                    painter = painterResource(R.drawable.hec),
                    contentScale = ContentScale.Fit,
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape).size(100.dp).border(
                            BorderStroke(2.dp, rainbowColorsBrush),
                            CircleShape
                        )
                )
            }
            Space(y=58)
        }
    }
}
@Composable
@Preview
fun LoginPagePreview(){

    LoginPageBody()
}