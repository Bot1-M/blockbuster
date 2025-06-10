package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Rental
import com.movieAPI.blockbuster.domain.repository.RentalRepository
import com.movieAPI.blockbuster.infrastructure.persistence.mappers.ToDomain
import com.movieAPI.blockbuster.infrastructure.persistence.repository.RentalRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class RentalRepositoryImpl(private val jpa: RentalRepositoryJPA) : RentalRepository {

    override fun getAllRentalRepository(): List<Rental> {
        val listEntity = jpa.findAll()
        return listEntity.map { it.ToDomain() }
    }
}