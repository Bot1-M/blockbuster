package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "customer")
data class CustomerEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,
    val email: String,
    val phone: String,
    val address: String,

    @Column(name = "registered_at")
    val registeredAt: Date
)
