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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.time.delay

@OptIn(ExperimentalAnimationApi::class)
@SuppressLint("SuspiciousIndentation")
@Composable
fun SearchBar(texts: List<String>,
              intervalMs: Long = 100,
              style: TextStyle = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)) {

    var index by remember { mutableStateOf(0) }

    val jonefont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )

Box(
    modifier = Modifier.height(67.dp).fillMaxWidth()
        .background(brush = Brush.verticalGradient(
            listOf(
                Color.White,
                Color.White,
                Color.White,
                Color.White,
                Color.Transparent)
        )),
    contentAlignment = Alignment.TopCenter
){

    Row(
        modifier = Modifier.padding(top = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .border(BorderStroke(width = 1.dp,Color(0xFF6471FF)), shape = RoundedCornerShape(8.dp))
                .height(45.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.width(5.dp))

                Box(
                    modifier = Modifier.width(300.dp).fillMaxHeight(),
                    contentAlignment = Alignment.CenterStart
                ) {

                    LaunchedEffect(texts) {
                        while (true) {
                            delay(intervalMs)
                            index = (index + 1) % texts.size
                        }
                    }


                    AnimatedContent(
                        targetState = texts[index],
                        transitionSpec = {
                            slideInVertically(
                                initialOffsetY = { fullHeight -> fullHeight }
                            ) with slideOutVertically(
                                targetOffsetY = { fullHeight -> -fullHeight }
                            )
                        }, label = ""
                    ) { targetText ->
                        Text(
                            text = targetText,
                            style = style,
                            fontSize = 15.sp,
                            fontFamily = jonefont,
                            color = Color.Black.copy(alpha = 0.7f),
                            modifier = Modifier.fillMaxHeight().padding(top = 15.dp)
                        )
                    }
                }

                VerticalDivider(thickness = 1.5.dp, modifier = Modifier.height(30.dp), color = Color.Black.copy(alpha = 0.5f))

                Spacer(modifier = Modifier.width(5.dp))
                Icon(
                    imageVector = Icons.Outlined.MicNone,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

                }
            }
        }
    }
 }

@Preview
@Composable
private fun text() {
    SearchBar( texts = listOf("Search", "Restaurants name", "Foods name", "According to your mind"),
        intervalMs = 1500)
}



//Box(
//modifier = Modifier
//.size(45.dp)
//) {
//    SmallFloatingActionButton(
//        onClick = {},
//        containerColor = Color.White,
//        shape = RoundedCornerShape(10.dp),
//        modifier = Modifier.border(
//            BorderStroke(
//                width = 1.dp,
//                brush = Brush.horizontalGradient(
//                    colors = listOf(
//                        Color.Cyan,
//                        Color.Magenta
//                    )
//                )
//            ), shape = RoundedCornerShape(12.dp)
//        )
//    ) {
//        Text(
//            text = "AI",
//            fontWeight = FontWeight.Medium,
//            fontSize = 20.sp,
//            fontFamily = jonefont
//        )
//    }
//}