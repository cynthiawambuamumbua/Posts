package com.example.posts.models

import retrofit2.http.POST

data class postsResponse(
    val posts: List<POST>,
    val total:Int,
    val skip:Int,
    val limit:Int,
)
