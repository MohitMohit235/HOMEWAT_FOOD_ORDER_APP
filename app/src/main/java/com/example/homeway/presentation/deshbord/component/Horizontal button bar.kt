package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.LocalDining
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.Nightlife
import androidx.compose.material.icons.filled.Recommend
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.outlined.LocalOffer
import androidx.compose.material.icons.outlined.Timelapse
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.ui.draw.shadow
import java.util.Locale.filter

@Preview()
@Composable
fun FilterSectionPreview() {
    Box(
        modifier = Modifier

            .background(Color.White)
    ) {
        FilterSection()
    }
}

data class FilterItem(
    val leadingIcon: ImageVector? = null,
    val text: String,
    val trailingIcon: ImageVector? = null
)


@Composable
fun FilterSection() {
    val filters = listOf(
        FilterItem(leadingIcon = Icons.Default.FilterList, text = "Filters", trailingIcon = Icons.Default.ArrowDropDown),
        FilterItem(text = "Schedule", trailingIcon = Icons.Default.ArrowDropDown),
        FilterItem(text = "Under 30 mins"),
        FilterItem(text = "Under₹150"),
        FilterItem(text = "Rating 4.0+"),
        FilterItem(text = "Pure Veg"),
        FilterItem(text = "Dessert")
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 5.dp, vertical = 5.dp)
    ) {
        items(filters) { filter ->
            FilterCard(
                leadingIcon = filter.leadingIcon,
                text = filter.text,
                trailingIcon = filter.trailingIcon
            )
        }
    }
}

@Composable
fun FilterCard(
    leadingIcon: ImageVector? = null,
    text: String,
    trailingIcon: ImageVector? = null
) {
    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Card(
        modifier = Modifier
            .border(
                BorderStroke(width = 1.dp, color = Color.Gray.copy(alpha = 0.3f)),
                shape = RoundedCornerShape(8.dp)
            )
            .shadow(1.dp, RoundedCornerShape(8.dp), clip = false),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            leadingIcon?.let {
                Icon(
                    imageVector = it,
                    contentDescription = text,
                    tint = Color(0xFF000000),
                    modifier = Modifier.size(12.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
            }


            Text(
                text = text,
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = jonefont,
                fontWeight = FontWeight.Normal
            )


            trailingIcon?.let {
                Spacer(modifier = Modifier.width(5.dp))
                Icon(
                    imageVector = it,
                    contentDescription = text,
                    tint = Color(0xFF000000),
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}
