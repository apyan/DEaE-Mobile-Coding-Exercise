package com.example.marvelmobileexercise.viewmodel

import android.util.Log
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
            getComicBookInfo()
        }
    }

    private suspend fun getComicBookInfo() {
        try {
            val comicBookResult = comicBookRepository.loadComicBookInfo().data.results
            comicBookState.value = comicBookResult
        } catch (error: Error) {
            error.message?.let { Log.e("Error", it) }
        }
    }
}