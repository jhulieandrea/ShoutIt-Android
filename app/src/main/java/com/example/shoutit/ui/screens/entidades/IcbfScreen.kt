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
fun IcbfScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "ICBF",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "El Instituto Colombiano de Bienestar Familiar protege los derechos de los niños, niñas y adolescentes. Atiende casos de violencia intrafamiliar y abuso infantil.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.icbf),
                contentDescription = "ICBF",
                modifier = Modifier.size(100.dp).padding(start = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            ContactCard(
                titulo = "ICBF Dirección Regional",
                direccion = "Carrera 9 # 67-41",
                correo = "atencionciudadania@icbf.gov.co",
                telefono = "018000 918080"
            )
        }
    }
}

