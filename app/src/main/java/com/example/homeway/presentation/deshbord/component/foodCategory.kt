package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Card
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
import java.nio.file.WatchEvent


@Composable
fun MY_foodCategory(img: Int, title: String, Discription : String) {

    val jonefont = FontFamily(
        Font(R.font.lato_regular, FontWeight.Normal)
    )

    Card (
        modifier = Modifier
            .width(300.dp)
            .height(60.dp)
            .clip(RoundedCornerShape(10.dp )),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){

            Image(
                painter = painterResource(id = img),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(10.dp)))

            Spacer(modifier = Modifier.width(5.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start

            ) {
                    Text(
                        text = title,
                        fontFamily = jonefont,
                        fontSize = 19.sp,
                        color = Color.Black.copy(alpha = 0.80f)
                    )

                Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = Discription,
                        fontSize = 12.sp,
                        color = Color.Black.copy(alpha = 0.60f),
                        fontFamily = jonefont
                    )
            }

        }

    }
    
}


@Preview
@Composable
private fun oko() {
    MY_foodCategory(
        img = R.drawable.chole_bhature,
        title = "Biryani",
        Discription = "Chole Bhature is a famous North Indian dish" +
            " consisting of spicy.")
}