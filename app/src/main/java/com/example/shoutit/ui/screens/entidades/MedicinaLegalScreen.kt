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
fun MedicinaLegalScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "MEDICINA LEGAL",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Medicina Legal realiza valoraciones físico-forenses, dictámenes médico-legales y acompañamiento técnico en casos de violencia física, sexual y psicológica.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.medicinalegal),
                contentDescription = "Medicina Legal",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "Instituto Nacional de Medicina Legal",
                direccion = "Calle 7 # 12-61",
                correo = "info@medicinalegal.gov.co",
                telefono = "5702000 Ext 5533"
            )
        }
    }
}
