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
    val prices: List<Price>,
    val thumbnail: ComicImage,
    val images: List<ComicImage>
)

data class Price(
    val type: String,
    val price: Float
)

data class ComicImage(
    val path: String,
    val extension: String
) {
    fun getImageUrl(): String = "$path.$extension".replace("http", "https")
}