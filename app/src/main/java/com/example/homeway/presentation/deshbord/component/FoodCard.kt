package com.example.homeway.presentation.deshbord.component

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Percent
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
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


@SuppressLint("SuspiciousIndentation")
@Composable
fun foodcard(img: Int,
             dishname: String,
             restorentplace: String,
             time: String,
             veg_nonveg: Int,
             offer : String,
             onBookClick: (FoodItem) -> Unit
) {

    var isBookmarked by remember { mutableStateOf(false) }

    val marcellusFont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )



    OutlinedCard(
        modifier = Modifier
            .height(262.dp)
            .width(360.dp)
        .shadow(elevation = 10.dp,shape = RoundedCornerShape(12.dp),clip = false),
        colors = CardDefaults.cardColors(Color(0xFFEDEEFF)),
        border = BorderStroke(width = 2.dp, color = Color.Gray.copy(alpha = 0.2f))
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(193.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Box(modifier = Modifier) {
                    Image(
                        painter = painterResource(id = img),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                    )

                    Box(
                        modifier = Modifier
                            //  .width(106.dp)
                            .height(28.dp)
                            .padding(top = 12.dp, start = 10.dp)
                            .background(
                                color = Color(0x86000000),
                                shape = RoundedCornerShape(3.dp)
                            )
                    ) {
                        Text(
                            text = "Penna Pasta • ₹360",
                            fontSize = 10.sp,
                            fontFamily = marcellusFont,
                            fontWeight = FontWeight.Normal,
                            color = Color.White,
                            modifier = Modifier
                                .padding(vertical = 2.dp, horizontal = 4.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 172.dp)
                            .background(
                                Brush.horizontalGradient(
                                    listOf(
                                        Color.Black,
                                        Color.Transparent
                                    )
                                )
                            )
                    ) {
                        Text(
                            text = "PHT Colony, Lasker, Gwalior",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White,
                            modifier = Modifier
                                .padding(vertical = 2.dp, horizontal = 4.dp)
                        )
                    }

                    IconButton(
                        onClick = {
                            isBookmarked = !isBookmarked
                            if (isBookmarked) {
                                onBookClick
                            }
                        },
                        modifier = Modifier
                            .padding(end = 6.dp, top = 6.dp)
                            .align(Alignment.TopEnd)
                    ) {
                        Icon(
                            imageVector = if (isBookmarked) Icons.Filled.Bookmark else Icons.Outlined.BookmarkBorder,
                            contentDescription = "Bookmark",
                            tint = if (isBookmarked) Color(0xFFFFFFFF) else Color.Gray
                        )
                    }
                }
            }

            Box(
                modifier = Modifier
                    .width(380.dp)
                    .padding(horizontal = 10.dp)


            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 2.dp),
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = dishname,
                            fontFamily = marcellusFont,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1F1F1F)
                        )
                        Box(
                            modifier = Modifier
                                .width(30.dp)
                                .height(16.dp)
                                .background(
                                    color = Color(0xFF0B9A36),
                                    shape = RoundedCornerShape(5.dp)
                                ), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "4.3 +",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.White,
                            )
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


                        Text(
                            text = time,
                            fontFamily = marcellusFont,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF525252),

                            )

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(18.dp)
                            .padding(end = 60.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)

                    ) {
                        Image(
                            painter = painterResource(R.drawable.imgofffffer),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)

                        )

                        Text(
                            text = offer,
                            fontFamily = marcellusFont,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF262626).copy(alpha = 0.8f),

                            )
                    }

                }

            }
        }
    }
}


@Preview
    @Composable
    fun KokPreview() {
    val bookedFoods = remember { mutableStateListOf<FoodItem>() }
   Box (
        modifier = Modifier.fillMaxSize().background(Color.White),
       contentAlignment = Alignment.Center
    ){
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
