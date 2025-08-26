package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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


@Preview
@Composable
fun Cartfood(modifier: Modifier = Modifier) {

    val cardfont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )


    var count by remember { mutableStateOf(1) }
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFEDEEFF)),
        modifier = Modifier
            .width(390.dp)
            .height(100.dp),
        onClick = {}
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ){

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(110.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Image(
                    painter = painterResource(R.drawable.chole_bhature),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }

            Column (
                modifier = Modifier
                    .fillMaxHeight()
                    .width(145.dp)
                    .padding(start = 10.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Chole Bhature",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black.copy(alpha = 0.6f)
                )
                Spacer(modifier= Modifier.height(5.dp))
                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black.copy(alpha = 0.6f)
                )
            }


            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(2.dp)
                ) {


                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clickable { count++ },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Default.ArrowDropUp,
                            contentDescription = "Increase",
                            modifier = Modifier.size(50.dp)
                        )
                    }


                    Text(
                        text = "$count item",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(vertical = 2.dp),
                        fontFamily = cardfont,
                        color = Color.Black.copy(alpha = 0.7f)
                    )


                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clickable { if (count > 0) count-- },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Default.ArrowDropDown,
                            contentDescription = "Decrease",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            }



        }
    }

}