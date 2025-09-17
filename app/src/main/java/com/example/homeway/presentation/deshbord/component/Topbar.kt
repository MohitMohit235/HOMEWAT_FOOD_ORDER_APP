package com.example.homeway.presentation.deshbord.component


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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material3.Switch
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
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
fun topbar(){
    val marcellusFont =FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal)
    )
    var checked by remember { mutableStateOf(true) }
    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )

    Box(modifier = Modifier
        .fillMaxWidth()
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
            Row(
                modifier = Modifier
                    .padding(horizontal = 3.dp, vertical = 3.dp)
                    .padding(top = 25.dp)
                    .fillMaxWidth()
                    .height(30.dp),
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

                Spacer(modifier = Modifier.width(4.dp))
                VerticalDivider(
                    color = Color(0xFF6471FF),
                    modifier = Modifier
                        .height(15.dp)
                        .padding(vertical = 2.dp)
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
                Spacer(modifier = Modifier.weight(0.5f))

                Switch(
                    modifier = Modifier.scale(0.6f),
                    checked = checked,
                    onCheckedChange = {checked=it},

                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color(0xFFFFFFFF),
                        checkedTrackColor =Color(0xFFFFFFFF),
                        checkedBorderColor = Color(0xFF09AA39),
                        uncheckedThumbColor =Color(0xFFFFFFFF),
                        uncheckedTrackColor = Color(0xFFFFFFFF),
                        uncheckedBorderColor = Color(0xFF663333)

                    ),

                    thumbContent = {
                        if (checked){
                            Image(
                                painter = painterResource(R.drawable.circal_veg),
                                contentDescription = null
                            )
                        }else{
                            Image(
                                painter = painterResource(R.drawable.circal_nonveg),
                                contentDescription = null
                            )
                        }
                    }
                )



                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .size(30.dp)
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
}

@Preview
@Composable
private fun llll() {

    var selectedTab by remember { mutableStateOf(0) }
    val categories = listOf(
        CategoryItem("All", R.drawable.all),
        CategoryItem("Pizza", R.drawable.pizzzza),
        CategoryItem("Burger", R.drawable.burgerssss),
        CategoryItem("Pasta", R.drawable.pastaaa),
        CategoryItem("Curry", R.drawable.curryyyy),
        CategoryItem("Dal", R.drawable.dals),
        CategoryItem("Biryani", R.drawable.biryanidish),
        CategoryItem("Noodle", R.drawable.noodlessss),
        CategoryItem("Fish", R.drawable.fishh),
        CategoryItem("See all",R.drawable.seeallfood),
    )

    Foodhorizontal(
        categories = categories,
        selectedTabIndex = selectedTab,
        onTabSelected = { index ->
            selectedTab = index
        }
    )


    
}



data class CategoryItem(
    val name: String,
    val imgs: Int
)



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Foodhorizontal(
    categories: List<CategoryItem>,
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {


    val marcellusFont =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )
    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )

    Box(modifier = Modifier
        .fillMaxWidth()
        ) {
        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = Color.Transparent,
            edgePadding = 0.dp,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                        .padding(start = 4.dp)
                        .height(3.dp),
                    color = Color(0xFF6471FF),

                    )
            },
            divider = {}
        ) {
            categories.forEachIndexed { index, category ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { onTabSelected(index) },
                    modifier = Modifier.padding(horizontal = 1.5.dp)
                ){
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = category.imgs),
                            contentDescription = category.name,
                            modifier = Modifier
                                .size(50.dp)
                        )

                       Row (modifier = Modifier.padding(top = 5.dp)){
                           Text(
                               text = category.name,
                               fontSize = 12.sp,
                               fontFamily = marcellusFont,
                               color = if (selectedTabIndex == index) Color.Black else Color.Black.copy(alpha = 0.5f),
                               fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal
                           )

                           if (category.name == "See all") {
                               Icon(
                                   imageVector = Icons.Default.KeyboardArrowDown,
                                   contentDescription = "Arrow",
                                   tint = Color(0xFF6471FF),
                                   modifier = Modifier.size(16.dp)
                                       .clickable { showBottomSheet = true }
                               )
                               if (showBottomSheet) {
                                   ModalBottomSheet(
                                       modifier = Modifier.fillMaxHeight(),
                                       sheetState = sheetState,
                                       onDismissRequest = { showBottomSheet = false }
                                   ) {
                                       FoodGridScreen()
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