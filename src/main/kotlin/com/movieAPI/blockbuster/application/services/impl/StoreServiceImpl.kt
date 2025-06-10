package com.movieAPI.blockbuster.application.services.impl

import com.movieAPI.blockbuster.domain.model.Store
import com.movieAPI.blockbuster.domain.repository.StoreRepository
import com.movieAPI.blockbuster.domain.services.StoreService
import org.springframework.stereotype.Service

@Service
class StoreServiceImpl(private val repository: StoreRepository) : StoreService {

    override fun getAll(): List<Store> {
        return repository.getAllStore()
    }

}