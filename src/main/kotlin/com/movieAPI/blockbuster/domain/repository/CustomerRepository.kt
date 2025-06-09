package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Customer

interface CustomerRepository {
    fun getAllCustomer(): List<Customer>
}