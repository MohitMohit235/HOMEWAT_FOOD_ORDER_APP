package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
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
fun SEE_ALL() {

    val jonefont = FontFamily(
        Font(R.font.marcellus_regular, FontWeight.Normal)
    )

    Surface(modifier = Modifier.fillMaxSize()) {


                Box(
                    modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White)

                ) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .drawBehind{
                            val shadowHeight = 1.5.dp.toPx()
                            drawRect(
                                color = Color.Black.copy(alpha = 0.30f),
                                topLeft = Offset(0f, size.height - shadowHeight),
                                size = Size(width = size.width, height = shadowHeight))},
                                 verticalAlignment = Alignment.CenterVertically
                             ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .weight(1f)

                        ) {
                            Text(text = "Categories",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily =jonefont,
                                modifier = Modifier
                                    .padding(start = 28.dp))

                            Spacer(modifier = Modifier.width(5.dp))

                            Text(text = "More food",
                                fontSize = 10.sp,
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        IconButton(onClick = {  },modifier = Modifier.size(40.dp)
                        ) {
                            Icon(Icons.Default.Close,
                                contentDescription = "Close")}}



                    Column(
                        modifier = Modifier.width(380.dp).padding(top = 80.dp, start = 10.dp),
                        verticalArrangement = Arrangement.spacedBy(20.dp),
                        horizontalAlignment = Alignment.Start) {

                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )

                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )
                        MY_foodCategory(
                            img = R.drawable.penne_pasta,
                            title = "Penne Pizza",
                            Discription = "Chole Bhature is a famous North Indian dish consisting."
                        )

                        }
                    }
                }
            }




