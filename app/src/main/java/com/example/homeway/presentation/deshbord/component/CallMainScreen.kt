package com.example.homeway.presentation.deshbord.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R

@Preview
@Composable
fun CallmainScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF5F8FF))) {

        val bookedFoods = remember { mutableStateListOf<FoodItem>() }
        var selectedTab by remember { mutableStateOf(0) }
        val categories = listOf(
            "ALL", "Pizza", "Burger", "Pasta", "Noodle",
            "Curry", "Fish", "Dal fry", "Biryani", "See all",

            )


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F8FF)),
            contentPadding = PaddingValues(vertical = 16.dp, horizontal = 10.dp)
        ) {

            item {
                topbar(
                    categories = categories,
                    selectedTabIndex = selectedTab,
                    onTabSelected = { selectedTab = it }
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF5F8FF))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    SearchBar()
                }
            }
            items(10) {
                Spacer(modifier = Modifier.height(16.dp))
                My_preview()
                Spacer(modifier = Modifier.height(10.dp))
                FilterSection()
                Spacer(modifier = Modifier.height(6.dp))
                MORE_EXPLORE()
                Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "60 RESTAURANTS TO YOU",
                        color = Color.Black.copy(alpha = 0.6f),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        letterSpacing = 2.sp,
                        modifier = Modifier
                            .padding(top = 6.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "7 hill Restaurant",
                        restorentplace = "Lashkar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick ={ bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.burger_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.pizza_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Maharaja Complex DD Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.biryani,
                        dishname = "Shahi Tadka",
                        restorentplace = "Phool Bagh , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Gandhi Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img6,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img7,
                        dishname = "Shahi Tadka",
                        restorentplace = "DD Nagar,Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img8,
                        dishname = "Shahi Tadka",
                        restorentplace = "Phool Bagh,Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                }
            }

        }
    }

