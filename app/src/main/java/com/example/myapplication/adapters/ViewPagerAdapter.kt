package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.viewPagerFragments.FirstFragment
import com.example.myapplication.viewPagerFragments.SecondFragment

class ViewPagerAdapter(fa : FragmentActivity) : FragmentStateAdapter(fa){
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> FirstFragment()
        }
    }
}