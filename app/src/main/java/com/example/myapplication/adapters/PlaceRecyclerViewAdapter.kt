package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.PlaceItemBinding
import com.example.myapplication.models.Place

class PlaceRecyclerViewAdapter : ListAdapter<Place,PlaceRecyclerViewAdapter.Holder>(Comparator()) {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val binding = PlaceItemBinding.bind(itemView)

        fun bind(item: Place) = with(binding){

            placeTV.text = item.name

            Glide.with(root).load(item.image).into(placeIV)
        }
    }

    class Comparator(): DiffUtil.ItemCallback<Place>() {
        override fun areItemsTheSame(oldItem: Place, newItem: Place): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Place, newItem: Place): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(getItem(position))
    }

}