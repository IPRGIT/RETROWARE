package com.marisma.retroware

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.marisma.retroware.databinding.FragmentMenuBinding
import com.marisma.retroware.databinding.FragmentFavItemListBinding



class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private val args: MenuFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.nav_host_fragment_menu) as NavHostFragment
        val navController = navHostFragment.navController

        binding.menubar.setupWithNavController(navController)

        binding.menubar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu -> {
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.favoritos -> {
                    navController.navigate(R.id.favItemListFragment)
                    true
                }
                R.id.userinfo -> {
                    navController.navigate(R.id.userInfoFragment)

                    // val action = MenuFragmentDirections.actionMenuFragmentToUserInfoFragment(args.user)
                    //navController.navigate(action)
                    true
                }
                else -> false
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}