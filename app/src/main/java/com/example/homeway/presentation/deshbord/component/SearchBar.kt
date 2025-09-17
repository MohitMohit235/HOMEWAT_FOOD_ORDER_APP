package com.example.homeway.presentation.deshbord.component

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MicNone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R
import kotlinx.coroutines.delay




@OptIn(ExperimentalAnimationApi::class)
@SuppressLint("SuspiciousIndentation")
@Composable
fun SearchBar(texts: List<String>,
              intervalMs: Long = 4000L,
              typingSpeed: Long = 10L,
              style: TextStyle = TextStyle.Default

    ){

    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
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
        CategoryItem("See all", R.drawable.heath),
    )


    var index by remember { mutableStateOf(0) }
    var displayedText by remember { mutableStateOf("") }


    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

Box(
    modifier = Modifier
        .background(Color.White),
    contentAlignment = Alignment.Center
){

Column (
    modifier = Modifier.padding(top = 10.dp),
    verticalArrangement = Arrangement.spacedBy(20.dp)
){
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(1.dp)
    ) {
        Card(
            modifier = Modifier
                .width(330.dp)
                .padding(horizontal = 10.dp)
                .shadow(5.dp, shape = RoundedCornerShape(10.dp), clip = true)
                .height(45.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier.width(210.dp).fillMaxHeight(),
                    contentAlignment = Alignment.CenterStart
                ) {


                    LaunchedEffect(index) {
                        displayedText = ""
                        val fullText = texts[index]
                        for (i in fullText.indices) {
                            displayedText = fullText.substring(0, i + 1)
                            delay(typingSpeed)
                        }
                    }


                    LaunchedEffect(texts) {
                        while (true) {
                            delay(intervalMs)
                            index = (index + 1) % texts.size
                        }
                    }

                    Box(
                        modifier = Modifier.width(210.dp).fillMaxHeight(),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            text = displayedText,
                            style = style,
                            fontSize = 15.sp,
                            fontFamily = jonefont,
                            color = Color.Black.copy(alpha = 0.5f),
                            modifier = Modifier.fillMaxHeight().padding(top = 15.dp)
                        )
                    }
                }

                VerticalDivider(
                    thickness = 1.dp,
                    modifier = Modifier.height(30.dp),
                    color = Color.Black.copy(alpha = 0.2f)
                )

                Spacer(modifier = Modifier.width(5.dp))
                Icon(
                    imageVector = Icons.Outlined.MicNone,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

            }
        }


        Box(
            modifier = Modifier
                .size(45.dp)
        ) {
            SmallFloatingActionButton(
                onClick = {},
                containerColor = Color.White,
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.border(
                    BorderStroke(
                        width = 1.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Cyan,
                                Color.Magenta
                            )
                        )
                    ), shape = RoundedCornerShape(12.dp)
                )
            ) {
                Text(
                    text = "Ai",
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    fontFamily = jonefont
                )
            }
        }


    }

    Foodhorizontal(
        categories = categories,
        selectedTabIndex = selectedTab,
        onTabSelected = { index ->
            selectedTab = index
        }
    )
        }
    }
 }

@Preview
@Composable
private fun text() {
    SearchBar( texts = listOf("Search", "Restaurants name", "Foods name", "According to your mind"),
        intervalMs = 1500)
}


