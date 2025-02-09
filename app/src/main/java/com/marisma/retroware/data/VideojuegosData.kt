package com.marisma.retroware.data

import Videojuego

object VideojuegosData {

    val videojuegos = listOf(
        Videojuego(
            nombre = "The Legend of Zelda",
            desarrollador = "Nintendo",
            Publisher = "Nintendo",
            anioLanzamiento = 1986,
            genero = listOf("Aventura"),
            plataformas = "NES",
            plataforma = listOf("NES"),
            descripcion = "Un clásico de aventura",
            caratula = "https://ejemplo.com/zelda.jpg"
        ),
        Videojuego(
            nombre = "Super Mario Bros.",
            desarrollador = "Nintendo",
            Publisher = "Nintendo",
            anioLanzamiento = 1985,
            genero = listOf("Plataformas"),
            plataformas = "NES",
            plataforma = listOf("NES"),
            descripcion = "El icónico juego de plataformas",
            caratula = "https://ejemplo.com/mario.jpg"
        ),
        Videojuego(
            nombre = "Final Fantasy VII",
            desarrollador = "Square Enix",
            Publisher = "Square Enix",
            anioLanzamiento = 1997,
            genero = listOf("RPG"),
            plataformas = "PlayStation",
            plataforma = listOf("PlayStation"),
            descripcion = "Una de las mejores historias de RPG",
            caratula = "https://ejemplo.com/ff7.jpg"
        )
    )
}
