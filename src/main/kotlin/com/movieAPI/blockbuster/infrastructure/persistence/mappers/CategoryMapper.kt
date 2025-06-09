package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Category
import com.movieAPI.blockbuster.infrastructure.persistence.entity.CategoryEntity

fun Category.ToEntity(): CategoryEntity = CategoryEntity(
    this.id,
    this.name
)

fun CategoryEntity.ToDomain(): Category = Category(
    this.id,
    this.name
)