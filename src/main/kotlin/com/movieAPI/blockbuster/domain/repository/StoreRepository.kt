package com.movieAPI.blockbuster.domain.repository

import com.movieAPI.blockbuster.domain.model.Store

interface StoreRepository {
    fun getAllStore(): List<Store>
}