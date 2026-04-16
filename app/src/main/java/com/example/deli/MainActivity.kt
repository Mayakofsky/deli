package com.example.deli

import SecondScreen
import DobavitDolshnika
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.deli.ui.theme.DELITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DELITheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "screen_1"
                    ) {
                        composable("screen_1") {
                            MainScreen(
                                innerPadding = innerPadding,
                                onNavigateToEvent = { navController.navigate("screen_2") },
                                onNavigateToDebtor = { navController.navigate("screen_3") },
                                onNavigateToProfile = { navController.navigate("screen_1") },
                                onNavigateToProfileInfo = {navController.navigate("screen_4")}

                            )
                        }
                        composable("screen_2") {
                            SecondScreen(
                                innerPadding = innerPadding,
                                onBack = { navController.popBackStack() }
                            )
                        }
                        composable("screen_3") {
                            DobavitDolshnika(
                                innerPadding = innerPadding,
                                onBack = { navController.popBackStack() }
                            )
                        }
                        composable("screen_4") {
                            ProfileInfo(
                              innerPadding = innerPadding,
                              onBack = {navController.popBackStack() }
                            )
                        }

                    }
                }
            }
        }
    }

}