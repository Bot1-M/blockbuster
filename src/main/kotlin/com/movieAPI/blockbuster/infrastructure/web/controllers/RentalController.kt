package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Rental
import com.movieAPI.blockbuster.domain.services.RentalService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/rental")
class RentalController(private val service: RentalService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Rental> {
        return service.getAll()
    }
}