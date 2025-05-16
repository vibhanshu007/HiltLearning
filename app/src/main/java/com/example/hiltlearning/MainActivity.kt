package com.example.hiltlearning

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import com.example.hiltlearning.data.model.Post
import com.example.hiltlearning.ui.theme.HiltLearningTheme
import com.example.hiltlearning.view.PostScreen
import com.example.hiltlearning.view.PostScreenItem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HiltLearningTheme {
                PostScreen()
                Text("Hello Hilt!")
                val posts = listOf<Post>() // Replace with actual data
                PostScreenItem(posts.first())
                Text("First commit")
                Text("Second commit")
            }
        }
    }
}