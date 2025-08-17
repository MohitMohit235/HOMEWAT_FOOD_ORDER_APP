package com.example.homeway.presentation.deshbord.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
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
fun topbar(categories: List<String>,
           selectedTabIndex: Int,
           onTabSelected: (Int) -> Unit){
    val marcellusFont =FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal)
    )

    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(134.dp)
        .background(Color(0xFFFFFFFF))
        .drawBehind {
            val shadowHeight = 2.dp.toPx()
            drawRect(
                color = Color.Black.copy(alpha = 0.1f),
                topLeft = Offset(0f, size.height - shadowHeight),
                size = Size(width = size.width, height = shadowHeight)
            )
        }
    ) {
        Column(modifier = Modifier.padding(3.dp)) {
            Row(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .fillMaxWidth()
                    .height(41.dp),
                horizontalArrangement = Arrangement.Absolute.Left,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = "Location",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(20.dp)

                )
                Spacer(modifier = Modifier.width(1.dp))
                Text(
                    text = "Gwalior",
                    color = Color(0xFF626161),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = marcellusFont,
                    modifier = Modifier.padding(start = 0.dp)
                )
                Text(
                    text = ",",
                    color = Color(0xFF626161),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = marcellusFont
                )

                Text(
                    text = "Narsingh Nagar",
                    color = Color(0xFF626161),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = marcellusFont,
                    modifier = Modifier
                        .padding(bottom = 0.dp)
                        .padding(start = 3.dp)
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Location",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier
                        .size(20.dp)
                        .padding(top = 3.dp)

                )
                Spacer(modifier = Modifier.weight(0.10f))
                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)


                ) {
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 97.dp), contentAlignment = Alignment.Center) {
            ScrollableTabRow(
                selectedTabIndex = selectedTabIndex,
                backgroundColor = Color.White,
                edgePadding = 0.dp,
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
                        unselectedContentColor = Color.Black.copy(alpha = 0.20f)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                        ) {
                            Text(
                                text = category,
                                fontSize = 15.sp,
                                fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                                fontFamily = marcellusFont,
                                modifier = Modifier.padding(end = 20.dp)
                            )

                            if (category == "See all") {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    contentDescription = "Arrow",
                                    tint = Color(0xFF6471FF),
                                    modifier = Modifier.size(18.dp)
                                        .clickable{showBottomSheet=true}
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

@Preview
@Composable
private fun llll() {

    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        "ALL", "Pizza", "Burger", "Pasta", "Noodle",
        "Curry", "Fish", "Dal fry", "Biryani", "See all",

        )
    topbar( categories = categories,
        selectedTabIndex = selectedTab,
        onTabSelected = { selectedTab = it })
}