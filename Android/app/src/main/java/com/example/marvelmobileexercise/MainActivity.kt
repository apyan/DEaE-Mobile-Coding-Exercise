package com.example.marvelmobileexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.marvelmobileexercise.ui.screen.ComicBookInfoScreen
import com.example.marvelmobileexercise.ui.theme.MarvelMobileExerciseTheme

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