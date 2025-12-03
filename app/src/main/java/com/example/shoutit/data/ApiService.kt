package com.example.shoutit.data

import retrofit2.http.GET

data class TipoViolencia(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val imagen: String
)

data class RutaAtencion(
    val id: Int,
    val entidad: String,
    val telefono: String,
    val direccion: String,
    val imagen: String
)

interface ApiService {

    @GET("tipos-violencia")
    suspend fun getTiposViolencia(): List<TipoViolencia>

    @GET("rutas-atencion")
    suspend fun getRutasAtencion(): List<RutaAtencion>
}
