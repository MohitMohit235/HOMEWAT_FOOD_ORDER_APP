package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homeway.R







    data class FoodItem(
        val img: Int,
        val title: String
    )


    val foodList = listOf(
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pastaaa, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings"),
        FoodItem(R.drawable.penne_pasta, "Penne Pasta"),
        FoodItem(R.drawable.burger_img, "Cheese Burger"),
        FoodItem(R.drawable.pizza_img, "Pizza"),
        FoodItem(R.drawable.img_1, "Veg Pasta"),
        FoodItem(R.drawable.img7, "Chicken Wings")
    )


    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun FoodGridScreen() {
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(foodList) { food ->
                MY_foodCategory(img = food.img, title = food.title)
            }
        }
    }


@Preview
@Composable
private fun o() {
        FoodGridScreen()
}


