package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.marisma.retroware.adapter.VideojuegoAdapter
import com.marisma.retroware.data.VideojuegosData
import com.marisma.retroware.databinding.FragmentHome2Binding

class HomeFragment : Fragment() {

    private var _binding: FragmentHome2Binding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: VideojuegoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHome2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = VideojuegoAdapter(VideojuegosData.videojuegos) { videojuego ->
            // Aquí puedes manejar el clic en un videojuego
        }

        binding.RecyclerViewVideojuegos.layoutManager = LinearLayoutManager(requireContext())
        binding.RecyclerViewVideojuegos.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
