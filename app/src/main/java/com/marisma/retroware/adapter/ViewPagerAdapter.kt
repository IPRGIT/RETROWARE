package com.marisma.retroware.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.marisma.retroware.tabNotice1
import com.marisma.retroware.tabNotice2

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> tabNotice1()
            1 -> tabNotice2()
            else -> throw IllegalStateException("Posición inválida")
        }
    }
}
