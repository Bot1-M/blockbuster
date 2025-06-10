package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Customer
import com.movieAPI.blockbuster.domain.services.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/customer")
class CustomerController(private val service: CustomerService) {


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Customer> {
        return service.getAll()
    }

}