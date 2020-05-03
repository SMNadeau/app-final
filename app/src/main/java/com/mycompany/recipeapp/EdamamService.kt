package com.mycompany.recipeapp

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface EdamamService {
    @GET("/search")
    fun search(
        /*@Header("Accept-Encoding") auth: gzip,*/
        @Query("q") recipeSearch: String,
        @Query("app_id") appID: String,
        @Query("app_key") appKey: String
        ) : Call<Hits>
}