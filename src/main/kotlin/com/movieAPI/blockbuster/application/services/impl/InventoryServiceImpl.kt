package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Inventory
import com.movieAPI.blockbuster.domain.repository.InventoryRepository
import com.movieAPI.blockbuster.domain.services.InventoryService
import org.springframework.stereotype.Service

@Service
class InventoryServiceImpl(private val repository: InventoryRepository) : InventoryService {

    override fun getAll(): List<Inventory> {
        return repository.getAllInventory()
    }
    
}