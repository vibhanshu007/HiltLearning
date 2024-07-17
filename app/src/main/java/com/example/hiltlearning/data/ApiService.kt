package com.example.hiltlearning.data

import com.example.hiltlearning.data.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<Post>
}