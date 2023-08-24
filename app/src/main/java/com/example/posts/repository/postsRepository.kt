package com.example.posts.repository

import com.example.posts.api.apiClient
import com.example.posts.api.apiInterface
import com.example.posts.models.postsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class postsRepository {
    val apiCl=apiClient.buildClients(apiInterface::class.java)

    suspend fun getPosts(): Response<postsResponse> {
        return withContext(Dispatchers.IO){
            apiCl.getPosts()
        }

    }
}