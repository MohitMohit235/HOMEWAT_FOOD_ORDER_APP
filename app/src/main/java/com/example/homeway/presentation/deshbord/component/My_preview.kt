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
        .fillMaxWidth()
        .height(174.dp)
        .padding(5.dp),
        shape = RoundedCornerShape(10.dp),
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.diwalibanner),
                contentDescription = "offers_preview_screen_card",
                contentScale = ContentScale.Crop)
            Box (
                modifier = Modifier
                    .padding(end = 50.dp)
                    .size(150.dp)
                    .align(Alignment.TopCenter)


            ){
                Image(
                    painter = painterResource(R.drawable.diwalilogo),
                    contentDescription = "diwali_logo"
                )
            }

            Box (
                modifier = Modifier
                    .align(Alignment.CenterEnd)


            ){
                Image(
                    painter = painterResource(R.drawable.fooditem),
                    contentDescription = "diwali_logo",
                    contentScale = ContentScale.Crop
                )
            }
        }
   }
}

