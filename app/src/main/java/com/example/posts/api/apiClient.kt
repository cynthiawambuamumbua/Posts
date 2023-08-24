package com.example.posts.api

object apiClient {
    var retrofit: Retrofit =Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildClients(apiInterface: Class<T>):T {
        return retrofit.create(apiInterface)
    }
}