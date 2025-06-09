package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*


@Entity
@Table(name = "store")
data class StoreEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,

    val location: String,
)
