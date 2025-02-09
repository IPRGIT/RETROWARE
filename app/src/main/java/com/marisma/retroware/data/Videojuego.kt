data class Videojuego(

    val nombre: String,
    val desarrollador: String,
    val Publisher: String,
    val anioLanzamiento: Int,
    val genero: List<String>,      // 🔹 Cambiado a List<String>
    val plataformas: String,
    val plataforma: List<String>,  // 🔹 Cambiado a List<String>
    val descripcion: String,
    val caratula: String
)
