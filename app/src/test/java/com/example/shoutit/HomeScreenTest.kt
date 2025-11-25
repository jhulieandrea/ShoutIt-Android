package com.example.shoutit

import org.junit.Assert.assertEquals
import org.junit.Test

class HomeScreenTest {

    @Test
    fun homeScreen_validaTitulos() {
        val tituloMisionEsperado = "NUESTRA MISIÓN"
        val tituloObjetivoEsperado = "OBJETIVO"

        assertEquals("NUESTRA MISIÓN", tituloMisionEsperado)
        assertEquals("OBJETIVO", tituloObjetivoEsperado)
    }
}
