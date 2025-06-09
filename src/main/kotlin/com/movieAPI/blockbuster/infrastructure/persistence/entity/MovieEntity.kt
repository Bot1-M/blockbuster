package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "movie")
data class MovieEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val title: String,
    val description: String,
    val releaseYear: Int,

    @ManyToOne
    @JoinColumn(name = "category_id")
    val category: CategoryEntity
)
