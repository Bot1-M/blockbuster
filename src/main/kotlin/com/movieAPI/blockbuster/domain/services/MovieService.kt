package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Movie

interface MovieService {

    fun getAll(): List<Movie>
    
}