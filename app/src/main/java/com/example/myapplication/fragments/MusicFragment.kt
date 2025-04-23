package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentMusicBinding
import com.example.myapplication.models.Music

class MusicFragment : Fragment() {
    private var _binding : FragmentMusicBinding? = null
    private val binding  get() = _binding!!

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMusicBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewAdapter = RecyclerViewAdapter(getItem())
        musicRV.adapter = recyclerViewAdapter
        musicRV.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun getItem(): MutableList<Music> {
        val list = ArrayList<Music>()
        list.add(Music("","music title 1","details for music 1"))
        list.add(Music("","music title 2"))
        list.add(Music("","music title 3","details for music 3"))
        list.add(Music("","music title 4"))
        list.add(Music("","music title 5","details for music 5"))
        list.add(Music("","music title 6"))
        list.add(Music("","music title 7","details for music 7"))
        list.add(Music("","music title 8"))
        list.add(Music("","music title 9","details for music 9"))
        list.add(Music("","music title 10"))
        return list
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MusicFragment()
    }
}