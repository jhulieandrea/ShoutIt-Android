package com.example.shoutit.ui.navigation

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Pruebas unitarias para validar la configuración de rutas (módulos)
 * de la aplicación SHOUT IT.
 */
class RoutesTest {

    @Test
    fun `ruta HOME debe ser correcta`() {
        assertEquals("home", Routes.HOME)
    }

    @Test
    fun `ruta TIPOS_VIOLENCIA debe ser correcta`() {
        assertEquals("tiposViolencia", Routes.TIPOS_VIOLENCIA)
    }

    @Test
    fun `ruta RUTAS_ATENCION debe ser correcta`() {
        assertEquals("rutasAtencion", Routes.RUTAS_ATENCION)
    }

    @Test
    fun `rutas de tipos de violencia no deben estar vacias`() {
        assertTrue(Routes.VIOLENCIA_FISICA.isNotBlank())
        assertTrue(Routes.VIOLENCIA_PSICOLOGICA.isNotBlank())
        assertTrue(Routes.VIOLENCIA_SEXUAL.isNotBlank())
        assertTrue(Routes.VIOLENCIA_ECONOMICA.isNotBlank())
        assertTrue(Routes.VIOLENCIA_GENERO.isNotBlank())
    }

    @Test
    fun `rutas de entidades de atencion no deben estar vacias`() {
        assertTrue(Routes.RUTA_POLICIA.isNotBlank())
        assertTrue(Routes.RUTA_FISCALIA.isNotBlank())
        assertTrue(Routes.RUTA_DEFENSORIA.isNotBlank())
        assertTrue(Routes.RUTA_MEDICINA.isNotBlank())
        assertTrue(Routes.RUTA_ICBF.isNotBlank())
        assertTrue(Routes.RUTA_LINEA_PURPURA.isNotBlank())
        assertTrue(Routes.RUTA_SECRETARIA_MUJER.isNotBlank())
        assertTrue(Routes.RUTA_CASAS_JUSTICIA.isNotBlank())
        assertTrue(Routes.RUTA_COMISARIAS_FAMILIA.isNotBlank())
    }

    @Test
    fun `no debe haber rutas duplicadas entre modulos`() {
        val allRoutes = listOf(
            Routes.HOME,
            Routes.TIPOS_VIOLENCIA,
            Routes.RUTAS_ATENCION,
            Routes.VIOLENCIA_FISICA,
            Routes.VIOLENCIA_PSICOLOGICA,
            Routes.VIOLENCIA_SEXUAL,
            Routes.VIOLENCIA_ECONOMICA,
            Routes.VIOLENCIA_GENERO,
            Routes.RUTA_POLICIA,
            Routes.RUTA_FISCALIA,
            Routes.RUTA_DEFENSORIA,
            Routes.RUTA_MEDICINA,
            Routes.RUTA_ICBF,
            Routes.RUTA_LINEA_PURPURA,
            Routes.RUTA_SECRETARIA_MUJER,
            Routes.RUTA_CASAS_JUSTICIA,
            Routes.RUTA_COMISARIAS_FAMILIA
        )

        val distintos = allRoutes.distinct()

        assertEquals(
            "No debe haber rutas duplicadas entre los módulos de la app",
            allRoutes.size,
            distintos.size
        )
    }
}
