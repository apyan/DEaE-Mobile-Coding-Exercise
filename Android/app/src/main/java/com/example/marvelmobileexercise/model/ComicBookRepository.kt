package com.example.marvelmobileexercise.model

import com.example.marvelmobileexercise.model.response.ComicBookInfoResponse

class ComicBookRepository(
    private val comicBookService: ComicBookService = ComicBookService()
) {
    suspend fun loadComicBookInfo(): ComicBookInfoResponse {
        return comicBookService.loadComicBookInfo()
    }
}