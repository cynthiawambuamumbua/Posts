package com.example.posts.models

import com.google.gson.annotations.SerializedName

data class Posts(
    var id:Int,
    var title:String,
    var body: String,
    @SerializedName("user_id") var userId:Int

)
