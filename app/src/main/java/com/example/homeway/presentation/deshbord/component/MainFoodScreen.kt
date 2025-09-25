package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.WifiCalling3
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodScreen(categories: List<String>,
               selectedTabIndex: Int,
               onTabSelected: (Int) -> Unit,time : String) {

    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )

     val MergFont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )
    val mac = FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal)
    )
    Surface(
        modifier = Modifier
            .fillMaxSize()
        
    ){
        LazyColumn (
            modifier = Modifier
                .width(300.dp)
                .fillMaxHeight()
                .padding(top = 40.dp)
        ){
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "7 hill Restaurant",
                            fontSize = 29.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFF2B2B2B)
                        )

                        Card(
                            modifier = Modifier
                                .width(35.dp)
                                .height(17.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF056923)),
                            shape = RoundedCornerShape(5.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(17.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "4.3",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = MergFont,
                                    color = Color(0xFFFFFFFF)
                                )
                                Spacer(modifier = Modifier.width(3.dp))
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFFFFFF),
                                    modifier = Modifier.size(9.dp)
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Timer,
                            contentDescription = null,
                            tint = Color(0xFF525252),
                            modifier = Modifier.size(15.dp)
                        )


                        androidx.compose.material3.Text(
                            text = time,
                            fontFamily = MergFont,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF525252),

                            )

                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Sanatan Dharam Mandir Road , Lashkar , Gwalior",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = mac,
                            color = Color(0xFF2B2B2B)
                        )
                        Card(
                            modifier = Modifier
                                .width(33.dp)
                                .height(12.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFE73F46)),
                            shape = RoundedCornerShape(5.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "OPEN",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = MergFont,
                                    color = Color(0xFFFFFFFF)
                                )
                            }
                        }

                    }
                    Row(
                        modifier = Modifier
                            .height(20.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            modifier = Modifier
                                .height(20.dp)
                                .width(194.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.WifiCalling3,
                                contentDescription = null,
                                tint = Color(0xFF6471FF),
                                modifier = Modifier.size(17.dp)
                            )

                            Text(
                                text = "+916263672804",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = MergFont,
                                color = Color(0xFF4B4B4B)
                            )

                            VerticalDivider(
                                thickness = 0.8.dp,
                                modifier = Modifier.height(17.dp),
                                color = Color.Gray
                            )

                            Text(
                                text = "₹650 for two",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = MergFont,
                                color = Color(0xFF4B4B4B)
                            )

                        }
                        Text(
                            text = "Distance 1.6 Km",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFF2B2B2B)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "150+ Dishes",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = MergFont,
                            color = Color(0xFF616161),
                            modifier = Modifier
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Vegetarian",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = MergFont,
                            color = Color(0xFF616161),
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        FoodOdringCard(
                            img = R.drawable.img,
                            DishName = "Kdai Paneer",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "210",
                            veg = R.drawable.veg_icon
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.img6,
                            DishName = "Dal fry",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "210",
                            veg = R.drawable.veg_icon
                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.chole_bhature,
                            DishName = "Chole Bhature",
                            Discription = "when this is set, it skdksfk oodfjn osdn fnds sidfiasnd sid nfsaodn sdnfoas nfsad will force the emu to use the",
                            Price = "210",
                            veg = R.drawable.veg_icon
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.penne_pasta,
                            DishName = "Pasta",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "210",
                            veg = R.drawable.veg_icon
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.pizza_img,
                            DishName = "Pizza",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "420",
                            veg = R.drawable.veg_icon
                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "Non-Vegetarian",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = MergFont,
                            color = Color(0xFF616161),
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.img7,
                            DishName = "Chicken 66",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "130",
                            veg = R.drawable.nonveg_icon
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.biryani,
                            DishName = "Chicken Biryani",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "130",
                            veg = R.drawable.nonveg_icon
                        )
                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.burger_img,
                            DishName = "Burger",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "210",
                            veg = R.drawable.nonveg_icon
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "Desserts",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = MergFont,
                            color = Color(0xFF616161),
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        FoodOdringCard(
                            img = R.drawable.img8,
                            DishName = "Rasgulla",
                            Discription = "when this is set, it will force the emu to use the",
                            Price = "130",
                            veg = R.drawable.icondess
                        )

                    }




            Spacer(modifier = Modifier.height(10.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Column(
                            modifier = Modifier
                                .width(350.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {

                            Text(
                                text = "Similar Restaurant",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = MergFont,
                                color = Color(0xFF2B2B2B),
                                modifier = Modifier
                            )

                            Similar()
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {

                            Text(
                                text = "More Restaurant",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = MergFont,
                                color = Color(0xFF2B2B2B),
                                modifier = Modifier.padding(start = 10.dp)
                            )

                            HorizontalDivider(thickness = 2.dp)

                            Spacer(modifier = Modifier.height(5.dp))

                            res(
                                img = R.drawable.biryani,
                                Resname = "7 hill Restaurant",
                                Address = "Nani Plaza, Lashkar, Gwalior",
                                time = "10:20Pm to 11:40Am",
                                Distance = "1.0"
                            )

                            res(
                                img = R.drawable.biryani,
                                Resname = "7 hill Restaurant",
                                Address = "Nani Plaza, Lashkar, Gwalior",
                                time = "10:20Pm to 11:40Am",
                                Distance = "1.0"
                            )

                            res(
                                img = R.drawable.biryani,
                                Resname = "7 hill Restaurant",
                                Address = "Nani Plaza, Lashkar, Gwalior",
                                time = "10:20Pm to 11:40Am",
                                Distance = "1.0"
                            )

                            res(
                                    img = R.drawable.biryani,
                            Resname = "7 hill Restaurant",
                            Address = "Nani Plaza, Lashkar, Gwalior",
                            time = "10:20Pm to 11:40Am",
                            Distance = "1.0"
                            )

                            res(
                                img = R.drawable.biryani,
                                Resname = "7 hill Restaurant",
                                Address = "Nani Plaza, Lashkar, Gwalior",
                                time = "10:20Pm to 11:40Am",
                                Distance = "1.0"
                            )

                            res(
                                img = R.drawable.biryani,
                                Resname = "7 hill Restaurant",
                                Address = "Nani Plaza, Lashkar, Gwalior",
                                time = "10:20Pm to 11:40Am",
                                Distance = "1.0"
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically){
                                Text(
                                    text = "Show more",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = MergFont,
                                    color = Color(0xFF6471FF),
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                                Icon(
                                    imageVector = Icons.Default.ArrowRight,
                                    contentDescription = "Location",
                                    tint = Color(0xFF6471FF),
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding(end = 7.dp)
                                )

                            }

                        }



                    }

                }
            }


                



            }
        }
    }




