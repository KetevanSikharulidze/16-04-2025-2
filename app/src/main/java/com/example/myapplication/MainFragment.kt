package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentMainBinding
import com.example.myapplication.fragments.FavouritesFragment
import com.example.myapplication.fragments.MusicFragment
import com.example.myapplication.fragments.PlacesFragment

class MainFragment : Fragment() {

    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    private fun showFragment(f: Fragment){
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, f)
            .commit()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)
        showFragment(FavouritesFragment.newInstance())
        bottomNavMenu.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.favouritesID -> {
                    showFragment(FavouritesFragment.newInstance())
                    true
                }
                R.id.musicID -> {
                    showFragment(MusicFragment.newInstance())
                    true
                }
                R.id.placesID -> {
                    showFragment(PlacesFragment.newInstance())
                    true
                }
                else -> {
                    showFragment(FavouritesFragment.newInstance())
                    true
                }
            }
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}