package com.example.projetkotlinmovie

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "dac2c564903a3edd05bef80f7b5175fd",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}