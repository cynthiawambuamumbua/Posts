package com.example.posts.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.posts.models.Posts
import com.example.posts.repository.postsRepository
import kotlinx.coroutines.launch

class PostsViewModels:ViewModel() {
    val postsRepo=postsRepository()
    val postsLiveData= MutableLiveData<List<Posts>>()
    val errorLiveData= MutableLiveData<String>()

    fun fetchPosts(){
        viewModelScope.launch {
            val response=postsRepo.getPosts()
            if (response.isSuccessful){
             val posts=response.body()?: emptyList()
                postsLiveData.postValue(posts)
            }
            else{
                errorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}