package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.RetrofitItemBinding
import com.example.myapplication.models.PostListItem

class RetrofitRecyclerViewAdapter(private val posts: List<PostListItem>) : RecyclerView.Adapter<RetrofitRecyclerViewAdapter.Holder>() {

    inner class Holder(viewItem: View) : RecyclerView.ViewHolder(viewItem){
        val binding = RetrofitItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.retrofit_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.apply {
            val post = posts[position]

            userID.text = post.userId.toString()
            title.text = post.title
            body.text = post.body
        }
    }
}