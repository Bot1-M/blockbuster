package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Employee
import com.movieAPI.blockbuster.domain.repository.EmployeeRepository
import com.movieAPI.blockbuster.domain.services.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(private val repository: EmployeeRepository) : EmployeeService {

    override fun getAll(): List<Employee> {
        return repository.getAllEmployee()
    }

}