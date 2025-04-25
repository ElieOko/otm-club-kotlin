package com.elieoko.otm_club.domain.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elieoko.otm_club.presentation.ui.pages.MainPage
import com.elieoko.otm_club.presentation.ui.pages.auth.LoginPage
import com.elieoko.otm_club.presentation.ui.pages.auth.RegisterPage

@Composable
fun Navigation(navC: NavHostController){
    NavHost(navController = navC, startDestination = ScreenRoute.AuthLogin.name, route = "root") {
        composable(ScreenRoute.AuthLogin.name) {
            LoginPage(navC)
        }
        composable(ScreenRoute.AuthRegister.name) {
            RegisterPage(navC)
        }
        composable(ScreenRoute.Home.name) {
            MainPage(navC)
        }
    }
}