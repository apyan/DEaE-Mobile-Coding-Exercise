package com.example.marvelmobileexercise.model.response

import com.google.gson.annotations.SerializedName

data class ComicBookInfoResponse(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("data")
    val data: ComicBookInfoData
)

data class ComicBookInfoData(
    @SerializedName("results")
    val results: List<ComicBookInfoResult>
)

data class ComicBookInfoResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("digitalId")
    val digitalId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("issueNumber")
    val issueNumber: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("textObjects")
    val textObjects: List<ComicBookText>,
    @SerializedName("prices")
    val prices: List<Price>,
    @SerializedName("thumbnail")
    val thumbnail: ComicImage,
    @SerializedName("images")
    val images: List<ComicImage>,
    @SerializedName("creators")
    val creators: ComicCreatorInfo,
    @SerializedName("characters")
    val characters: ComicCharacterInfo
)

data class ComicBookText(
    @SerializedName("type")
    val type: String,
    @SerializedName("text")
    val text: String
)

data class Price(
    @SerializedName("type")
    val type: String,
    @SerializedName("price")
    val price: Float
)

data class ComicImage(
    @SerializedName("path")
    val path: String,
    @SerializedName("extension")
    val extension: String
) {
    fun getImageUrl(): String = "$path.$extension".replace("http", "https")
}

data class ComicCreatorInfo(
    @SerializedName("items")
    val items: List<ComicCreator>
)

data class ComicCreator(
    @SerializedName("name")
    val name: String,
    @SerializedName("role")
    val role: String
)

data class ComicCharacterInfo(
    @SerializedName("items")
    val items: List<ComicCharacter>
)

data class ComicCharacter(
    @SerializedName("name")
    val name: String
)