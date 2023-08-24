package com.example.posts.api

import com.example.posts.models.Posts
import com.example.posts.models.postsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface apiInterface {
    @GET("/posts")
    suspend fun getPosts(): Response<List<Posts>>
}
