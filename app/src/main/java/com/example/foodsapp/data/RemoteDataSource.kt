package com.example.foodsapp.data

import com.example.foodsapp.data.network.FoodRecipesApi
import com.example.foodsapp.models.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val foodRecipesApi: FoodRecipesApi) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipes> {
        return foodRecipesApi.getFoodRec(queries)
    }
}
