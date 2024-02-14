package com.example.marvelmobileexercise.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelmobileexercise.model.ComicBookRepository
import com.example.marvelmobileexercise.model.response.ComicBookInfoResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ComicBookViewModel(
    private val comicBookRepository: ComicBookRepository = ComicBookRepository()
) : ViewModel() {

    val comicBookState: MutableState<List<ComicBookInfoResult>> = mutableStateOf(emptyList())

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val comicBookResult = getComicBookInfo()
            comicBookState.value = comicBookResult
        }
    }

    private suspend fun getComicBookInfo(): List<ComicBookInfoResult> {
        return comicBookRepository.loadComicBookInfo().data.results
    }
}