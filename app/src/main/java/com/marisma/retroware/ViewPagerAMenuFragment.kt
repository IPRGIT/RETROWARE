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
            // Inflate the layout for this fragment
            _binding = FragmentContenedorViewPagerBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            // Busca el NavHostFragment de manera segura
            val navHostFragment =
                childFragmentManager.findFragmentById(R.id.navHostFragment) as? NavHostFragment
            if (navHostFragment != null) {
                val navController = navHostFragment.navController
                binding.menubar.setupWithNavController(navController)
            } else {
                // Log para depuración
                println("Error: No se encontró el NavHostFragment con el ID title")
            }

            // Configurar el BottomNavigationView
            binding.menubar.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu -> {
                        replaceFragment(ItemListFragment())
                        true
                    }

                    R.id.favoritos -> {
                        replaceFragment(FavItemListFragment())
                        true
                    }

                    R.id.userinfo -> {
                        replaceFragment(UserInfoFragment())
                        true
                    }


                    else -> false
                }
            }
        }

        private fun replaceFragment(fragment: Fragment) {
            childFragmentManager.beginTransaction()
                .replace(R.id.title, fragment)
                .commit()
        }


    }


