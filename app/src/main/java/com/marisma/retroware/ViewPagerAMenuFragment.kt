package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.marisma.retroware.databinding.FragmentContenedorViewPagerBinding

class ViewPagerAMenuFragment : Fragment() {

    private var _binding: FragmentContenedorViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContenedorViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.navHostFragment) as? NavHostFragment
        navHostFragment?.let {
            val navController = it.navController
            binding.menubar.setupWithNavController(navController)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}