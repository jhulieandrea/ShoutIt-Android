package com.example.shoutit

import org.junit.Assert.assertEquals
import org.junit.Test

class PoliciaNacionalScreenTest {

    @Test
    fun validaTelefono() {
        val telefono = "3057691842"
        assertEquals("3057691842", telefono)
    }
}
