package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Movie
import com.movieAPI.blockbuster.domain.repository.MovieRepository
import com.movieAPI.blockbuster.infrastructure.persistence.repository.MovieRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class MovieRepositoryImpl(private val jpa: MovieRepositoryJPA) : MovieRepository {
    override fun getAllMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

}