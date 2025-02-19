package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import android.widget.RatingBar
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.marisma.retroware.adapter.ImagenAdapter
import com.marisma.retroware.databinding.FragmentDetailFavItemBinding


class DetailFavItemFragment : Fragment() {

    private var _binding: FragmentDetailFavItemBinding? = null
    private val binding get() = _binding!!
    private val args: DetailFavItemFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailFavItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videojuego = args.videojuego

        // Mostrar los detalles del videojuego
        binding.titulo.text = videojuego.nombre
        binding.anio.text = "Año: ${videojuego.anioLanzamiento}"
        binding.genero.text = "Género: ${videojuego.genero.joinToString(", ")}"
        binding.plataformas.text = "Plataformas: ${videojuego.plataformas}"
        binding.descripcion.text = videojuego.descripcion

        // Configurar RecyclerView para imágenes adicionales
        val imagenAdapter = ImagenAdapter(videojuego.imagenesAdicionales)
        binding.recyclerViewImagenes.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewImagenes.adapter = imagenAdapter

        // Configurar WebView para el video
        videojuego.videoUrl?.let { url ->
            binding.webViewVideo.webViewClient = WebViewClient()
            binding.webViewVideo.settings.javaScriptEnabled = true
            binding.webViewVideo.loadUrl(url)
        }

        // Cargar la carátula del videojuego con Glide
        if (!videojuego.caratula.isNullOrEmpty()) {
            Glide.with(requireContext())
                .load(videojuego.caratula)  // Asegúrate de que 'caratula' sea una URL válida o recurso
                .into(binding.caratula)
        } else {
            // Si la carátula es nula o vacía, podemos poner una imagen por defecto
            binding.caratula.setImageResource(R.color.black) // Coloca aquí tu imagen por defecto
        }

        // Configurar el RatingBar
        binding.ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(requireContext(), "Puntuación: $rating", Toast.LENGTH_SHORT).show()
        }

        // Mostrar el cuadro de texto y el botón Ok cuando se pulse el botón de comentario
        binding.btnComentario.setOnClickListener {
            binding.editTextComentario.visibility = View.VISIBLE
            binding.btnOk.visibility = View.VISIBLE
        }

        // Guardar el comentario
        binding.btnOk.setOnClickListener {
            val comentario = binding.editTextComentario.text.toString()
            if (comentario.isNotEmpty()) {
                binding.textViewComentario.text = comentario
                binding.editTextComentario.text.clear()
                binding.editTextComentario.visibility = View.GONE
                binding.btnOk.visibility = View.GONE
            } else {
                Toast.makeText(requireContext(), "Por favor, escribe un comentario", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
