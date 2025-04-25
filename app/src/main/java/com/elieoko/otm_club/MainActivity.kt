package com.elieoko.otm_club

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.elieoko.otm_club.domain.route.Navigation
import com.elieoko.otm_club.presentation.ui.theme.OtmclubTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController
    @SuppressLint("UnrememberedMutableState", "UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OtmclubTheme {
                navHostController = rememberNavController()
                Scaffold() {
                    Navigation(navHostController)
                }
            }
        }
    }
}
