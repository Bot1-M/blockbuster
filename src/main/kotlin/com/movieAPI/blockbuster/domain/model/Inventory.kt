package com.movieAPI.blockbuster.domain.model

data class Inventory(
    val id : Long,
    val movie: Movie,
    val store: Store,
    val quantity: Int,
    val available: Boolean
)
