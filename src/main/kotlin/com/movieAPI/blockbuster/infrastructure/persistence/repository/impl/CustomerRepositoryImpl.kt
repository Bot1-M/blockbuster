package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Customer
import com.movieAPI.blockbuster.domain.repository.CustomerRepository
import com.movieAPI.blockbuster.infrastructure.persistence.mappers.toDomain
import com.movieAPI.blockbuster.infrastructure.persistence.repository.CustomerRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryImpl(private val jpa: CustomerRepositoryJPA) : CustomerRepository {

    override fun getAllCustomer(): List<Customer> {
        val listEntity = jpa.findAll()
        return listEntity.map { it.toDomain() }
    }

}