package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepositoryJPA : JpaRepository<Long, CategoryEntity>