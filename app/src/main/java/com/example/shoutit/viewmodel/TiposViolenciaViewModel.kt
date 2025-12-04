package com.example.shoutit.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoutit.data.RetrofitClient
import com.example.shoutit.data.TipoViolencia
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TiposViolenciaViewModel : ViewModel() {

    private val _tipos = MutableStateFlow<List<TipoViolencia>>(emptyList())
    val tipos: StateFlow<List<TipoViolencia>> = _tipos

    init {
        viewModelScope.launch {
            try {
                println("🔍 Solicitando datos a la API...")

                val response = RetrofitClient.api.getTiposViolencia()

                println("🔥 API respondió con ${response.size} elementos")
                response.forEach {
                    println("➡️  id=${it.id}  titulo=${it.titulo}")
                }

                _tipos.value = response

            } catch (e: Exception) {
                println("❌ ERROR AL CARGAR TIPOS DE VIOLENCIA")
                println("❌ MENSAJE: ${e.message}")
                e.printStackTrace()
            }
        }
    }
}
