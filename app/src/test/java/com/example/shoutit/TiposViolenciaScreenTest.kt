package com.example.shoutit

import org.junit.Assert.assertEquals
import org.junit.Test

class TiposViolenciaScreenTest {

    @Test
    fun validaTitulo() {
        val titulo = "TIPOS DE VIOLENCIA"
        assertEquals("TIPOS DE VIOLENCIA", titulo)
    }
}
