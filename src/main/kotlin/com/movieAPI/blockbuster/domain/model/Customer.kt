package com.movieAPI.blockbuster.domain.model

import java.util.Date

data class Customer (

    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val registeredAt: Date,
    )