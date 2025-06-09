package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepositoryJPA : JpaRepository<Long, EmployeeEntity>