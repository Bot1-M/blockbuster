package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Store
import com.movieAPI.blockbuster.domain.repository.StoreRepository
import com.movieAPI.blockbuster.infrastructure.persistence.mappers.ToDomain
import com.movieAPI.blockbuster.infrastructure.persistence.repository.StoreRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class StoreRepositoryImpl(private val jpa: StoreRepositoryJPA) : StoreRepository {

    override fun getAllStore(): List<Store> {
        val listEntity = jpa.findAll()
        return listEntity.map { it.ToDomain() }
    }
}