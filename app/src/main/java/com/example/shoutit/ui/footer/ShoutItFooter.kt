package com.example.shoutit.ui.footer

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

@Composable
fun ShoutItFooter() {
    Surface(
        color = Color(0xFFF5F5F5),
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "ShoutIt.com.co", fontSize = 12.sp)
            Text(text = "Gracias por tu visita", fontSize = 12.sp)
            Text(text = "Todos los derechos reservados © 2025", fontSize = 12.sp)
        }
    }
}
