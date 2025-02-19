package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.marisma.retroware.databinding.FragmentDetailItemBinding
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.marisma.retroware.adapter.ImagenAdapter




class DetailItemFragment : Fragment() {

    private var _binding: FragmentDetailItemBinding? = null
    private val binding get() = _binding!!
    private val args: DetailItemFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailItemBinding.inflate(inflater, container, false)
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



        // Cargar imagen con Glide
        Glide.with(binding.caratula.context)
            .load(videojuego.caratula)
            .into(binding.caratula)

        // Mostrar el estado de favorito
        binding.corazon.setImageResource(
            if (videojuego.esFavorito) R.drawable.ic_heart_filled else R.drawable.ic_heart_empty
        )




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

}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
