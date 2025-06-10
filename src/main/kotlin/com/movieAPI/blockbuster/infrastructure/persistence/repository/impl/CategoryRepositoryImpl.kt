package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Category
import com.movieAPI.blockbuster.domain.repository.CategoryRepository
import com.movieAPI.blockbuster.infrastructure.persistence.mappers.ToDomain
import com.movieAPI.blockbuster.infrastructure.persistence.repository.CategoryRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class CategoryRepositoryImpl(private val jpa: CategoryRepositoryJPA) : CategoryRepository {

    override fun getAllCategories(): List<Category> {
        val listEntity = jpa.findAll()
        return listEntity.map { it.ToDomain() }
    }
}