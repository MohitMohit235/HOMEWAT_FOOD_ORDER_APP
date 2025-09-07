package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.filled.LocalDining
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.Nightlife
import androidx.compose.material.icons.filled.Recommend
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.outlined.LocalOffer
import androidx.compose.material.icons.outlined.Timelapse
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.ui.draw.shadow

@Preview()
@Composable
fun FilterSectionPreview() {
    FilterSection()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterSection() {
    val filters = listOf(
        Triple(Icons.Default.FilterList, null, "Filters"),
        Triple(Icons.Outlined.LocalOffer, null, "Offers"),
        Triple(Icons.Outlined.Timelapse, null, "Schedule"),
        Triple(null, R.drawable.recommended22, "Recommended"),
        Triple(null, R.drawable.desserts, "Dessert"),
        Triple(null, R.drawable.veg_icon, "Veg"),
        Triple(null, R.drawable.nonveg_icon, "Non-veg"),
        Triple(null, R.drawable.delivery_bike, "Delivery"),
        Triple(null, R.drawable.dinner, "Dinner"),
        Triple(null, R.drawable.night_botel, "Nightlife"),

    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 10.dp)
    ) {
        items(filters.size) { index ->
            val (icon, imageRes, text) = filters[index]
            FilterCard(icon = icon,imageRes = imageRes, text = text)
        }
    }
}

@Composable
fun FilterCard(
    icon: ImageVector? = null,
    imageRes: Int? = null,
    text: String
) {
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .height(30.dp)
            .shadow(1.dp, RoundedCornerShape(8.dp), clip = false),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            when {
                icon != null -> {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        tint = Color(0x99000000),
                        modifier = Modifier.size(20.dp)
                    )
                }
                imageRes != null -> {
                    Image(
                        painter = painterResource(id = imageRes),
                        contentDescription = text,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = text,
                color = Color(0x99000000),
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
