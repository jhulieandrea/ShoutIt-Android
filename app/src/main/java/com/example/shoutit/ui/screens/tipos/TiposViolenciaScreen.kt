package com.example.shoutit.ui.screens.tipos

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shoutit.viewmodel.TiposViolenciaViewModel
import com.example.shoutit.ui.navigation.Routes

@Composable
fun TiposViolenciaScreen(
    navController: NavHostController,
    viewModel: TiposViolenciaViewModel
) {
    val lista = viewModel.tipos.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        // =======================
        // ESTADO: CARGANDO
        // =======================
        if (lista.value.isEmpty()) {
            Text(
                text = "Cargando información...",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
        } else {

            // =======================
            // ESTADO: LISTA CARGADA
            // =======================
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                items(lista.value) { item ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable {
                                when (item.id) {
                                    1 -> navController.navigate(Routes.VIOLENCIA_FISICA)
                                    2 -> navController.navigate(Routes.VIOLENCIA_PSICOLOGICA)
                                    3 -> navController.navigate(Routes.VIOLENCIA_SEXUAL)
                                    4 -> navController.navigate(Routes.VIOLENCIA_ECONOMICA)
                                    5 -> navController.navigate(Routes.VIOLENCIA_GENERO)
                                }
                            },
                        elevation = CardDefaults.cardElevation(6.dp)
                    ) {
                        Column(Modifier.padding(16.dp)) {
                            Text(
                                text = item.titulo,
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(text = item.descripcion)
                        }
                    }
                }
            }
        }
    }
}
