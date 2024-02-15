package com.example.marvelmobileexercise.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.marvelmobileexercise.model.response.ComicBookInfoResult
import com.example.marvelmobileexercise.ui.theme.MarvelMobileExerciseTheme
import com.example.marvelmobileexercise.viewmodel.ComicBookViewModel

@Composable
fun ComicBookInfoScreen() {
    val viewModel: ComicBookViewModel = viewModel()

    if (viewModel.comicBookList.value.isNotEmpty()) {
        ComicBookDetailScreen(comicBookInfoResult = viewModel.comicBookList.value[0])
    } else {
        LoadingSpinnerScreen()
    }
}

@Composable
fun ComicBookDetailScreen(comicBookInfoResult: ComicBookInfoResult) {
    Column {
        AsyncImage(
            model = comicBookInfoResult.thumbnail.getImageUrl(),
            contentDescription = "ComicBook Thumbnail Cover",
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = comicBookInfoResult.title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = comicBookInfoResult.description,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun LoadingSpinnerScreen() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxSize()
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .padding(50.dp)
                .size(30.dp)
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.primary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
            strokeWidth = 7.dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    //ComicBookInfoScreen()
    LoadingSpinnerScreen()
}