package com.example.hiltlearning.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.hiltlearning.viewmodel.PostViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiltlearning.data.model.Post

@Composable
fun PostScreen(viewModel: PostViewModel = hiltViewModel()) {
    val posts by viewModel.posts.collectAsState()

    LazyColumn {
        items(posts) { post ->
            Text(text = post.title)
        }
    }
}

@Composable
fun PostScreenItem(post: Post) {
    Text(text = post.title)
}