package com.elieoko.otm_club.presentation.ui.pages.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.elieoko.otm_club.domain.route.ScreenRoute
import com.elieoko.otm_club.presentation.ui.components.Label
import com.elieoko.otm_club.presentation.ui.components.MButtonIcon
import com.elieoko.otm_club.presentation.ui.components.MTextField
import com.elieoko.otm_club.presentation.ui.components.Space
import kotlinx.coroutines.launch

@Composable
fun RegisterPage(navC: NavHostController) {
    RegisterPageBody(navC)
}

@Composable
fun RegisterPageBody(navC: NavHostController? = null) {
    val scope = rememberCoroutineScope()
    Column(Modifier.background(Color.White)) {
        Column(Modifier.padding(20.dp).fillMaxWidth()) {
            Space(y = 12)
            Text(
                buildAnnotatedString {
                    append("Developpe ")
                    withStyle(style = SpanStyle(color = Color.Blue.copy(0.4f),fontFamily = FontFamily.Serif)) {
                        append("HardSkills")
                    }
                    append(" & ")

                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red.copy(0.4f),fontFamily = FontFamily.Serif)) {
                        append("SoftSkills")
                    }
                    append(" des maintenants avec ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Gray.copy(0.4f),fontFamily = FontFamily.Serif)) {
                        append("OTM")
                    }
                },
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif
            )
            Space(y = 10)
            MTextField(title = "Nom")
            Space(y=5)
            MTextField(title = "Prenom")
            Space(y=5)
            MTextField(title = "Telephone")
            Space(y=5)
            MTextField(title = "Status Actuel")
            Space(y=5)
            MTextField(title = "Mot de passe")
            Space(y=18)
            MButtonIcon(modifier = Modifier.fillMaxWidth(),backgroundColor = Color(0xff7494ec), click = {}, icon = {}, label = "S'enregistrer", textColor = Color.White)
        }
        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.White),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth().padding(0.dp),
                shape = RoundedCornerShape(topEnd = 45.dp, topStart = 45.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF3F51B5).copy(0.7f)
                )) {
                Column(Modifier.padding(30.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Label("Bienvenue, dans le club d'informatique", color = Color.White, size = 28, fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold)
                    Space(y=8)
                    Label("Aviez vous un compte ?", size = 18, fontFamily = FontFamily.Serif)
                    Space(y=18)
                    //0xff7494ec
                    MButtonIcon(backgroundColor = Color(0xff7494ec), click = {
                        scope.launch {
                            navC?.navigate(route = ScreenRoute.AuthLogin.name){
                                popUpTo(navC.graph.id){
                                    inclusive = true
                                }
                            }
                        }
                    }, icon = {}, label = "Se connecter", textColor = Color.White)
                    Space(y=18)
                }
            }
        }
    }
}

@Composable
@Preview
fun RegisterPagePreview(){
    RegisterPageBody()
}