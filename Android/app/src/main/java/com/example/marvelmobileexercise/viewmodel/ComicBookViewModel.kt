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

    val comicBookList: MutableState<List<ComicBookInfoResult>> = mutableStateOf(emptyList())

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getComicBookInfo()
        }
    }

    private suspend fun getComicBookInfo() {
        val comicBookResult = comicBookRepository.loadComicBookInfo().data.results
        comicBookList.value = comicBookResult
    }
}