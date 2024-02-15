package com.example.marvelmobileexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.marvelmobileexercise.ui.screen.ComicBookInfoScreen
import com.example.marvelmobileexercise.ui.theme.MarvelMobileExerciseTheme
import com.example.marvelmobileexercise.viewmodel.ComicBookViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelMobileExerciseTheme {
                ComicBookInfoScreen()
            }
        }
    }
}

@Composable
fun Greeting() {
    val viewModel: ComicBookViewModel = viewModel()
    val test = viewModel.comicBookList.value
    Text(
        text = test.toString()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MarvelMobileExerciseTheme {
        Greeting()
    }
}