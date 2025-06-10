package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Inventory

interface InventoryService {

    fun getAll(): List<Inventory>

}