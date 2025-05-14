package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.PlaceRecyclerViewAdapter
import com.example.myapplication.databinding.FragmentPlacesBinding
import com.example.myapplication.databinding.PlaceItemBinding
import com.example.myapplication.models.Place

class PlacesFragment : Fragment() {

    lateinit var binding: FragmentPlacesBinding
    lateinit var placeRVAdapter : PlaceRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlacesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding){
        super.onViewCreated(view, savedInstanceState)
        placeRVAdapter = PlaceRecyclerViewAdapter()

        placesRV.adapter = placeRVAdapter
        placesRV.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


        placeRVAdapter.submitList(listOf(
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
            Place("https://pbservices.ge/wp-content/uploads/2023/10/tbilisi-georgia.jpg","Tbilisi"),
            Place("https://travellemming.com/wp-content/uploads/Batumi-at-night.jpg","Batumi"),
            Place("https://storage.georgia.travel/images/970x620/city-of-gori-georgia.webp","Gori"),
            Place("https://wander-lush.org/wp-content/uploads/2023/01/Emily-Lush-Sachkhere-Georgia-Modinakhe-Castle-drone-side.jpg","Sachkhere"),
            Place("https://cdn.georgiantravelguide.com/storage/files/terjolis-munitsipaliteti-terjola-municipality.jpg","Terjola"),
            Place("https://upload.wikimedia.org/wikipedia/commons/4/40/Town_of_Signagi%2C_Georgia%2C_Europe.jpg","Signagi"),
        ))

        gridPlacesRV.adapter = placeRVAdapter
        gridPlacesRV.layoutManager = GridLayoutManager(requireContext(),3)

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            PlacesFragment()
    }
}