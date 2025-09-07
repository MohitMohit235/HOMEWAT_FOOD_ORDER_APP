package com.example.homeway.presentation.deshbord.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.MicNone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
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

@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun SearchBar() {

    val jonefont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )

    Row (
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Card(
            modifier = Modifier
                .width(270.dp)
                .height(45.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.width(15.dp))

                Text(
                    text = "Restorents name or d...",
                    color = Color.Black.copy(alpha = 0.40f),
                    fontSize = 16.sp,
                    fontFamily = jonefont
                )

                Spacer(modifier = Modifier.width(10.dp))
                VerticalDivider(thickness = 0.8.dp, modifier = Modifier)

                Spacer(modifier = Modifier.width(5.dp))
                Icon(
                    imageVector = Icons.Outlined.MicNone,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

            }
        }

        Box(
            modifier = Modifier
                .size(45.dp)
        ){
            SmallFloatingActionButton(
                onClick = {},
                containerColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ){
                Text(
                    text = "AI",
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    fontFamily = jonefont
                )
            }
        }

    }
 }
