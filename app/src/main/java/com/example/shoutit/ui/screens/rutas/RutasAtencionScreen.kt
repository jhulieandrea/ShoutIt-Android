package com.example.shoutit.ui.screens.rutas

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
fun RutasAtencionScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "RUTAS DE ATENCIÓN",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                RutaCard(
                    title = "POLICÍA NACIONAL",
                    imageRes = R.drawable.policianacional,
                    onClick = { navController.navigate("ruta_policia") }
                )
                RutaCard(
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
                RutaCard(
                    title = "DEFENSORÍA DEL PUEBLO",
                    imageRes = R.drawable.defensoria,
                    onClick = { navController.navigate("ruta_defensoria") }
                )
                RutaCard(
                    title = "MEDICINA LEGAL",
                    imageRes = R.drawable.medicinalegal,
                    onClick = { navController.navigate("ruta_medicina") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                RutaCard(
                    title = "ICBF",
                    imageRes = R.drawable.icbf,
                    onClick = { navController.navigate("ruta_icbf") }
                )
                RutaCard(
                    title = "LÍNEA PÚRPURA",
                    imageRes = R.drawable.lineapurpura,
                    onClick = { navController.navigate("ruta_lineapurpura") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                RutaCard(
                    title = "SECRETARÍA DISTRITAL DE LA MUJER",
                    imageRes = R.drawable.secretariadistritalmujer,
                    onClick = { navController.navigate("ruta_secretaria_mujer") }
                )
                RutaCard(
                    title = "CASAS DE JUSTICIA",
                    imageRes = R.drawable.casasjusticia,
                    onClick = { navController.navigate("ruta_casas_justicia") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                RutaCard(
                    title = "COMISARÍAS DE FAMILIA",
                    imageRes = R.drawable.comisariasfamilia,
                    onClick = { navController.navigate("ruta_comisarias_familia") }
                )
            }
        }
    }
}

@Composable
private fun RutaCard(
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
                modifier = Modifier.size(96.dp)
            )
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
