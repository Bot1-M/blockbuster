package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Rental

interface RentalService {

    fun getAll(): List<Rental>

}