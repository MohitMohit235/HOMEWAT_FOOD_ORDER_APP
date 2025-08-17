package com.example.homeway.presentation.deshbord.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R

@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun SearchBar() {

    val jonefont = FontFamily(
        Font(R.font.amethysta_regular, FontWeight.Normal)
    )

        Card(
            modifier = Modifier
            .width(400.dp)
            .height(40.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        )
        {
            Row(modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search bar",
                    tint = Color(0xFF000000).copy(alpha = 0.40f),
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = "Search Restorents and Foods",
                    color = Color.Black.copy(alpha = 0.40f),
                    fontSize = 16.sp,
                    fontFamily = jonefont
                )
            }
        }
    }
