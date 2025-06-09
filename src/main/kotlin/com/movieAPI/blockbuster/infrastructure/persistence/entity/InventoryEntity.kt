package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "inventory", uniqueConstraints = [UniqueConstraint(columnNames = ["movie_id", "store_id"])])
data class InventoryEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "movie_id")
    val movie: MovieEntity,

    @ManyToOne
    @JoinColumn(name = "store_id")
    val store: StoreEntity,

    val quantity: Int,
    val available: Boolean
)
