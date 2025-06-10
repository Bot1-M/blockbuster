package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Customer
import com.movieAPI.blockbuster.domain.repository.CustomerRepository
import com.movieAPI.blockbuster.domain.services.CustomerService
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl(private val repository: CustomerRepository) : CustomerService {

    override fun getAll(): List<Customer> {
        return repository.getAllCustomer()
    }

}