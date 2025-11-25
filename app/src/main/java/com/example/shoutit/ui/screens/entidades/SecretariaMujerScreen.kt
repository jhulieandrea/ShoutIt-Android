package com.example.shoutit.ui.screens.entidades

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
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
fun SecretariaMujerScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "SECRETARÍA DISTRITAL DE LA MUJER",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Promueve los derechos de las mujeres, prevención de violencias basadas en género y atención integral a víctimas mediante programas y casas de acogida.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.secretariadistritalmujer),
                contentDescription = "Secretaría de la Mujer",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "Sede Principal",
                direccion = "Carrera 13 # 63-18",
                correo = "mujer@bogota.gov.co",
                telefono = "601 3808400"
            )
        }
    }
}
