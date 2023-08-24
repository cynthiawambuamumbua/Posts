package com.example.posts.models


data class postsResponse(
    val posts: List<Posts>,
    val total:Int,
    val skip:Int,
    val limit:Int,
)
