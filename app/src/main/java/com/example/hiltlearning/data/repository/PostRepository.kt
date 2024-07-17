package com.example.hiltlearning.data.repository

import com.example.hiltlearning.data.ApiService
import com.example.hiltlearning.data.model.Post
import javax.inject.Inject

class PostRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getPosts(): List<Post> = apiService.getPosts()
}