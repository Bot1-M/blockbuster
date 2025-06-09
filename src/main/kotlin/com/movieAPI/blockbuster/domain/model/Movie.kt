package com.movieAPI.blockbuster.domain.model

data class Movie(
    val id: Long,
    val title: String,
    val description: String,
    val releaseYear : Int,
    val category: Category
)
