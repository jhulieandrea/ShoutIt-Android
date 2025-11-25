package com.example.shoutit.ui.screens.violencia

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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

data class EntidadPsicoItem(
    val title: String,
    val imageRes: Int,
    val route: String
)

@Composable
fun ViolenciaPsicologicaScreen(navController: NavController) {

    val entidades = listOf(
        EntidadPsicoItem("POLICÍA NACIONAL", R.drawable.policianacional, "ruta_policia"),
        EntidadPsicoItem("FISCALÍA GENERAL", R.drawable.fiscaliageneral, "ruta_fiscalia"),
        EntidadPsicoItem("DEFENSORÍA DEL PUEBLO", R.drawable.defensoria, "ruta_defensoria"),
        EntidadPsicoItem("LÍNEA PÚRPURA", R.drawable.lineapurpura, "ruta_lineapurpura")
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {

        Text(
            text = "VIOLENCIA PSICOLÓGICA",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "La violencia psicológica incluye acciones o conductas que buscan controlar, intimidar, manipular o degradar emocionalmente a la víctima. Puede manifestarse a través de humillaciones, amenazas, insultos, aislamiento, chantaje emocional y otras formas de daño emocional.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(top = 12.dp, bottom = 20.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 150.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(entidades) { item ->
                EntidadPsicologicaCard(item = item) {
                    navController.navigate(item.route)
                }
            }
        }
    }
}

@Composable
fun EntidadPsicologicaCard(
    item: EntidadPsicoItem,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onClick() },
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier.size(96.dp)
            )

            Text(
                text = item.title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