@Preview
@Composable
private fun ok() {
    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "Overview", "Online","Review","Menu",

        )
    FoodScreen(categories = categories,
        selectedTabIndex = selectedTab,
        onTabSelected = { selectedTab = it }, time = "30-50 min • 2km")
}



@Composable
private fun res(
    img: Int,Resname: String,
    Address: String,
    time: String,
    Distance: String
) {
    val MergFont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp)
            .padding(start = 15.dp)
            .clip(RoundedCornerShape(11.dp))
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .size(58.dp)
                    .clip(CircleShape)

            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "null",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

    Column (
        modifier = Modifier
            .height(50.dp)
            .padding(end = 40.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = Resname,
            color = Color(0xFF2F2F2F),
            fontSize = 20.sp,
            fontFamily = MergFont,
            fontWeight = FontWeight.Light

        )
        Text(
            text = Address,
            color = Color(0xFF2F2F2F),
            fontSize = 13.sp,
            fontFamily = MergFont,
            fontWeight = FontWeight.Light

        )
        Text(
            text = "Today ${time}",
            color = Color(0xFF2F2F2F),
            fontSize = 9.sp,
            fontFamily = MergFont,
            fontWeight = FontWeight.Light

        )
    }

            Column (
                modifier = Modifier
                    .height(50.dp)
                    .padding(end = 5.dp, top = 6.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceBetween
            ){

                Card(
                    modifier = Modifier
                        .width(33.dp)
                        .height(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE73F46)),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "OPEN",
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFFFFFFFF)
                        )
                    }
                }

                Text(
                    text = "Distance ${Distance}m",
                    color = Color(0xFF2F2F2F),
                    fontSize = 8.sp,
                    fontFamily = MergFont,
                    fontWeight = FontWeight.Light

                )
            }

        }
    }
}


@Preview
@Composable
private fun Similar() {
    val MergFont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )

    ElevatedCard(
        modifier = Modifier
            .width(185.dp)
            .height(200.dp),

        shape = RoundedCornerShape(11.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(3.dp)

    ){
      Column (
          modifier = Modifier
              .fillMaxSize()
              .padding(vertical = 6.dp)
              .padding(horizontal = 6.dp),
          verticalArrangement = Arrangement.spacedBy(8.dp),
          horizontalAlignment = Alignment.CenterHorizontally
      ){
         Image(
             painter = painterResource(R.drawable.img_1),
             contentDescription = null,
             modifier = Modifier
                 .clip(RoundedCornerShape(10.dp))


         )

          Row (modifier = Modifier.fillMaxWidth(),
              verticalAlignment = Alignment.CenterVertically
          ){
              Text(
                  text = "Lal Jira Tadka",
                  fontSize = 16.sp,
                  fontWeight = FontWeight.Normal,
                  fontFamily = MergFont,
                  color = Color(0xFF2B2B2B)
              )

              Spacer(modifier = Modifier.width(5.dp))

              Card(
                  modifier = Modifier
                      .width(19.dp)
                      .height(13.dp)
                      .align(Alignment.CenterVertically),
                  colors = CardDefaults.cardColors(containerColor = Color(0xFF056923)),
                  shape = RoundedCornerShape(5.dp)
              ) {
                  Row(
                      modifier = Modifier
                          .fillMaxWidth()
                          .padding(vertical = 3.dp)
                          .height(17.dp),
                      verticalAlignment = Alignment.CenterVertically,
                      horizontalArrangement = Arrangement.Center
                  ) {
                      Text(
                          text = "4.3",
                          fontSize = 6.sp,
                          fontWeight = FontWeight.Normal,
                          fontFamily = MergFont,
                          color = Color(0xFFFFFFFF)
                      )
                      Spacer(modifier = Modifier.width(2.dp))
                      Icon(
                          imageVector = Icons.Default.Star,
                          contentDescription = null,
                          tint = Color(0xFFFFFFFF),
                          modifier = Modifier.size(5.dp)
                      )
                  }
              }

              Spacer(modifier = Modifier.width(5.dp))
VerticalDivider(
 thickness = 1.dp,
 modifier = Modifier
     .height(14.dp),
 color = Color.Gray)

              Spacer(modifier = Modifier.width(5.dp))

              Text(
                  text = "Delivery",
                  fontSize = 10.sp,
                  fontWeight = FontWeight.Normal,
                  fontFamily = MergFont,
                  color = Color(0xFF2B2B2B)
              )
          }

     HorizontalDivider(thickness = 1.5.dp)

          Text(
              text = "42, Near Poppys Tower, Race Course, Coimbatore",
              fontSize = 10.sp,
              fontWeight = FontWeight.Normal,
              fontFamily = MergFont,
              color = Color(0xFF3E3E3E)
          )

      }
 }
}









