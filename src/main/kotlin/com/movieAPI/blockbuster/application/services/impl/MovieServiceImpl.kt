package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Movie
import com.movieAPI.blockbuster.domain.repository.MovieRepository
import com.movieAPI.blockbuster.domain.services.MovieService
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(private val repository: MovieRepository) : MovieService {

    override fun getAll(): List<Movie> {
        return repository.getAllMovies()
    }

}