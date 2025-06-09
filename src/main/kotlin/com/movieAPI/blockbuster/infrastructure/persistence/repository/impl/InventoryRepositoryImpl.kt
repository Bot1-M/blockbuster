package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Inventory
import com.movieAPI.blockbuster.domain.repository.InventoryRepository
import com.movieAPI.blockbuster.infrastructure.persistence.repository.InventoryRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class InventoryRepositoryImpl(private val jpa: InventoryRepositoryJPA) : InventoryRepository {
    override fun getAllInventoryRepository(): List<Inventory> {
        TODO("Not yet implemented")
    }
}