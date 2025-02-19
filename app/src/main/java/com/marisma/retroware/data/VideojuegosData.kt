package com.marisma.retroware.data

import com.marisma.retroware.Videojuego


//PA RECOGER EL NOMBRE DE USUARIO COMO VARIABLE
object userName{
    lateinit var nombre:String
}

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
            caratula = "https://images.wikidexcdn.net/mwuploads/esssbwiki/2/27/latest/20130430140238/Car%C3%A1tula_The_Legend_of_Zelda.jpg",
            imagenesAdicionales = listOf(
                "https://www.nintendo.com/eu/media/images/10_share_images/games_15/virtual_console_nintendo_3ds_7/SI_3DSVC_TheLegendOfZelda_image1600w.jpg",
                "https://upload.wikimedia.org/wikipedia/en/3/3a/Legend_of_Zelda_NES.PNG"
            ),
            videoUrl = "https://www.youtube.com/watch?v=_pdTOea3cOs"
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
            caratula = "https://i.3djuegos.com/juegos/5327/super_mario_bros/fotos/ficha/super_mario_bros-1698422.webp",
            imagenesAdicionales = listOf(
                    "https://www.nintendo.com/eu/media/images/10_share_images/games_15/virtual_console_nintendo_3ds_7/SI_3DSVC_SuperMarioBros.jpg",
            "https://videofileblog.com/wp-content/uploads/2023/04/super-mario-bros-1985-banner.jpg"
        ),
        videoUrl = "https://www.youtube.com/watch?v=PAxkBaUyMJ0"
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
            caratula = "https://uvejuegos.com/img/caratulas/135/ff7g.jpg",
            imagenesAdicionales = listOf(
                "https://image.api.playstation.com/vulcan/img/rnd/202010/1520/NXNCl23Cal5LFacqEiWwptkt.png",
                "https://image.api.playstation.com/cdn/EP0082/CUSA01847_00/FREE_CONTENTy9XOjfIfwdtfZjZUgJvb/PREVIEW_SCREENSHOT2_477397.jpg"
            ),
            videoUrl = "https://www.youtube.com/watch?v=utVE4aUKYuY"
        ),

            Videojuego(
                nombre = "Alone in the Dark",
                desarrollador = "Infogrames",
                Publisher = "Infogrames",
                anioLanzamiento = 1992,
                genero = listOf("Survival Horror"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "3DO"),
                descripcion = "Uno de los primeros survival horror en 3D.",
                caratula = "https://cdromance.org/wp-content/uploads/2017/11/2939-alone-in-the-dark-3-dos-front-cover.jpg",
                imagenesAdicionales = listOf(
                    "https://www.retrogames.cz/games/502/DOS_01.gif",
                    "https://image.dosgamesarchive.com/screenshots/alone1_010.png"
                ),
                videoUrl = "https://www.youtube.com/watch?v=OJWrNIJMegg"
            ),

            Videojuego(
                nombre = "Prince of Persia",
                desarrollador = "Brøderbund",
                Publisher = "Brøderbund",
                anioLanzamiento = 1989,
                genero = listOf("Plataformas"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "Apple II"),
                descripcion = "El inicio de la mítica saga de plataformas cinemáticas.",
                caratula = "https://upload.wikimedia.org/wikipedia/en/8/80/Prince_of_Persia_1989_cover.jpg",
                imagenesAdicionales = listOf(
                    "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2017/11/prince-persia-1989.jpg",
                    "https://phantom-elmundo.unidadeditorial.es/ef306f7eb835f9c605c866eecb7e0236/resize/414/f/jpg/assets/multimedia/imagenes/2019/06/12/15603625109153.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=xmyEXmZjYMw"
            ),

            Videojuego(
                nombre = "Doom",
                desarrollador = "id Software",
                Publisher = "id Software",
                anioLanzamiento = 1993,
                genero = listOf("FPS"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS"),
                descripcion = "El FPS que definió el género.",
                caratula = "https://upload.wikimedia.org/wikipedia/en/5/57/Doom_cover_art.jpg",
                imagenesAdicionales = listOf(
                    "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/C4WSHZ625NAVZL34SN3XAEHCPY.jpg",
                    "https://image.api.playstation.com/vulcan/img/cfn/11307dSLGPYbfJRCxju9sqfXEbXcBtWYayUdp7WurqlCJW00Dul5UoUIeXygp8EptD8baUnedEzegLGwqeZPuXbsFxcs6PeF.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=BkaC1-QoraY"
            ),

            Videojuego(
                nombre = "Commander Keen",
                desarrollador = "id Software",
                Publisher = "Apogee Software",
                anioLanzamiento = 1990,
                genero = listOf("Plataformas"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS"),
                descripcion = "Una divertida saga de plataformas para PC.",
                caratula = "https://upload.wikimedia.org/wikipedia/en/d/d3/Keen_Dreams_Cover_art.jpg",
                imagenesAdicionales = listOf(
                    "https://media.vandal.net/m/12-2020/2020121419441649_1.jpg",
                    "https://media.vandal.net/i/620x387/12-2020/2020121419441649_3.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=QQVk6wmaqAs"
            ),

            Videojuego(
                nombre = "Day of the Tentacle",
                desarrollador = "LucasArts",
                Publisher = "LucasArts",
                anioLanzamiento = 1993,
                genero = listOf("Aventura Gráfica"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS"),
                descripcion = "Una de las mejores aventuras gráficas de LucasArts.",
                caratula = "https://upload.wikimedia.org/wikipedia/en/7/79/Day_of_the_Tentacle_artwork.jpg",
                imagenesAdicionales = listOf(
                    "https://m.media-amazon.com/images/M/MV5BYWM0MzM5NzUtOWRjYS00NmVkLTg4YjEtZWRhNzM4YTY4YzMwXkEyXkFqcGc@._V1_.jpg",
                    "https://upload.wikimedia.org/wikipedia/en/b/b5/Day_of_the_Tentacle_Founding_Fathers.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=omSWRyU7dac"
            ),

            Videojuego(
                nombre = "The Secret of Monkey Island",
                desarrollador = "LucasArts",
                Publisher = "LucasArts",
                anioLanzamiento = 1990,
                genero = listOf("Aventura Gráfica"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "Amiga"),
                descripcion = "El clásico de piratas y humor de LucasArts.",
                caratula = "https://upload.wikimedia.org/wikipedia/en/a/a8/The_Secret_of_Monkey_Island_artwork.jpg",
                imagenesAdicionales = listOf(
                    "https://danielmuriel.net/wp-content/uploads/2016/11/want-to-be-a-pirate.jpg",
                    "https://m.media-amazon.com/images/M/MV5BOTAzYjRkMWQtZjg2ZC00ZjBkLTk3ZjQtMzE5NDVhYzMxOTEyXkEyXkFqcGc@._V1_.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=pEKqTvKIZP0"
            ),

            Videojuego(
                nombre = "SimCity 2000",
                desarrollador = "Maxis",
                Publisher = "Maxis",
                anioLanzamiento = 1993,
                genero = listOf("Simulación"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "Windows"),
                descripcion = "El simulador de ciudades que revolucionó el género.",
                caratula = "https://cdn.mobygames.com/covers/4775964-simcity-2000-dos-front-cover.jpg",
                imagenesAdicionales = listOf(
                    "https://i.ytimg.com/vi/BkAFXs3_TiM/sddefault.jpg",
                    "https://www.insertcoinclasicos.com/wp-content/uploads/2014/09/simcity2000-screenshot-1.png"
                ),
                videoUrl = "https://www.youtube.com/watch?v=sddLJWlMLxw"
            ),

        Videojuego(
                nombre = "Quake",
                desarrollador = "id Software",
                Publisher = "GT Interactive",
                anioLanzamiento = 1996,
                genero = listOf("FPS"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "Windows"),
                descripcion = "El primer shooter completamente en 3D.",
                caratula = "https://cdromance.org/wp-content/uploads/2017/11/12494-quake-dos-front-cover.jpg",
            imagenesAdicionales = listOf(
                "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2016/06/600446-quake-analisis-retro.png",
                "https://shared.cloudflare.steamstatic.com/store_item_assets/steam/apps/2310/ss_3e486cb2013c5c6de74806826a26367194f452f3.1920x1080.jpg"
            ),
            videoUrl = "https://www.youtube.com/watch?v=DV2vhmtGBqM"
        ),

            Videojuego(
                nombre = "Dune II",
                desarrollador = "Westwood Studios",
                Publisher = "Virgin Interactive",
                anioLanzamiento = 1992,
                genero = listOf("Estrategia en tiempo real"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS"),
                descripcion = "El juego que definió el género RTS.",
                caratula = "https://cdn.mobygames.com/covers/4790871-dune-ii-the-building-of-a-dynasty-dos-front-cover.jpg",
                imagenesAdicionales = listOf(
                    "https://m.media-amazon.com/images/M/MV5BNWM2N2E5Y2YtYmFlMS00NWQ0LTg3ZTEtM2ZmNWNmODUzOWE5XkEyXkFqcGc@._V1_.jpg",
                    "https://www.myabandonware.com/media/screenshots/d/dune-ii-the-building-of-a-dynasty-1e7/dune-ii-the-building-of-a-dynasty_11.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=4NNyYTPYO3k"
            ),

            Videojuego(
                nombre = "Carmageddon",
                desarrollador = "Stainless Games",
                Publisher = "Interplay",
                anioLanzamiento = 1997,
                genero = listOf("Carreras"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS", "Windows"),
                descripcion = "Un juego de carreras y destrucción total.",
                caratula = "https://cdn.mobygames.com/covers/4312126-carmageddon-dos-other.jpg",
                imagenesAdicionales = listOf(
                    "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg8OO92maQ2RDkugRtU3Ex7bMlvnmYrd_v1KgPtQWhGzHY5hjN6zzEWH-Eu2hnMH6Gs-SbtHrPV-isXT3je0FQSVC_vW_BciyW57cNj9cLazWtDRfWRDf6fnPBv4NAUZVBdRQBUWRF9S9zqHLSS-TrUoOptmEibHGUjKSoT9nhu0hHfHpO3TCt1QAyR4v0J/s16000/8_1.jpg",
                    "https://m.media-amazon.com/images/M/MV5BNDAxOWJmNjItY2MxZi00N2I5LThkMTMtYjM0MzlhMzFjZTI1XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg"
                ),
                videoUrl = "https://www.youtube.com/watch?v=ENr2YOfth-k"
            ),

        Videojuego(
                nombre = "Blood",
                desarrollador = "Monolith Productions",
                Publisher = "GT Interactive",
                anioLanzamiento = 1997,
                genero = listOf("FPS"),
                plataformas = "MS-DOS",
                plataforma = listOf("MS-DOS"),
                descripcion = "Un shooter de terror con mucha sangre.",
                caratula = "https://cdn.mobygames.com/covers/3924486-blood-dos-front-cover.jpg",
            imagenesAdicionales = listOf(
                "https://m.media-amazon.com/images/M/MV5BOTllNDBiY2EtMDAwZC00YjEwLTlkMDEtNzFlNGI2ZTNhMzI5XkEyXkFqcGc@._V1_.jpg",
                "https://platform.polygon.com/wp-content/uploads/sites/2/chorus/uploads/chorus_asset/file/13622595/blood2.jpg"
            ),
            videoUrl = "https://www.youtube.com/watch?v=mjsSYGlxzzY"
        )
        )
    }


