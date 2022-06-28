package com.example.moviesproject.model

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    val results: List<MovieResponse>
)

data class MovieResponse(
    val id: Int,
    @SerializedName("poster_path") val posterPath: String,
    val overview: String,
    val title: String,
    @SerializedName("genre_ids") val genreIdList: List<Int>,
    @SerializedName("release_date") val releaseDate: String
)

fun MovieResponse.toModel(): MovieModel {
    return MovieModel(
        id = id,
        posterPath = "https://image.tmdb.org/t/p/w500/${posterPath}",
        overview =overview,
        title =title,
        genreIdList =genreIdList,
        releaseDate =releaseDate
    )
}
