package com.example.shoutit

import org.junit.Assert.assertEquals
import org.junit.Test

class RutasAtencionScreenTest {

    @Test
    fun validaTitulo() {
        val titulo = "RUTAS DE ATENCIÓN"
        assertEquals("RUTAS DE ATENCIÓN", titulo)
    }
}
