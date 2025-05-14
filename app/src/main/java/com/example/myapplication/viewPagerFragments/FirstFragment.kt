package com.example.myapplication.viewPagerFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RetrofitRecyclerViewAdapter
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.models.PostListItem
import com.example.myapplication.services.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    lateinit var adapter: RetrofitRecyclerViewAdapter

    private val postList = mutableListOf<PostListItem>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        adapter = RetrofitRecyclerViewAdapter(postList)
        retrofitRV.adapter = adapter
        retrofitRV.layoutManager = LinearLayoutManager(requireContext())

        fetchPosts()

    }

    private fun fetchPosts() {
        RetrofitInstance.api.getPosts().enqueue(object : Callback<List<PostListItem>>{
            override fun onResponse(
                call: Call<List<PostListItem>>,
                response: Response<List<PostListItem>>
            ) {
                if (response.isSuccessful){
                    val posts = response.body()
                    if (posts != null){
                        postList.clear()
                        postList.addAll(posts)
                        adapter.notifyDataSetChanged()
                    }
                } else {
                    println("Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<PostListItem>>, t: Throwable) {
                println("Failed: ${t.message}")
            }

        })
    }
}