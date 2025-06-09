package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Inventory
import com.movieAPI.blockbuster.infrastructure.persistence.entity.InventoryEntity

fun InventoryEntity.ToDomain(): Inventory = Inventory(
    this.id,
    this.movie.ToDomain(),
    this.store.ToDomain(),
    this.quantity,
    this.available
)

fun Inventory.ToEntity(): InventoryEntity = InventoryEntity(
    this.id,
    this.movie.ToEntity(),
    this.store.ToEntity(),
    this.quantity,
    this.available
)