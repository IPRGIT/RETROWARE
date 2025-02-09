package com.marisma.retroware.adapter

import Videojuego
import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.media3.datasource.DataSource
import androidx.recyclerview.widget.RecyclerView
import com.marisma.retroware.R
import com.marisma.retroware.data.VideojuegosData




class VideojuegoAdapter(
    private val ListaVideojuegos: List<Videojuego>,
    private val onClickListener: (Videojuego) -> Unit
) : RecyclerView.Adapter<VideojuegoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideojuegoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VideojuegoViewHolder(layoutInflater.inflate(R.layout.videojuego_item_model, parent, false))
    }

    override fun onBindViewHolder(holder: VideojuegoViewHolder, position: Int) {
        val item = ListaVideojuegos[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = ListaVideojuegos.size
}
