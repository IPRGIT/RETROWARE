package com.marisma.retroware.adapter

import Videojuego
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marisma.retroware.databinding.VideojuegoItemModelBinding

class VideojuegoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = VideojuegoItemModelBinding.bind(view)

    fun render(videojuego: Videojuego, onClickListener: (Videojuego) -> Unit) {
        binding.titulo.text = videojuego.nombre
        binding.anio.text = "Año: ${videojuego.anioLanzamiento}"
        binding.genero.text = "Género: ${videojuego.genero.joinToString(", ")}"
        binding.plataformas.text = "Plataformas: ${videojuego.plataformas}"
        binding.plataforma.text = if (videojuego.plataforma.size > 3) {
            videojuego.plataforma.take(3).joinToString(", ") + "..."
        } else {
            videojuego.plataforma.joinToString(", ")
        }

        // Cargar imagen con Glide
        Glide.with(binding.caratula.context)
            .load(videojuego.caratula)
            .into(binding.caratula)

        // Evento de clic
        itemView.setOnClickListener { onClickListener(videojuego) }
    }
}
