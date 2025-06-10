package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Rental

interface RentalRepository {
    fun getAllRental(): List<Rental>
}