package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Movie
import com.movieAPI.blockbuster.infrastructure.persistence.entity.MovieEntity

fun MovieEntity.ToDomain(): Movie = Movie(
    this.id,
    this.title,
    this.description,
    this.releaseYear,
    this.category.ToDomain()
)

fun Movie.ToEntity(): MovieEntity = MovieEntity(
    this.id,
    this.title,
    this.description,
    this.releaseYear,
    this.category.ToEntity()
)