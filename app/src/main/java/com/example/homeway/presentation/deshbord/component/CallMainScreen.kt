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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
fun CallmainScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF5F8FF))) {

        var selectedTab by remember { mutableStateOf(0) }
        val categories = listOf(
            "ALL", "Pizza", "Burger", "Pasta", "Noodle",
            "Curry", "Fish", "Dal fry", "Biryani", "See all",

            )


        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally){


            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))

            SearchBar()

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(vertical = 20.dp),
                verticalArrangement = Arrangement.spacedBy(100.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(horizontal = 18.dp)
            ) {
                items(10) {

                    Spacer(modifier = Modifier.width(10.dp))

                    My_preview()

                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    myapp()

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "Penne Pasta",
                        countryfood = "Italy",
                        restorentplace = "Lashkar , Gwalior",
                        price = "₹400",
                        distance = "1.6Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.burger_img,
                        dishname = "Cheeseburger",
                        countryfood = "United States",
                        restorentplace = "City Center , Gwalior",
                        price = "₹200",
                        distance = "1Km",
                        veg_nonveg = R.drawable.nonveg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.pizza_img,
                        dishname = "Pepperoni Pizza",
                        countryfood = "United States",
                        restorentplace = "Maharaja Complex DD Nagar , Gwalior",
                        price = "₹445",
                        distance = "600m",
                        veg_nonveg = R.drawable.nonveg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.biryani,
                        dishname = "Chicken Biryani",
                        countryfood = "hyderabad , India",
                        restorentplace = "Phool Bagh , Gwalior",
                        price = "₹530",
                        distance = "4Km",
                        veg_nonveg = R.drawable.nonveg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img,
                        dishname = "Chicken Tikka Masala",
                        countryfood = "Punjab , India",
                        restorentplace = "Gandhi Nagar , Gwalior",
                        price = "₹160",
                        distance = "1Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img6,
                        dishname = "Dal Tadka",
                        countryfood = "North Indian",
                        restorentplace = "City Center , Gwalior",
                        price = "₹120",
                        distance = "100m",
                        veg_nonveg = R.drawable.veg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img7,
                        dishname = "Chicken Madras",
                        countryfood = "Kashmir , India",
                        restorentplace = "DD Nagar,Gwalior",
                        price = "₹760",
                        distance = "300m",
                        veg_nonveg = R.drawable.nonveg_icon
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img8,
                        dishname = "Rasgulla",
                        countryfood = "West Bengal",
                        restorentplace = "Phool Bagh,Gwalior",
                        price = "₹220",
                        distance = "4Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

                }
            }

        }
    }
}
