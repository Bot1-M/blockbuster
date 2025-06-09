package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "category")
data class CategoryEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String
)
