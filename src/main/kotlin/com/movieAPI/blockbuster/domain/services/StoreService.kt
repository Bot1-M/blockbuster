package com.movieAPI.blockbuster.domain.services

import com.movieAPI.blockbuster.domain.model.Store

interface StoreService {

    fun getAll(): List<Store>
}