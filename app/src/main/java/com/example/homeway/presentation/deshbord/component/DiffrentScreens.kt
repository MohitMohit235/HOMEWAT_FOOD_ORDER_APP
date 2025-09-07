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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Pizzascreen(){
        var selectedTab by remember { mutableStateOf(0) }
        val categories = listOf(
            "ALL", "Pizza", "Burger", "Pasta", "Noodle",
            "Curry", "Fish", "Dal fry", "Biryani", "See all",

            )
        val bookedFoods = remember { mutableStateListOf<FoodItem>() }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F8FF)),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {

            item {
                topbar( categories = categories,
                    selectedTabIndex = selectedTab,
                    onTabSelected = { selectedTab = it })
                Spacer(modifier = Modifier.height(20.dp))
            }
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF5F8FF))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    NormalSearchBar()
                }
            }
                item (){

                    Box (
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                    NormalFilterSection()
                    }

                    Column (
                        modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ){

                        Text(
                            text = "47 RESTAURANTS TO YOU",
                            color = Color.Black.copy(alpha = 0.6f),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            letterSpacing = 2.sp,
                            modifier = Modifier
                                .padding(top = 6.dp)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }

                        )


                        Spacer(modifier = Modifier.height(30.dp))
                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }
                        )


                        Spacer(modifier = Modifier.height(30.dp))
                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }
                        )


                        Spacer(modifier = Modifier.height(30.dp))
                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }
                        )



                        Spacer(modifier = Modifier.height(30.dp))
                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }
                        )



                        Spacer(modifier = Modifier.height(30.dp))
                        foodcard(
                            img = R.drawable.pizza_img,
                            dishname = "7 Hill Restaurant",
                            restorentplace = "PRG Colony, Lashkar, Gwalior",
                            time = "20 mins • 2km",
                            veg_nonveg = R.drawable.veg_icon,
                            offer = "10% OFF up to ₹200",
                            onBookClick = { bookedFoods.add(it) }
                        )
                    }
                }
            }
        }



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Bugerscreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "63 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.burger_img,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Pastascreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "28 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )




                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )




                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.penne_pasta,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Noodlescreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "57 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.noodles,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Curryscreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "54 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )




                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )




                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.curry,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Fishscreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "18 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.fish,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Dalsscreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "23 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.img6,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Biryaniscreen(){
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF)),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {

        item {
            topbar( categories = categories,
                selectedTabIndex = selectedTab,
                onTabSelected = { selectedTab = it })

            Spacer(modifier = Modifier.height(20.dp))
        }
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(horizontal = 20.dp, vertical = 8.dp)
            ) {
                NormalSearchBar()
            }
        }
        item (){

            Box (
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                NormalFilterSection()
            }

            Column (
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ){

                Text(
                    text = "46 RESTAURANTS TO YOU",
                    color = Color.Black.copy(alpha = 0.6f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 2.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))


                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )


                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )

                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )



                Spacer(modifier = Modifier.height(30.dp))
                foodcard(
                    img = R.drawable.biryani,
                    dishname = "7 Hill Restaurant",
                    restorentplace = "PRG Colony, Lashkar, Gwalior",
                    time = "20 mins • 2km",
                    veg_nonveg = R.drawable.veg_icon,
                    offer = "10% OFF up to ₹200",
                    onBookClick = { bookedFoods.add(it) }

                )
            }
        }
    }
}
