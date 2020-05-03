package com.mycompany.recipeapp

import com.google.gson.annotations.SerializedName
import java.util.*

data class Hits(
    val q: String,
    val from: Int,
    val to: Int,
    val count: Int,
    val hits: List<Hit>
)

data class Hit(
    val recipe: Recipe
)

data class Recipe(
    val uri: String,
    val label: String,
    val image: String,
    val url: String,
    val yield: Int,
    val calories: Float,
    val totalWeight: Float,
    val ingredients: List<Ingredient>
)

{
    fun displayCals(): String{
        val new_distance = "%.0f".format(calories)
        return "$new_distance c"
    }

    fun displayWeight(): String{
        val new_distance = "%.0f".format(totalWeight)
        return "$new_distance g"
    }
}

data class Ingredient(
    val foodId: String,
    val quantity: Float,
    val measure: Measure,
    val weight: Float,
    val food: Food
)

data class Measure(
    val uri: String,
    val label: String
)

data class Food(
    val foodId: String,
    @SerializedName("label") val foodName: String
)

