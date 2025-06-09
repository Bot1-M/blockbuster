package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.MovieEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepositoryJPA : JpaRepository<MovieEntity, Long>