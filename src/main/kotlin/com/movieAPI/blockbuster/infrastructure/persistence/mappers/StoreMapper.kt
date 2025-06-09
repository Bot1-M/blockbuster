package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Store
import com.movieAPI.blockbuster.infrastructure.persistence.entity.StoreEntity

fun StoreEntity.ToDomain(): Store = Store(
    this.id,
    this.name,
    this.location,
)

fun Store.ToEntity(): StoreEntity = StoreEntity(
    this.id,
    this.name,
    this.location,
)