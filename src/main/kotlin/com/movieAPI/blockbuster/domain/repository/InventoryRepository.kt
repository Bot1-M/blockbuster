package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Inventory

interface InventoryRepository {
    fun getAllInventory(): List<Inventory>
}