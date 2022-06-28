package com.example.moviesproject.remote

import com.example.moviesproject.model.MovieListResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiMovie {
    @GET("movie/top_rated?api_key=3cc5fed1cc1b0d8b96542e696667b443&language=en-US&page=1")
    fun getMovieList(): Call<MovieListResponse>
}
