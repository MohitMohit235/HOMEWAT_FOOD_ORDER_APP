package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homeway.R


@Preview
@Composable
 fun BlackFilterScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F8FF))
        ) {

            val bookedFoods = remember { mutableStateListOf<FoodItem>() }
            var selectedTab by remember { mutableStateOf(0) }
            val categories = listOf(
                "ALL", "Pizza", "Burger", "Pasta", "Noodle",
                "Curry", "Fish", "Dal fry", "Biryani", "See all",

                )

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                topbar(
                    categories = categories,
                    selectedTabIndex = selectedTab,
                    onTabSelected = { selectedTab = it })

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                        .padding(vertical = 20.dp, horizontal = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,

                ) {


                        Spacer(modifier = Modifier.width(10.dp))

                        My_preview()

                        Spacer(modifier = Modifier.padding(vertical = 10.dp))


                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.penne_pasta,
                            dishname = "Penne Pasta",
                            restorentplace = "Lashkar , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.burger_img,
                            dishname = "Cheeseburger",
                            restorentplace = "City Center , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.nonveg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "Pepperoni Pizza",
                            restorentplace = "Maharaja Complex DD Nagar , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.nonveg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.biryani,
                            dishname = "Chicken Biryani",
                            restorentplace = "Phool Bagh , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.nonveg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.img,
                            dishname = "Chicken Tikka Masala",
                            restorentplace = "Gandhi Nagar , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.img6,
                            dishname = "Dal Tadka",
                            restorentplace = "City Center , Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.img7,
                            dishname = "Chicken Madras",
                            restorentplace = "DD Nagar,Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.nonveg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        foodcard(
                            img = R.drawable.img8,
                            dishname = "Rasgulla",
                            restorentplace = "Phool Bagh,Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to two",
                            onBookClick = { bookedFoods.add(it) }
                        )

                    }
                }

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.6f)),
                contentAlignment = Alignment.Center
            ){

                FILTER(
                    text = "Sort by",
                    selected = true,
                    onSelect = {}
                )
                
            }



        }
    }




