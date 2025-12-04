package com.example.shoutit.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.lifecycle.viewmodel.compose.viewModel

// HOME
import com.example.shoutit.ui.screens.home.HomeScreen

// TIPOS
import com.example.shoutit.ui.screens.tipos.TiposViolenciaScreen
import com.example.shoutit.viewmodel.TiposViolenciaViewModel

// RUTAS
import com.example.shoutit.ui.screens.rutas.RutasAtencionScreen

// ENTIDADES
import com.example.shoutit.ui.screens.entidades.*

// VIOLENCIAS
import com.example.shoutit.ui.screens.violencia.*

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        modifier = modifier
    ) {

        // HOME
        composable(Routes.HOME) {
            HomeScreen(navController)
        }

        // TIPOS DE VIOLENCIA
        composable(Routes.TIPOS_VIOLENCIA) {
            val vm: TiposViolenciaViewModel = viewModel()
            TiposViolenciaScreen(navController, vm)
        }

        // PANTALLAS DE VIOLENCIA
        composable(Routes.VIOLENCIA_FISICA) { ViolenciaFisicaScreen(navController) }
        composable(Routes.VIOLENCIA_PSICOLOGICA) { ViolenciaPsicologicaScreen(navController) }
        composable(Routes.VIOLENCIA_SEXUAL) { ViolenciaSexualScreen(navController) }
        composable(Routes.VIOLENCIA_ECONOMICA) { ViolenciaEconomicaScreen(navController) }
        composable(Routes.VIOLENCIA_GENERO) { ViolenciaGeneroScreen(navController) }

        // LISTADO RUTAS
        composable(Routes.RUTAS_ATENCION) {
            RutasAtencionScreen(navController)
        }

        // ENTIDADES
        composable(Routes.RUTA_POLICIA) { PoliciaNacionalScreen(navController) }
        composable(Routes.RUTA_FISCALIA) { FiscaliaGeneralScreen(navController) }
        composable(Routes.RUTA_DEFENSORIA) { DefensoriaScreen(navController) }
        composable(Routes.RUTA_MEDICINA) { MedicinaLegalScreen(navController) }
        composable(Routes.RUTA_ICBF) { IcbfScreen(navController) }
        composable(Routes.RUTA_LINEA_PURPURA) { LineaPurpuraScreen(navController) }
        composable(Routes.RUTA_SECRETARIA_MUJER) { SecretariaMujerScreen(navController) }
        composable(Routes.RUTA_CASAS_JUSTICIA) { CasasJusticiaScreen(navController) }
        composable(Routes.RUTA_COMISARIAS_FAMILIA) { ComisariasFamiliaScreen(navController) }
    }
}
