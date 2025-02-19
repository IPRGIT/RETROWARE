package com.marisma.retroware


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.marisma.retroware.adapter.VideojuegoAdapter
import com.marisma.retroware.data.VideojuegosData
import com.marisma.retroware.databinding.FragmentHome2Binding
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController




class HomeFragment : Fragment() {

    private var _binding: FragmentHome2Binding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: VideojuegoAdapter
    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHome2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = VideojuegoAdapter(
            VideojuegosData.videojuegos,
            onClickListener = { videojuego ->
                val action = HomeFragmentDirections.actionHomeFragmentToDetailItemFragment(videojuego)
                findNavController().navigate(action)
            },
            onFavoriteClickListener = { videojuego ->
                videojuego.esFavorito = !videojuego.esFavorito
                if (videojuego.esFavorito) {
                    sharedViewModel.agregarFavorito(videojuego)
                } else {
                    sharedViewModel.eliminarFavorito(videojuego)
                }
                adapter.notifyItemChanged(VideojuegosData.videojuegos.indexOf(videojuego))

                val mensaje = if (videojuego.esFavorito) "Añadido a favoritos" else "Eliminado de favoritos"
                Toast.makeText(requireContext(), mensaje, Toast.LENGTH_SHORT).show()
            }
        )

        binding.RecyclerViewVideojuegos.layoutManager = LinearLayoutManager(requireContext())
        binding.RecyclerViewVideojuegos.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}