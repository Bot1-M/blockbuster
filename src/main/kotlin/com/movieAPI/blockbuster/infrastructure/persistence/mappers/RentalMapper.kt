package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Rental
import com.movieAPI.blockbuster.infrastructure.persistence.entity.RentalEntity

fun RentalEntity.ToDomain(): Rental = Rental(
    this.id,
    this.customer.toDomain(),
    this.inventory.ToDomain(),
    this.rentalDate,
    this.returnDate
)

fun Rental.ToEntity(): RentalEntity = RentalEntity(
    this.id,
    this.customer.ToEntity(),
    this.inventory.ToEntity(),
    this.rentalDate,
    this.returnDate
)