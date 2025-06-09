package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.RentalEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RentalRepositoryJPA : JpaRepository<Long, RentalEntity>