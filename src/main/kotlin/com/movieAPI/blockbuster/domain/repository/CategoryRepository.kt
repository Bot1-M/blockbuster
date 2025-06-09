package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Category

interface CategoryRepository {
    fun getAllCategories(): List<Category>
}