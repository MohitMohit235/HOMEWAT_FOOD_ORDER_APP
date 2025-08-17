package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun My_preview() {

    val josefinSans =FontFamily(
        Font(R.font.josefinsans_regular, FontWeight.Normal)
    )

    Card(modifier = Modifier
        .width(600.dp)
        .height(180.dp),
        shape = RoundedCornerShape(12.dp),
    ){

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Black)
        ){

            Image(painter = painterResource(R.drawable.img_2),
                contentDescription = "null",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .weight(0.65f)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp))
            )

            Box(modifier = Modifier
                .weight(0.35f)
                .background(Color.Black)
                .fillMaxHeight()
                .padding(start = 2.dp),
                contentAlignment = Alignment.CenterStart
            ){
                Column(modifier = Modifier, horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Get up to",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = josefinSans
                    )
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "40%",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Medium,
                            fontFamily = josefinSans
                        )
                        Text(
                            text = "OFF",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            fontFamily = josefinSans,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }
                    Text(
                        text = "on your first order with Homeway ",
                        color = Color.White,
                        fontSize = 7.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = josefinSans,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Box(modifier = Modifier
                        .fillMaxWidth().align(Alignment.CenterHorizontally)
                        ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6471FF)),
                            shape = RoundedCornerShape(4.dp),
                            contentPadding = PaddingValues(0.dp),
                            modifier = Modifier
                                .width(85.dp)
                                .height(18.dp))
                        {
                            Text(
                                text = "Order Now",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.White,
                                fontFamily = josefinSans,
                                modifier = Modifier.align(Alignment.CenterVertically)
                            )
                        }
                    }
                }
            }
        }
    }
}
