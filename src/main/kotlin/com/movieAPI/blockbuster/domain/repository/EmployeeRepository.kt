package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Employee

interface EmployeeRepository {
    fun getAllEmployee(): List<Employee>
}