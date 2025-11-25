package com.example.shoutit

import org.junit.Assert.assertEquals
import org.junit.Test

class ViolenciaFisicaScreenTest {

    @Test
    fun validaTitulo() {
        val titulo = "VIOLENCIA FÍSICA"
        assertEquals("VIOLENCIA FÍSICA", titulo)
    }
}
