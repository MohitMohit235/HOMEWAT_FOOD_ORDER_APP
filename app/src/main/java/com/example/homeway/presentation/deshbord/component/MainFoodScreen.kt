package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
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
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.WifiCalling3
import androidx.compose.material.icons.outlined.Directions
import androidx.compose.material.icons.outlined.Reviews
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.TabRowDefaults
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodScreen(categories: List<String>,
               selectedTabIndex: Int,
               onTabSelected: (Int) -> Unit) {

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
                Box (
                    modifier = Modifier
                        .height(280.dp)
                        .fillMaxWidth()
                        .padding(6.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.penne_pasta),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )


                    Image(
                        painter = painterResource(R.drawable.veg_icon),
                        contentDescription = "veg",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.BottomEnd)
                            .padding(end = 12.dp, bottom = 12.dp)
                    )

                    Box(
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .size(30.dp)
                            .clip(CircleShape)
                            .background(Color.Black.copy(alpha = 0.4f))
                    ){
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.padding(6.dp)
                        )
                    }


                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ){
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Penne Pasta",
                            fontSize = 29.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFF2B2B2B)
                        )

                        Card (
                            modifier = Modifier
                                .width(35.dp)
                                .height(17.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF056923)),
                            shape = RoundedCornerShape(5.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(17.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ){
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

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Originates , Italy",
                            fontSize = 15.sp,
                            fontFamily = mac,
                            fontWeight = FontWeight.Normal
                        )

                        Text(
                            text = "Today 10:00Am to 11:00Pm",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFF2B2B2B)
                        )

                    }

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Sanatan Dharam Mandir Road , Lashkar , Gwalior",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = mac,
                            color = Color(0xFF2B2B2B)
                        )
                        Card (
                            modifier = Modifier
                                .width(33.dp)
                                .height(12.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFE73F46)),
                            shape = RoundedCornerShape(5.dp)
                        ){
                            Box(
                                modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                                contentAlignment = Alignment.Center) {
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

                            VerticalDivider(thickness = 0.8.dp, modifier = Modifier.height(17.dp), color = Color.Gray)

                            Text(
                                text = "₹250 for one",
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

                    Row (
                        modifier = Modifier
                            .width(280.dp)
                            .height(32.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){

//-----------------------------------------------------------------------------------------------------------------
                        val borderWidth = 300.dp
                        OutlinedCard(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .clickable {}
                                .width(88.dp)
                                .height(28.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            shape = RoundedCornerShape(6.dp)
                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(28.dp)
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Directions,
                                    contentDescription = "Location",
                                    tint = Color(0xFF6471FF),
                                    modifier = Modifier
                                        .size(25.dp)
                                        .align(Alignment.CenterVertically)
                                        .padding(start = 8.dp)
                                )
                                Box(
                                    modifier = Modifier
                                        .weight(0.5f)
                                        .fillMaxHeight()
                                        .padding(5.dp),
                                    contentAlignment = Alignment.CenterStart
                                ){
                                    Text(
                                        text = "Direction",
                                        color = Color(0xFF282828),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Light

                                    )
                                }
                            }
                        }

//-----------------------------------------------------------------------------------------------------------------
                        OutlinedCard(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .clickable {}
                                .width(76.dp)
                                .height(28.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            shape = RoundedCornerShape(6.dp)
                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(28.dp)
                            ) {

                                Icon(
                                    imageVector = Icons.Default.Share,
                                    contentDescription = "Location",
                                    tint = Color(0xFF6471FF),
                                    modifier = Modifier
                                        .size(25.dp)
                                        .align(Alignment.CenterVertically)
                                        .padding(start = 8.dp)
                                )
                                Box(
                                    modifier = Modifier
                                        .weight(0.5f)
                                        .fillMaxHeight()
                                        .padding(5.dp),
                                    contentAlignment = Alignment.CenterStart
                                ){
                                    Text(
                                        text = "Share",
                                        color = Color(0xFF282828),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Light

                                    )
                                }
                            }
                        }

//-----------------------------------------------------------------------------------------------------------------
                        OutlinedCard(
                            border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .clickable {}
                                .width(80.dp)
                                .height(28.dp)
                                .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            shape = RoundedCornerShape(6.dp)
                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(28.dp)
                            ) {

                                Icon(
                                    imageVector = Icons.Outlined.Reviews,
                                    contentDescription = "Location",
                                    tint = Color(0xFF6471FF),
                                    modifier = Modifier
                                        .size(25.dp)
                                        .align(Alignment.CenterVertically)
                                        .padding(start = 8.dp)
                                )
                                Box(
                                    modifier = Modifier
                                        .weight(0.5f)
                                        .fillMaxHeight()
                                        .padding(5.dp),
                                    contentAlignment = Alignment.CenterStart
                                ){
                                    Text(
                                        text = "Review",
                                        color = Color(0xFF282828),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Light

                                    )
                                }
                            }
                        }
                    }


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(190.dp)
                            .padding(8.dp)
                    ) {
                        // Left Grid - 4 small images
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .height(190.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(10.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.penne_pasta),
                                    contentDescription = "null",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.weight(1f)
                                )
                                Image(
                                    painter = painterResource(R.drawable.penne_pasta),
                                    contentDescription = "null",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.weight(1f)
                                )

                            }
                            Row(
                                modifier = Modifier.weight(1f),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.penne_pasta),
                                    contentDescription = "null",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.weight(1f)
                                )
                                Image(
                                    painter = painterResource(R.drawable.penne_pasta),
                                    contentDescription = "null",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.weight(1f)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))


                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(190.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.penne_pasta),
                                contentDescription = "null",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxHeight()
                            )


                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .align(Alignment.Center)
                                    .background(Color.Black.copy(alpha = 0.6f))
                                    .padding(horizontal = 16.dp, vertical = 8.dp),

                            ) {
                                Text(
                                    text = "View More",
                                    color = Color.White,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp,
                                    modifier = Modifier.align(Alignment.Center)
                                )
                            }
                        }
                    }

                    Box(modifier = Modifier
                        .fillMaxWidth(),contentAlignment = Alignment.Center) {
                        ScrollableTabRow(
                            selectedTabIndex = selectedTabIndex,
                            backgroundColor = Color.White,
                            edgePadding = 3.dp,
                            indicator = { tabPositions ->
                                TabRowDefaults.Indicator(
                                    modifier = Modifier
                                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                                        .height(3.dp),
                                    color = Color(0xFF7A63FF),

                                    )
                            },
                            divider = {}
                        ) {
                            categories.forEachIndexed { index, category ->
                                Tab(
                                    selected = selectedTabIndex == index,
                                    onClick = { onTabSelected(index) },
                                    selectedContentColor = Color.Black,
                                    unselectedContentColor = Color.Black.copy(alpha = 2.8f),
                                    modifier = Modifier.width(IntrinsicSize.Min)

                                ) {
                                    Row(
                                        horizontalArrangement = Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth().padding(horizontal = 6.dp, vertical = 8.dp)
                                    ) {
                                        Text(
                                            text = category,
                                            fontSize = 15.sp,
                                            fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                                            fontFamily = MergFont,
                                            modifier = Modifier.padding(end = 20.dp)
                                        )

                                        if (category == "See all") {
                                            Icon(
                                                imageVector = Icons.Default.KeyboardArrowDown,
                                                contentDescription = "Arrow",
                                                tint = Color(0xFF6471FF),
                                                modifier = Modifier
                                                    .size(18.dp)
                                                    .clickable { showBottomSheet = true }
                                            )
                                            if (showBottomSheet) {
                                                ModalBottomSheet(
                                                    modifier = Modifier.fillMaxHeight(),
                                                    sheetState = sheetState,
                                                    onDismissRequest = { showBottomSheet = false }
                                                ) {
                                                    SEE_ALL()
                                                }
                                            }
                                        }
                                    }
                                }
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
        onTabSelected = { selectedTab = it })
}