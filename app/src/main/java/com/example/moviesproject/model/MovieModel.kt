package com.example.moviesproject.model

data class MovieModel(
    val id: Int,
    val posterPath: String,
    val overview: String,
    val title: String,
    val genreIdList: List<Int>,
    val releaseDate: String
)
