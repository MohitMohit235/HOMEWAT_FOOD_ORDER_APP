package com.example.homeway.presentation.deshbord.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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

        var selectedTab by remember { mutableStateOf(0) }
        val categories = listOf(
            "ALL", "Pizza", "Burger", "Pasta", "Noodle",
            "Curry", "Fish", "Dal fry", "Biryani", "See all",

            )


        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start){


            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.padding(start = 15.dp)){
            SearchBar()
            }
            
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(vertical = 20.dp),
                verticalArrangement = Arrangement.spacedBy(100.dp),
                horizontalAlignment = Alignment.Start,
                contentPadding = PaddingValues(horizontal = 18.dp)
            ) {
                items(10) {

                    Spacer(modifier = Modifier.width(10.dp))

                    My_preview()

                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    myapp()

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text ="60 RESTAURANT DELIVERY TO YOU",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.6f),
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    foodcard(img = R.drawable.penne_pasta,
                        dishname = "7 hill Restaurant",
                        restorentplace = "Lashkar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.burger_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.pizza_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Maharaja Complex DD Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.biryani,
                        dishname = "Shahi Tadka",
                        restorentplace = "Phool Bagh , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Gandhi Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img6,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img7,
                        dishname = "Shahi Tadka",
                        restorentplace = "DD Nagar,Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(img = R.drawable.img8,
                        dishname = "Shahi Tadka",
                        restorentplace = "Phool Bagh,Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two"
                    )

                }
            }

        }
    }
}
