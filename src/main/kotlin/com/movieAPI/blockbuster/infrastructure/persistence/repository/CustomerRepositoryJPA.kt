package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepositoryJPA : JpaRepository<Long, CustomerEntity>