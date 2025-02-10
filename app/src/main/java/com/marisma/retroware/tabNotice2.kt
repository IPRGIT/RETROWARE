package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.marisma.retroware.databinding.FragmentTabNotice2Binding


/**
class tabNotice2 : Fragment() {

    private var _binding: FragmentTabNotice2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabNotice2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnComenzar.setOnClickListener {
            val action = tabNotice2Directions.actionTabNotice2FragmentToMenuFragment(user = "usuarioejemplo")
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

 */

class tabNotice2 : Fragment() {

    private var _binding: FragmentTabNotice2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabNotice2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnComenzar.setOnClickListener {
            val action = ViewPagerFragmentDirections.actionViewPagerFragmentToMenuFragment("usuarioejemplo")
            parentFragment?.findNavController()?.navigate(action)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
