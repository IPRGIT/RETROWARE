package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.marisma.retroware.adapter.VideojuegoAdapter
import com.marisma.retroware.databinding.FragmentFavItemListBinding
import androidx.navigation.fragment.findNavController

class FavItemListFragment : Fragment() {

    private var _binding: FragmentFavItemListBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: SharedViewModel by activityViewModels()
    private lateinit var adapter: VideojuegoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Filtrar solo los videojuegos que están marcados como favoritos
        adapter = VideojuegoAdapter(
            sharedViewModel.favoritos.value ?: emptyList(),
            onClickListener = { videojuego ->
                val action = FavItemListFragmentDirections
                    .actionFavItemListFragmentToDetailFavItemFragment(videojuego)
                findNavController().navigate(action)
            },
            onFavoriteClickListener = { videojuego ->
                videojuego.esFavorito = !videojuego.esFavorito
                if (!videojuego.esFavorito) {
                    sharedViewModel.eliminarFavorito(videojuego)
                }
                adapter.notifyDataSetChanged()
            }
        )

        binding.RecyclerViewFavoritos.layoutManager = LinearLayoutManager(requireContext())
        binding.RecyclerViewFavoritos.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}