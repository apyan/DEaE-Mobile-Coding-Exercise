package com.example.marvelmobileexercise.model.response

data class ComicBookInfoResponse(
    val copyright: String,
    val data: ComicBookInfoData
)

data class ComicBookInfoData(
    val results: List<ComicBookInfoResult>
)

data class ComicBookInfoResult(
    val id: Int,
    val digitalId: Int,
    val title: String,
    val issueNumber: Int,
    val prices: List<Price>
)

data class Price(
    val type: String,
    val price: Float
)