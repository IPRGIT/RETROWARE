package com.marisma.retroware.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marisma.retroware.R
import com.marisma.retroware.Videojuego
import com.marisma.retroware.databinding.VideojuegoItemModelBinding




class VideojuegoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = VideojuegoItemModelBinding.bind(view)

    fun render(videojuego: Videojuego, onClickListener: (Videojuego) -> Unit, onFavoriteClickListener: (Videojuego) -> Unit) {
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

        // Evento de clic en el ítem
        itemView.setOnClickListener { onClickListener(videojuego) }

        // Evento de clic en el botón de favoritos
        binding.btnFavorito.setOnClickListener {
            onFavoriteClickListener(videojuego)
        }

        // Cambiar el ícono del botón de favoritos según el estado
        binding.btnFavorito.setImageResource(
            if (videojuego.esFavorito) R.drawable.ic_heart_filled else R.drawable.ic_heart_empty
        )
    }
}