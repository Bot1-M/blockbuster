package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "employee")
data class EmployeeEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,
    val email: String,

    @ManyToOne
    @JoinColumn(name = "store_id")
    val store: StoreEntity
)
