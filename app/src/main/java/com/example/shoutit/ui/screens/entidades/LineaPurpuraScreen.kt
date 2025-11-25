package com.example.shoutit.ui.screens.entidades

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoutit.R

@Composable
fun LineaPurpuraScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "LÍNEA PÚRPURA",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "La Línea Púrpura es un canal de orientación psicológica y acompañamiento para mujeres víctimas de violencia, disponible 24/7 en Bogotá.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.lineapurpura),
                contentDescription = "Línea púrpura",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "Línea Telefónica",
                direccion = "Disponible 24/7 en Bogotá",
                correo = "lineapurpura@bogota.gov.co",
                telefono = "018000 112137"
            )
        }
    }
}
