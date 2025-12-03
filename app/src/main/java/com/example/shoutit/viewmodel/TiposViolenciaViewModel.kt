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
                _tipos.value = RetrofitClient.api.getTiposViolencia()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
