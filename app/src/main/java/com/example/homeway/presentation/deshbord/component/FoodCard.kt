package com.example.homeway.presentation.deshbord.component

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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


@SuppressLint("SuspiciousIndentation")
@Composable
fun foodcard(img: Int,
             dishname: String,
             price: String,
             distance: String,
             countryfood: String,
             restorentplace: String,
             veg_nonveg: Int
) {

    val marcellusFont = FontFamily(
        Font(R.font.lato_regular, FontWeight.Normal)
    )



            Card(
                modifier = Modifier
                    .height(270.dp)
                    .width(360.dp),
                colors = CardDefaults.cardColors(Color(0xFFEDEEFF))
            ){

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
                            Image(
                                painter = painterResource(id = veg_nonveg),
                                contentDescription = "veg",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .size(30.dp)
                                    .align(Alignment.BottomEnd)
                                    .padding(end = 12.dp, bottom = 12.dp)
                            )

                            Box(
                                modifier = Modifier
                                    .width(45.dp)
                                    .height(30.dp)
                                    .align(Alignment.TopEnd)
                                    .padding(end = 12.dp, top = 12.dp)
                                    .background(
                                        color = Color(0xFF0B9A36),
                                        shape = RoundedCornerShape(3.dp)
                                    ), contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "4.3+",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White,
                                )
                            }


                        }
                    }
                    Box(
                        modifier = Modifier
                            .width(340.dp)
                            .height(68.dp)
                            .align(Alignment.CenterHorizontally),


                        ) {
                        Column(modifier = Modifier.fillMaxHeight()) {
                            Text(
                                text = dishname,
                                fontFamily = marcellusFont,
                                fontSize = 24.sp,
                                color = Color(0xFF525252)
                            )

                            Text(
                                text = countryfood,
                                fontFamily = marcellusFont,
                                fontSize = 16.sp,
                                color = Color(0xFF525252)
                            )

                            Text(
                                text = restorentplace,
                                fontFamily = marcellusFont,
                                fontSize = 14.sp,
                                color = Color(0xFF525252),

                                )
                        }


                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterEnd),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(
                                text = price,
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Monospace,
                                color = Color(0xFF525252),
                            )


                            Text(
                                text = "Open now",
                                fontSize = 15.sp,
                                fontFamily = marcellusFont,
                                color = Color(0xFF525252)

                            )

                            Text(
                                text = distance,
                                fontSize = 12.sp,
                                fontFamily = marcellusFont,
                                color = Color(0xFF525252),
                                modifier = Modifier.padding(top = 5.dp)
                            )
                        }

                    }
                }
            }
        }



@Preview
@Composable
private fun kok() {
    foodcard(img = R.drawable.penne_pasta,
        dishname = "Penne Pasta",
        countryfood = "Italy",
        restorentplace = "Lashkar , Gwalior",
        price = "₹400",
        distance = "1.6Km",
        veg_nonveg = R.drawable.veg_icon
    )
}