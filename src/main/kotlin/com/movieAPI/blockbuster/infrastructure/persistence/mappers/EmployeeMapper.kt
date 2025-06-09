package com.movieAPI.blockbuster.infrastructure.persistence.mappers

import com.movieAPI.blockbuster.domain.model.Employee
import com.movieAPI.blockbuster.infrastructure.persistence.entity.EmployeeEntity

fun EmployeeEntity.ToDomain(): Employee = Employee(
    this.id,
    this.name,
    this.email,
    this.store.ToDomain()
)

fun Employee.ToEntity(): EmployeeEntity = EmployeeEntity(
    this.id,
    this.name,
    this.email,
    this.store.ToEntity()
)