package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Customer

interface CustomerService {

    fun getAll(): List<Customer>

}