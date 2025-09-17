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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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


@Preview
@Composable
fun My_preview() {

    val josefinSans =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Card(modifier = Modifier
        .width(320.dp)
        .height(110.dp),
        shape = RoundedCornerShape(12.dp),
    ){
        Box(modifier = Modifier
            .weight(0.35f)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF819AFF),
                        Color(0xFF819AFF),
                        Color(0xFFFBDACD)
                    )
                )
            )
            .fillMaxHeight(),
            contentAlignment = Alignment.CenterStart
        ) {

            Box (
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .width(160.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.previewmainimg),
                    contentDescription = "preview Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(180.dp)
                )
            }

            Box{
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.Start

                ){
                    Text(
                        text = "FIRST ORDER",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = josefinSans,
                        modifier = Modifier.padding(start = 8.dp)
                    )


                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "40% OFF",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = josefinSans,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }

                    Spacer(modifier = Modifier.height(5.dp))
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 225.dp, start = 30.dp)
                        .background(Color(0xFFEF4949))
                        .align(Alignment.Start)
                    ) {

                            Text(
                                text = "Check out",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.White,
                                fontFamily = josefinSans,
                                modifier = Modifier.padding(  5.dp)
                            )

                    }
                }
            }

      }
   }
}

