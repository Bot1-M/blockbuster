package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Movie
import com.movieAPI.blockbuster.domain.services.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/movie")
class MovieController(private val service: MovieService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Movie> {
        return service.getAll()
    }

}