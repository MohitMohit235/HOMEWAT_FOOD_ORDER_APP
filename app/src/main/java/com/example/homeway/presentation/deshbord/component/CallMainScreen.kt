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
import androidx.compose.ui.unit.dp
import com.example.homeway.R



@Composable
fun CallmainScreen(modifier: Modifier = Modifier) {
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
                items(10) { index ->

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

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "Penne Pasta",
                        countryfood = "Italy",
                        restorentplace = "Lashkar , Gwalior",
                        price = "₹400",
                        distance = "1.6Km",
                        veg_nonveg = R.drawable.veg_icon
                    )
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

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "Penne Pasta",
                        countryfood = "Italy",
                        restorentplace = "Lashkar , Gwalior",
                        price = "₹400",
                        distance = "1.6Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

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

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "Penne Pasta",
                        countryfood = "Italy",
                        restorentplace = "Lashkar , Gwalior",
                        price = "₹400",
                        distance = "1.6Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

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

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "Penne Pasta",
                        countryfood = "Italy",
                        restorentplace = "Lashkar , Gwalior",
                        price = "₹400",
                        distance = "1.6Km",
                        veg_nonveg = R.drawable.veg_icon
                    )

                }
            }

        }
    }
}

