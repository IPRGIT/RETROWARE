package com.marisma.retroware.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marisma.retroware.R
import com.marisma.retroware.Videojuego


class VideojuegoAdapter(
    private var ListaVideojuegos: List<Videojuego>, // Cambiar a `var`
    private val onClickListener: (Videojuego) -> Unit,
    private val onFavoriteClickListener: (Videojuego) -> Unit
) : RecyclerView.Adapter<VideojuegoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideojuegoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VideojuegoViewHolder(layoutInflater.inflate(R.layout.videojuego_item_model, parent, false))
    }

    override fun onBindViewHolder(holder: VideojuegoViewHolder, position: Int) {
        val item = ListaVideojuegos[position]
        holder.render(item, onClickListener, onFavoriteClickListener)
    }

    override fun getItemCount(): Int = ListaVideojuegos.size

    fun updateList(newList: List<Videojuego>) {
        ListaVideojuegos = newList // Ahora es válido porque `ListaVideojuegos` es `var`
        notifyDataSetChanged()

    }
}