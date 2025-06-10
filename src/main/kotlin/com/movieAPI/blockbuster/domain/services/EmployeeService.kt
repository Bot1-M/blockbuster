package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Employee

interface EmployeeService {

    fun getAll(): List<Employee>
    
}