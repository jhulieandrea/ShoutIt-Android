package com.example.shoutit.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

// HOME
import com.example.shoutit.ui.screens.home.HomeScreen

// TIPOS
import com.example.shoutit.ui.screens.tipos.TiposViolenciaScreen

// RUTAS
import com.example.shoutit.ui.screens.rutas.RutasAtencionScreen

// ENTIDADES
import com.example.shoutit.ui.screens.entidades.CasasJusticiaScreen
import com.example.shoutit.ui.screens.entidades.ComisariasFamiliaScreen
import com.example.shoutit.ui.screens.entidades.DefensoriaScreen
import com.example.shoutit.ui.screens.entidades.FiscaliaGeneralScreen
import com.example.shoutit.ui.screens.entidades.IcbfScreen
import com.example.shoutit.ui.screens.entidades.LineaPurpuraScreen
import com.example.shoutit.ui.screens.entidades.MedicinaLegalScreen
import com.example.shoutit.ui.screens.entidades.PoliciaNacionalScreen
import com.example.shoutit.ui.screens.entidades.SecretariaMujerScreen

// VIOLENCIAS
import com.example.shoutit.ui.screens.violencia.ViolenciaEconomicaScreen
import com.example.shoutit.ui.screens.violencia.ViolenciaFisicaScreen
import com.example.shoutit.ui.screens.violencia.ViolenciaGeneroScreen
import com.example.shoutit.ui.screens.violencia.ViolenciaPsicologicaScreen
import com.example.shoutit.ui.screens.violencia.ViolenciaSexualScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {

        // HOME
        composable("home") {
            HomeScreen(navController)
        }

        // TIPOS DE VIOLENCIA
        composable("tiposViolencia") {
            TiposViolenciaScreen(navController)
        }

        // PANTALLAS DE VIOLENCIA
        composable("violencia_fisica") { ViolenciaFisicaScreen(navController) }
        composable("violencia_psicologica") { ViolenciaPsicologicaScreen(navController) }
        composable("violencia_sexual") { ViolenciaSexualScreen(navController) }
        composable("violencia_economica") { ViolenciaEconomicaScreen(navController) }
        composable("violencia_genero") { ViolenciaGeneroScreen(navController) }

        // LISTADO RUTAS
        composable("rutasAtencion") {
            RutasAtencionScreen(navController)
        }

        // ENTIDADES
        composable("ruta_policia") { PoliciaNacionalScreen(navController) }
        composable("ruta_fiscalia") { FiscaliaGeneralScreen(navController) }
        composable("ruta_defensoria") { DefensoriaScreen(navController) }
        composable("ruta_medicina") { MedicinaLegalScreen(navController) }
        composable("ruta_icbf") { IcbfScreen(navController) }
        composable("ruta_lineapurpura") { LineaPurpuraScreen(navController) }
        composable("ruta_secretaria_mujer") { SecretariaMujerScreen(navController) }
        composable("ruta_casas_justicia") { CasasJusticiaScreen(navController) }
        composable("ruta_comisarias_familia") { ComisariasFamiliaScreen(navController) }
    }
}
