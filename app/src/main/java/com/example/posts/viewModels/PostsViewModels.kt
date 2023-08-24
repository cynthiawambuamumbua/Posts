package com.example.posts.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.posts.repository.postsRepository
import kotlinx.coroutines.launch
import retrofit2.http.POST

class PostsViewModels:ViewModel() {
    val postsRepo=postsRepository()
    val postsLiveData= MutableLiveData<List<POST>>()
    val errorLiveData= MutableLiveData<String>()

    fun fetchPosts(){
        viewModelScope.launch {
            val response=postsRepo.getPosts()
            if (response.isSuccessful){
                postsLiveData.postValue(response.body()?.posts)
            }
            else{
                errorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}