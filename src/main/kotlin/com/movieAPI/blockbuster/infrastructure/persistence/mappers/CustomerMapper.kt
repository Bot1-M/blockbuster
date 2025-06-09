package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Customer
import com.movieAPI.blockbuster.infrastructure.persistence.entity.CustomerEntity

fun CustomerEntity.toDomain(): Customer = Customer(
    this.id,
    this.name,
    this.email,
    this.phone,
    this.address,
    this.registeredAt
)

fun Customer.ToEntity(): CustomerEntity = CustomerEntity(
    this.id,
    this.name,
    this.email,
    this.phone,
    this.address,
    this.registeredAt
)