package com.movieAPI.blockbuster.infrastructure.persistence.repository

import com.movieAPI.blockbuster.infrastructure.persistence.entity.StoreEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepositoryJPA : JpaRepository<Long, StoreEntity>