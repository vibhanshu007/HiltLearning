package com.example.hiltlearning.usecase

import com.example.hiltlearning.data.model.Post
import com.example.hiltlearning.data.repository.PostRepository
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(private val postRepository: PostRepository) {
    suspend fun execute(): List<Post> = postRepository.getPosts()
}