//======================MENU BOX==================
//Column(
//modifier = Modifier
//.fillMaxWidth(),
//verticalArrangement = Arrangement.spacedBy(6.dp)
//){
//
//    Text(
//        text = "Menu",
//        fontSize = 20.sp,
//        fontWeight = FontWeight.Normal,
//        fontFamily = MergFont,
//        color = Color(0xFF2B2B2B),
//        modifier = Modifier.padding(start = 10.dp)
//    )
//
//    Text(
//        text = "Cuisines",
//        fontSize = 15.sp,
//        fontWeight = FontWeight.Light,
//        fontFamily = MergFont,
//        color = Color(0xFF2B2B2B),
//        modifier = Modifier.padding(start = 10.dp)
//    )
//    Row (
//        modifier = Modifier
//            .width(270.dp)
//            .height(30.dp)
//            .padding(start = 14.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween
//    ){
//
//        Card(
//            modifier = Modifier
//                .clickable {}
//                .width(72.dp)
//                .height(15.dp)
//                .align(Alignment.CenterVertically),
//            colors = CardDefaults.cardColors(containerColor = Color.Gray.copy(0.1f)),
//            shape = RoundedCornerShape(6.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(28.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .align(Alignment.CenterVertically)
//                        .padding(start = 4.dp)
//                )
//                Text(
//                    text = "North Indian",
//                    color = Color(0xFF2F2F2F),
//                    fontSize = 8.sp,
//                    fontWeight = FontWeight.Light
//
//                )
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .padding(end = 4.dp)
//                )
//            }
//        }
//
//        Card(
//            modifier = Modifier
//                .clickable {}
//                .width(72.dp)
//                .height(15.dp)
//                .align(Alignment.CenterVertically),
//            colors = CardDefaults.cardColors(containerColor = Color.Gray.copy(0.1f)),
//            shape = RoundedCornerShape(6.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(28.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .align(Alignment.CenterVertically)
//                        .padding(start = 4.dp)
//                )
//                Text(
//                    text = "North Indian",
//                    color = Color(0xFF2F2F2F),
//                    fontSize = 8.sp,
//                    fontWeight = FontWeight.Light
//
//                )
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .padding(end = 4.dp)
//                )
//            }
//        }
//
//        Card(
//            modifier = Modifier
//                .clickable {}
//                .width(72.dp)
//                .height(15.dp)
//                .align(Alignment.CenterVertically),
//            colors = CardDefaults.cardColors(containerColor = Color.Gray.copy(0.1f)),
//            shape = RoundedCornerShape(6.dp)
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(28.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .align(Alignment.CenterVertically)
//                        .padding(start = 4.dp)
//                )
//                Text(
//                    text = "North Indian",
//                    color = Color(0xFF2F2F2F),
//                    fontSize = 8.sp,
//                    fontWeight = FontWeight.Light
//
//                )
//                Icon(
//                    imageVector = Icons.Default.Star,
//                    contentDescription = "Location",
//                    tint = Color(0xFFEFBD42),
//                    modifier = Modifier
//                        .size(10.dp)
//                        .padding(end = 4.dp)
//                )
//            }
//        }
//    }
//    Row (
//        modifier = Modifier
//            .width(270.dp)
//            .fillMaxHeight()
//            .padding(start = 14.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween
//    ){
//        Image(
//            painter = painterResource(R.drawable.menu),
//            contentDescription = null,
//            modifier = Modifier
//                .height(180.dp)
//                .width(140.dp)
//        )
//        Image(
//            painter = painterResource(R.drawable.menu2),
//            contentDescription = null,
//            modifier = Modifier
//                .height(190.dp)
//                .width(140.dp)
//        )
//    }
//}
