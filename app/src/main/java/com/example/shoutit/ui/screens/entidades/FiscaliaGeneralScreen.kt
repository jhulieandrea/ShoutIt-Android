package com.example.shoutit.ui.screens.entidades


import androidx.compose.foundation.Image
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
fun FiscaliaGeneralScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {

                Text(
                    text = "FISCALÍA GENERAL DE LA NACIÓN",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "La Fiscalía investiga los delitos y orienta a las víctimas en la presentación de las denuncias. Recibe casos remitidos por Policía Judicial y coordina diligencias de protección y judicialización.",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.fiscaliageneral),
                contentDescription = "Fiscalía General",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "Seccional Bogotá",
                direccion = "Carrera 7 # 21-24",
                correo = "fiscalia.bogota@fiscalia.gov.co",
                telefono = "5702000"
            )

            ContactCard(
                titulo = "Unidad de Delitos Sexuales",
                direccion = "Calle 19 # 16-32",
                correo = "delitossexuales@fiscalia.gov.co",
                telefono = "5702000 Ext 1111"
            )
        }
    }
}

