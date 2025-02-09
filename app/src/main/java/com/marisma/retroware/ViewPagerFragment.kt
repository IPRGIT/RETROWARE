package com.marisma.retroware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.marisma.retroware.R
import com.marisma.retroware.adapter.ViewPagerAdapter
import com.marisma.retroware.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator


/**
class ViewPagerFragment : Fragment() {
val args: ViewPagerFragmentArgs by navArgs()
private var _binding: FragmentViewPagerBinding? = null
private val binding get() = _binding!!

override fun onCreateView(
inflater: LayoutInflater, container: ViewGroup?,
savedInstanceState: Bundle?
): View {
_binding = FragmentViewPagerBinding.inflate(inflater, container, false)

val adapter = ViewPagerAdapter(this)
binding.viewPager.adapter = adapter

return binding.root
}

override fun onDestroyView() {
super.onDestroyView()
_binding = null
}
}

 */




class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

        // Conectar el TabLayout con ViewPager2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "."
                1 -> "."
                else -> "Tab ${position + 1}"
            }
        }.attach()


        return binding.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
