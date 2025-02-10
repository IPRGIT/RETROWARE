package com.marisma.retroware

import Videojuego
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class ItemListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_item_list, container, false)
    }


    // Usa Safe Args para la navegación
    fun onItemSelected(videojuego: Videojuego) {
        // Usamos SafeArgs para crear la acción de navegación
        //val action = ItemListFragmentDirections.(R.id.action_itemListFragment_to_menuFragment)

        // Navegas usando la acción generada
        // findNavController().navigate(R.id.action_itemListFragment_to_menuFragment)
    }


}

