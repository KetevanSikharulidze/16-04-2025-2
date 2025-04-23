package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.adapters.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentFavouritesBinding
import com.google.android.material.tabs.TabLayoutMediator

class FavouritesFragment : Fragment() {

    private var _binding : FragmentFavouritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavouritesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            val vpAdapter = ViewPagerAdapter(requireActivity())
            vp.adapter = vpAdapter

            TabLayoutMediator(tabLayout,vp){ tab, position ->
                tab.text = "tab ${position + 1}"
            }.attach()


        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FavouritesFragment()
    }
}