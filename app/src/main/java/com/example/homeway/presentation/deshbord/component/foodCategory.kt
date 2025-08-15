package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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


@Composable
private fun MY_foodCategory(img: Int,title: String) {

    val jonefont = FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal)
    )

    ElevatedCard(
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 12.dp),
        modifier = Modifier
            .width(115.dp)
            .padding(5.dp)
            .height(120.dp),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 20.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            Box(modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .shadow(elevation = 10.dp, ambientColor = Color.Black)){
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
            }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(22.dp)
            .background(color = Color.White),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = title,
                fontSize = 17.sp,
                fontFamily = jonefont,
                modifier = Modifier

            )
        }
        }
    }
}

@Preview
@Composable
fun FourColumnsFoodCategory() {
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(8.dp)
    ) {

        items(2) { rowIndex ->
            LazyRow(
                horizontalArrangement =  Arrangement.spacedBy(8.dp)
            ) {

                items(5) {
                    MY_foodCategory(
                        img = R.drawable.biryani,
                        title = "Biryani"
                    )
                }
            }
        }
    }
}
