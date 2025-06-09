package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.InventoryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface InventoryRepositoryJPA : JpaRepository<InventoryEntity, Long>