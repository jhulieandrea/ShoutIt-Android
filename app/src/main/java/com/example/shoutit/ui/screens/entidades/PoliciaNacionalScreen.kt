package com.example.shoutit.ui.screens.entidades

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun PoliciaNacionalScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "POLICÍA NACIONAL",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "La denuncia puede hacerse en las estaciones de Policía o en las Unidades de Policía Judicial como la Dijín, Sijín o el CTI. Estas remiten el caso a la Fiscalía y a Medicina Legal.",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.policianacional),
                contentDescription = "Policía Nacional",
                modifier = Modifier
                    .size(96.dp)
                    .padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ContactCard(
                titulo = "Oficina Prevención",
                direccion = "Avenida Caracas N° 6–05",
                correo = "mebog.ofpre-pla@policia.gov.co",
                telefono = "3057691842"
            )
            ContactCard(
                titulo = "Comando Operativo Ciudadano 1 - Zona Norte",
                direccion = "Avenida Circunvalar N° 36–00",
                correo = "mebog.coper1@policia.gov.co",
                telefono = "3146889247"
            )
            ContactCard(
                titulo = "Comando Operativo Ciudadano 2 - Zona Sur",
                direccion = "Avenida 1ra de Mayo N° 1–90 Este",
                correo = "mebog.cosec2@policia.gov.co",
                telefono = "3502150292"
            )
            ContactCard(
                titulo = "Comando Operativo Ciudadano 3 - Zona Occidental",
                direccion = "Calle 41D Sur N° 78M–05",
                correo = "mebog.coper3@policia.gov.co",
                telefono = "3246820201"
            )
            ContactCard(
                titulo = "Comando Operativo Ciudadano 4 - Zona Oriental",
                direccion = "Calle 19 N° 00–75",
                correo = "mebog.cosec4@policia.gov.co",
                telefono = "3232416216"
            )
            ContactCard(
                titulo = "Oficina de Infancia y Adolescencia",
                direccion = "Calle 12 N° 30–35",
                correo = "mebog.ginad@policia.gov.co",
                telefono = "3502150335"
            )
            ContactCard(
                titulo = "Centro Transitorio de Protección",
                direccion = "Carrera 32 N° 14–20",
                correo = "mebog.upj@policia.gov.co",
                telefono = "3148210328"
            )
        }
    }
}
