package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Category

interface CategoryService {

    fun getAll(): List<Category>

}