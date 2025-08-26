package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R





@Preview
@Composable
fun checkout() {

    val jonefont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )
    val radioOptions = listOf("Credit Card", "PayPal", "Google Pay", "Apple","Cash on Delivery")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF)),
            contentAlignment = Alignment.TopCenter,

            ) {

            Column(
                modifier = Modifier
                    .width(370.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Box(
                    modifier = Modifier
                        .width(370.dp)
                        .height(85.dp)
                        .padding(top = 40.dp)

                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp)
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(70.dp)
                    ){


                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.Black.copy(alpha = 0.7f),
                            modifier = Modifier.size(30.dp)
                        )



                        Text(
                            text = "Check Out",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = jonefont,
                            color = Color.Black.copy(alpha = 0.7f)
                        )

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape),
                            contentAlignment = Alignment.Center
                        ){
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                tint = Color.Black.copy(alpha = 0.7f),
                                modifier = Modifier.size(30.dp)
                            )
                        }

                    }
                }


                LazyColumn (
                    modifier = Modifier
                        .height(480.dp)
                        .width(400.dp)
                ){
                    item(1){

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(290.dp),
                            contentAlignment = Alignment.Center
                        ){
                            AddressSelectionCard()
                        }

                        Column (
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(380.dp)
                                .padding(5.dp)
                        ){
                            Text(
                                text = "Payment Method",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = jonefont
                            )

                            MyScreen()

                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ){
                Checktotal()
            }



        }
    }
}

