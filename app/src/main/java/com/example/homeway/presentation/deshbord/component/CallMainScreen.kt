package com.example.homeway.presentation.deshbord.component


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@Preview
@Composable
fun CallmainScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFFFFF))) {

        val bookedFoods = remember { mutableStateListOf<FoodItem>() }


        val listState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {

           item {
                  topbar()

               Spacer(modifier = Modifier.height(10.dp))
            }


            stickyHeader {
                Column (
                    modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
                ){


                SearchBar( texts = listOf("Search Restaurants name and Foods name"),
                    intervalMs = 2000)
            }
        }

            item() {
                Spacer(modifier = Modifier.height(10.dp))
                Column (
                    modifier = Modifier.padding(horizontal = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Spacer(modifier = Modifier.height(10.dp))
                    FilterSection()
                    Spacer(modifier = Modifier.height(10.dp))
                    My_preview()
                    Spacer(modifier = Modifier.height(16.dp))
                    MORE_EXPLORE()
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "360 RESTAURANTS TO YOU",
                        color = Color.Black.copy(alpha = 0.6f),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        letterSpacing = 2.sp,
                        modifier = Modifier
                            .align(Alignment.Start)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    foodcard(
                        img = R.drawable.penne_pasta,
                        dishname = "7 hill Restaurant",
                        restorentplace = "Lashkar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.burger_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.pizza_img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Maharaja Complex DD Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.biryani,
                        dishname = "Shahi Tadka",
                        restorentplace = "Phool Bagh , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.img,
                        dishname = "Shahi Tadka",
                        restorentplace = "Gandhi Nagar , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.img6,
                        dishname = "Shahi Tadka",
                        restorentplace = "City Center , Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.veg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.img7,
                        dishname = "Shahi Tadka",
                        restorentplace = "DD Nagar,Gwalior",
                        time = "20 mins • 2km",
                        veg_nonveg = R.drawable.nonveg_icon,
                        offer = "10% OFF up to two",
                        onBookClick = { bookedFoods.add(it) }
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    foodcard(
                        img = R.drawable.img8,
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


        val showButton by remember {
            derivedStateOf { listState.firstVisibleItemIndex > 0 }
        }

        if (showButton) {
            FloatingActionButton(
                onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(0)
                    }
                },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp),
                containerColor = Color(0xFF333333)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowUpward,
                    contentDescription = "Scroll to Top",
                    tint = Color.White
                )
            }
        }


        }
    }

