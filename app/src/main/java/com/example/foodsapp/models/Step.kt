package com.example.foodsapp.models

data class Step(
    val ingredients: List<Ingredient>,
    val length: Length,
    val number: Int,
    val step: String
)