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

data class EntidadGeneroItem(val title: String, val imageRes: Int, val route: String)

@Composable
fun ViolenciaGeneroScreen(navController: NavController) {

    val entidades = listOf(
        EntidadGeneroItem("LÍNEA PÚRPURA", R.drawable.lineapurpura, "ruta_lineapurpura"),
        EntidadGeneroItem("SECRETARÍA DISTRITAL DE LA MUJER", R.drawable.secretariadistritalmujer, "ruta_secretaria_mujer"),
        EntidadGeneroItem("DEFENSORÍA DEL PUEBLO", R.drawable.defensoria, "ruta_defensoria")
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Text(
            text = "VIOLENCIA DE GÉNERO",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "La violencia de género es aquella dirigida hacia una persona debido a su identidad o rol de género. Incluye agresiones físicas, psicológicas, sexuales y económicas motivadas por desigualdad y discriminación.",
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
                EntidadGeneroCard(item = item) {
                    navController.navigate(item.route)
                }
            }
        }
    }
}

@Composable
fun EntidadGeneroCard(item: EntidadGeneroItem, onClick: () -> Unit) {
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
