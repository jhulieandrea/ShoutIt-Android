package com.example.shoutit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.shoutit.ui.header.ShoutItHeader
import com.example.shoutit.ui.footer.ShoutItFooter
import com.example.shoutit.ui.navigation.AppNavigation
import com.example.shoutit.ui.theme.ShoutItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoutItApp()
        }
    }
}

@Composable
fun ShoutItApp() {
    ShoutItTheme {
        val navController = rememberNavController()

        Scaffold(
            topBar = {
                ShoutItHeader(
                    onInicioClick = { navController.navigate("home") },
                    onTiposClick = { navController.navigate("tiposViolencia") },
                    onRutasClick = { navController.navigate("rutasAtencion") }
                )
            },
            bottomBar = {
                ShoutItFooter()
            }
        ) { innerPadding ->
            AppNavigation(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
