package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Inventory
import com.movieAPI.blockbuster.domain.services.InventoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/inventory")
class InventoryController(private val service: InventoryService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Inventory> {
        return service.getAll()
    }

}