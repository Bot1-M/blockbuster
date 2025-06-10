package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Employee
import com.movieAPI.blockbuster.domain.services.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/employee")
class EmployeeController(private val service: EmployeeService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Employee> {
        return service.getAll()
    }
}