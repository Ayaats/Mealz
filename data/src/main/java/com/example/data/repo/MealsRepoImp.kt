package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoryResponse

class MealsRepoImp (private val apiService: ApiService):ApiService {
    override fun getMeals(): CategoryResponse = apiService.getMeals()
}