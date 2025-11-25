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
fun DefensoriaScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {

                Text(
                    text = "DEFENSORÍA DEL PUEBLO",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "La Defensoría brinda orientación, acompañamiento y protección de los derechos de las víctimas. Presta asesoría jurídica y canaliza casos a las autoridades competentes.",
                    fontSize = 14.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.defensoria),
                contentDescription = "Defensoría",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "Sede Principal Bogotá",
                direccion = "Calle 55 # 10-32",
                correo = "atencion@defensoria.gov.co",
                telefono = "3147550"
            )

            ContactCard(
                titulo = "Línea Nacional",
                direccion = "Disponible en todo el país",
                correo = "linea@defensoria.gov.co",
                telefono = "018000 914814"
            )
        }
    }
}
