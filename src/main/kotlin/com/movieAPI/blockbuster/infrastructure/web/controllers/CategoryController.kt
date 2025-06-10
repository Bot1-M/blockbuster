package com.movieAPI.blockbuster.infrastructure.web.controllers

import com.movieAPI.blockbuster.domain.model.Category
import com.movieAPI.blockbuster.domain.services.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/category")
class CategoryController(private val service: CategoryService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<Category> {
        return service.getAll()
    }
}