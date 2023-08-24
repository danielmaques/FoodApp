package com.example.foodsapp.data.network

import com.example.foodsapp.models.FoodRecipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    fun getFoodRec(
        @QueryMap query: Map<String, String>
    ): Response<FoodRecipes>

}
