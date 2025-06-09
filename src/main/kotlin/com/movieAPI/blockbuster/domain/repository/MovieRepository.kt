package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Movie

interface MovieRepository {
    fun getAllMovies(): List<Movie>
}