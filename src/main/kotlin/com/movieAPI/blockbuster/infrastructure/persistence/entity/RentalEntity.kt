package com.movieAPI.blockbuster.infrastructure.persistence.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "rental")
data class RentalEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    val customer: CustomerEntity,

    @ManyToOne
    @JoinColumn(name = "Inventory_id")
    val inventory: InventoryEntity,

    @Column(name = "rental_date")
    val rentalDate: Date,

    @Column(name = "return_date")
    val returnDate: Date
)