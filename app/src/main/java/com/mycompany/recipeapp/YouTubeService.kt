package com.mycompany.recipeapp

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeService {
    /*@GET("/youtube/v3/youtube.search.list?")*/
    @GET("search?part=snippet")
    fun youtubeSearch(
        /*@Header("Accept-Encoding") auth: gzip,*/
        @Query("q") query: String,
        @Query("key") appKey: String
    ) : Call<Kind>
}