package com.example.posts.repository

import com.example.posts.api.apiClient
import com.example.posts.api.apiInterface
import com.example.posts.models.Posts
import com.example.posts.models.postsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class postsRepository {
    val apiCli=apiClient.buildClients(apiInterface::class.java)

    suspend fun getPosts(): Response<List<Posts>>{
        return withContext(Dispatchers.IO){
            apiCli.getPosts()
        }



    }
}