package com.movieAPI.blockbuster.infrastructure.persistence.repository.impl

import com.movieAPI.blockbuster.domain.model.Employee
import com.movieAPI.blockbuster.domain.repository.EmployeeRepository
import com.movieAPI.blockbuster.infrastructure.persistence.mappers.ToDomain
import com.movieAPI.blockbuster.infrastructure.persistence.repository.EmployeeRepositoryJPA
import org.springframework.stereotype.Repository

@Repository
class EmployeeRepositoryImpl(private val jpa: EmployeeRepositoryJPA) : EmployeeRepository {

    override fun getAllEmployee(): List<Employee> {
        val listEntity = jpa.findAll()
        return listEntity.map { it.ToDomain() }
    }

}