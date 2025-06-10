package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Store
import com.movieAPI.blockbuster.domain.services.StoreService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/store")
class StoreController(private val service: StoreService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Store> {
        return service.getAll()
    }
    
}