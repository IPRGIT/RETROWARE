package com.marisma.retroware.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marisma.retroware.databinding.ItemImagenBinding

//COMMIT
class ImagenAdapter(private val imagenes: List<String>) : RecyclerView.Adapter<ImagenAdapter.ImagenViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagenViewHolder {
        val binding = ItemImagenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImagenViewHolder, position: Int) {
        val imagenUrl = imagenes[position]
        holder.bind(imagenUrl)
    }

    override fun getItemCount(): Int = imagenes.size

    class ImagenViewHolder(private val binding: ItemImagenBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imagenUrl: String) {
            Glide.with(binding.imagen.context)
                .load(imagenUrl)
                .into(binding.imagen)
        }
    }
}