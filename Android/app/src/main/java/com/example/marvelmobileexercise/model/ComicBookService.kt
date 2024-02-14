package com.example.marvelmobileexercise.model

import com.example.marvelmobileexercise.constant.Constant
import com.example.marvelmobileexercise.constant.Constant.Companion.BASE_URL
import com.example.marvelmobileexercise.model.response.ComicBookInfoResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class ComicBookService {

    private var comicBookApi: ComicBookApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        comicBookApi = retrofit.create(ComicBookApi::class.java)
    }

    suspend fun loadComicBookInfo(): ComicBookInfoResponse {
        return comicBookApi.loadComicBookInfo()
    }

    interface ComicBookApi {
        @GET("v1/public/comics/${Constant.CB_2000_ULTIMATE_SPIDER_MAN}")
        suspend fun loadComicBookInfo(
            @Query("apikey") apikey: String = Constant.API_PUBLIC_KEY,
            @Query("ts") ts: String = Constant.timeStamp,
            @Query("hash") hash: String = Constant.createHash()
        ): ComicBookInfoResponse
    }
}