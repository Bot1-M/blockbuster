package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Category
import com.movieAPI.blockbuster.domain.repository.CategoryRepository
import com.movieAPI.blockbuster.domain.services.CategoryService
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl(private val repository: CategoryRepository) : CategoryService {

    override fun getAll(): List<Category> {
        return repository.getAllCategories()
    }

}