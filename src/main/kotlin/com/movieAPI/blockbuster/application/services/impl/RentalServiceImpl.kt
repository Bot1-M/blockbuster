package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Rental
import com.movieAPI.blockbuster.domain.repository.RentalRepository
import com.movieAPI.blockbuster.domain.services.RentalService
import org.springframework.stereotype.Service

@Service
class RentalServiceImpl(private val repository: RentalRepository) : RentalService {

    override fun getAll(): List<Rental> {
        return repository.getAllRental()
    }

}