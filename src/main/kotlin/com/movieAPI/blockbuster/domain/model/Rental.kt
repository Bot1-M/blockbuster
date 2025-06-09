package com.movieAPI.blockbuster.domain.model

import java.util.Date

data class Rental(
    val id: Long,
    val customer: Customer,
    val inventory: Inventory,
    val rentalDate: Date,
    val returnDate: Date?
)