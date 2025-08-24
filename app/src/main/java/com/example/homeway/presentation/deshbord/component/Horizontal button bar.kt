package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.LocalDining
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.Nightlife
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R

@Preview
@Composable
fun myapp(){

    val marcellusFont =FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal))
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        contentAlignment = Alignment.Center


    ){
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .width(IntrinsicSize.Min)
                .height(28.dp)
                .padding(start = 5.dp,end = 17.dp),
            verticalAlignment = Alignment.CenterVertically
        ){

            //======================first card button========================

            val borderWidth = 300.dp
            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .clickable{}
                    .width(76.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(10.dp)
            ){
                Row(
                    modifier = Modifier
                        .width(66.dp)
                        .height(27.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.FilterList,
                        contentDescription = "Location",
                        tint = Color(0xFF808080),
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 8.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Filters",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))

            //======================second card button========================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(76.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(10.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.LocalOffer,
                        contentDescription = "Location",
                        tint = Color(0xFF808080),
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 8.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Offers",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //======================third card button========================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(76.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.desserts),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 8.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Dessert",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //======================four card button========================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(60.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.veg_icon),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 6.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(start = 1.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Veg",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.padding(start = 4.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //=====================================five card button=====================================


            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(86.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.nonveg_icon),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 6.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Non-veg",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //===============================six card button============================================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(75.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Icon(
                        imageVector = Icons.Default.LocalDining,
                        contentDescription = "Location",
                        tint = Color(0xFF808080),
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 6.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Dining",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //=============================seven card button===================================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(84.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.delivery_bike),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 6.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Delivery",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
//============================eight card button==============================

            OutlinedCard(
                border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                modifier = Modifier
                    .width(86.dp)
                    .height(30.dp)
                    .align(Alignment.CenterVertically),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Icon(
                        imageVector = Icons.Default.Nightlife,
                        contentDescription = "Location",
                        tint = Color(0xFF808080),
                        modifier = Modifier
                            .size(18.dp)
                            .align(Alignment.CenterVertically)
                            .padding(start = 6.dp)
                    )
                    Box(
                        modifier = Modifier
                            .weight(0.5f)
                            .fillMaxHeight()
                            .padding(5.dp),
                        contentAlignment = Alignment.CenterStart
                    ){
                        Text(
                            text = "Nightlife",
                            color = Color(0xFF808080),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = marcellusFont,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }


        }
    }
}
