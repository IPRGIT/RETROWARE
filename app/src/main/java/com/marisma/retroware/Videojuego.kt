package com.marisma.retroware

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Videojuego(
    val nombre: String,
    val desarrollador: String,
    val Publisher: String,
    val anioLanzamiento: Int,
    val genero: List<String>,
    val plataformas: String,
    val plataforma: List<String>,
    val descripcion: String,
    val caratula: String,
    val imagenesAdicionales: List<String> = emptyList(), // Lista de URLs de imágenes adicionales
    val videoUrl: String? = null, // URL del video
    var esFavorito: Boolean = false,
    var puntuacion: Float = 0f,  // Nuevo campo para la puntuación
    var comentario: String = ""  // Nuevo campo para el comentario
) : Parcelable {


    // Función para verificar si el videojuego es favorito
    fun toggleFavorito(): Boolean {
        esFavorito = !esFavorito
        return esFavorito
    }
}