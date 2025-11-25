package com.example.shoutit.ui.screens.violencia

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
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
fun ViolenciaFisicaScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "VIOLENCIA FÍSICA",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "La violencia física consiste en el uso de la fuerza o cualquier acción que cause daño, dolor o sufrimiento corporal a una persona. Este tipo de violencia incluye golpes, empujones, quemaduras, mordeduras, uso de objetos o armas, y cualquier acto que afecte la integridad física de la víctima.",
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "RUTAS DE ATENCIÓN",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Column {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                RutaViolenciaCard(
                    title = "POLICÍA NACIONAL",
                    imageRes = R.drawable.policianacional,
                    onClick = { navController.navigate("ruta_policia") }
                )
                RutaViolenciaCard(
                    title = "FISCALÍA GENERAL",
                    imageRes = R.drawable.fiscaliageneral,
                    onClick = { navController.navigate("ruta_fiscalia") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                RutaViolenciaCard(
                    title = "MEDICINA LEGAL",
                    imageRes = R.drawable.medicinalegal,
                    onClick = { navController.navigate("ruta_medicina") }
                )
                RutaViolenciaCard(
                    title = "DEFENSORÍA DEL PUEBLO",
                    imageRes = R.drawable.defensoria,
                    onClick = { navController.navigate("ruta_defensoria") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                RutaViolenciaCard(
                    title = "LÍNEA PÚRPURA",
                    imageRes = R.drawable.lineapurpura,
                    onClick = { navController.navigate("ruta_lineapurpura") }
                )
            }
        }
    }
}

@Composable
private fun RutaViolenciaCard(
    title: String,
    imageRes: Int,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(150.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = title,
                modifier = Modifier.size(80.dp)
            )
            Text(
                text = title,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
