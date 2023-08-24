package com.example.posts.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.posts.databinding.ActivityMainBinding
import com.example.posts.viewModels.PostsViewModels

class MainActivity : AppCompatActivity() {
    val postsViewModel: PostsViewModels by viewModels()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        postsViewModel.fetchPosts()
        postsViewModel.postsLiveData.observe(this, Observer {postsList->
            Toast.makeText(baseContext, "fetched ${postsList.size} posts", Toast.LENGTH_LONG)
                .show()
            binding.rvPosts.layoutManager = LinearLayoutManager(this@MainActivity)
            binding.rvPosts.adapter = PostsRvAdapter(postsList)

        })
        postsViewModel.errorLiveData.observe(this, Observer { error ->
            Toast.makeText(baseContext,error, Toast.LENGTH_LONG).show()
        })
    }
}