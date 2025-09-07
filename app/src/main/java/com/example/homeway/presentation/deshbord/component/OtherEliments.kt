package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Surface
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.outlined.LocalOffer
import androidx.compose.material.icons.outlined.MicNone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Timelapse
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.R


@Composable
fun DashedDivider(
    color: Color = Color.Gray,
    thickness: Dp = 1.dp,
    dashWidth: Dp = 10.dp,
    dashGap: Dp = 5.dp,
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .width(352.dp)
            .height(thickness)
    ) {
        drawLine(
            color = color,
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = thickness.toPx(),
            pathEffect = PathEffect.dashPathEffect(
                floatArrayOf(dashWidth.toPx(), dashGap.toPx()), 0f
            )
        )
    }
}


@Composable
fun MyScreen() {

    val options = listOf("Credit Card","Paypal","Google Pay", "Apple pay",  "COD(Cash On Delivery)")


    var selectedOption by remember { mutableStateOf(options[0]) }


    ImageRadioList(
        radioOptions = options,
        selectedOption = selectedOption,
        onOptionSelected = { selectedOption = it }
    )
}


@Composable
fun ImageRadioList(
    radioOptions: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {

    val cardfont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )


    val imageMap = mapOf(
        "Credit Card" to R.drawable.img1111110,
        "Paypal" to R.drawable.img4000000,
        "Google Pay" to R.drawable.img600000,
        "Apple pay" to R.drawable.img3000000,
        "COD(Cash On Delivery)" to R.drawable.img50000000
    )

    Column(modifier = Modifier.height(250.dp)) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = imageMap[text] ?: R.drawable.ic_launcher_foreground),
                    contentDescription = text,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 8.dp)
                )


                Text(
                    text = text,
                    fontFamily = cardfont,
                    fontSize = 15.sp,
                    color = Color.Black.copy(alpha = 0.50f),
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 12.dp)
                )

                // RADIO BUTTON
                androidx.compose.material3.RadioButton(
                    selected = (text == selectedOption),
                    onClick = null,
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color(0xFF6471FF),
                        unselectedColor = Color.Gray,
                        disabledSelectedColor = Color.LightGray,
                        disabledUnselectedColor = Color.DarkGray,
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun MORE_EXPLORE(){

    Box(
        modifier = Modifier
            .height(125.dp)
            .fillMaxWidth()

    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 5.dp)
        ){
            Text(
                text = "EXPLORE MORE",
                color = Color.Black.copy(alpha = 0.6f),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                letterSpacing = 2.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 6.dp)
            )

            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .width(IntrinsicSize.Min)
                    .height(130.dp)
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {

              MoreCard(imag = R.drawable.imgofffffer, Text = "Offers")
                MoreCard(imag = R.drawable.train_img, Text = "Train")
                MoreCard(imag = R.drawable.lunch, Text = "Lunch")
                MoreCard(imag = R.drawable.tiffin, Text = "Tiffin Box")
                MoreCard(imag = R.drawable.heath, Text = "Health")
                MoreCard(imag = R.drawable.collection, Text = "Collection")

            }
        }
   }
}

@Composable
fun MoreCard(imag : Int, Text : String) {
    Card(
        modifier = Modifier
            .width(70.dp)
            .height(70.dp)
            .shadow(1.dp, shape = RoundedCornerShape(8.dp), clip = false),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(5.dp)
    ){
        Image(
            painter = painterResource(id = imag),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp)
        )
        Text(
            text =Text,
            fontFamily = FontFamily.SansSerif,
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 1.sp,
            color = Color.Black.copy(alpha = 0.6f),
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 5.dp)
        )

    }
}



//@Preview
@Composable
fun NormalSearchBar() {

    val jonefont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )

    Row (
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ){
        Card(
            modifier = Modifier
                .width(340.dp)
                .height(45.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        )
        {
            Row(
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "search bar",
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.width(15.dp))

                androidx.compose.material.Text(
                    text = "Restorents name or dish",
                    color = Color.Black.copy(alpha = 0.40f),
                    fontSize = 16.sp,
                    fontFamily = jonefont
                )

                Spacer(modifier = Modifier.width(70.dp))
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
    }
}




@Preview
@Composable
fun NormalFilterSection() {
    val filters = listOf(
        Triple(Icons.Default.FilterList, null, "Filters"),
        Triple(Icons.Outlined.LocalOffer, null, "Offers"),
        Triple(Icons.Outlined.Timelapse, null, "Schedule"),
        Triple(null, R.drawable.recommended22, "Recommended"),
//        Triple(null, R.drawable.desserts, "Dessert"),
//        Triple(null, R.drawable.veg_icon, "Veg"),
//        Triple(null, R.drawable.nonveg_icon, "Non-veg"),
//        Triple(null, R.drawable.delivery_bike, "Delivery"),
//        Triple(null, R.drawable.dinner, "Dinner"),
//        Triple(null, R.drawable.night_botel, "Nightlife"),

        )

    LazyRow(
        modifier = Modifier
            .width(350.dp)
            .height(50.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 5.dp ,vertical = 10.dp)
    ) {
        items(filters.size) { index ->
            val (icon, imageRes, text) = filters[index]
            FilterCard(icon = icon,imageRes = imageRes, text = text)
        }
    }
}

@Composable
fun NOrmalFilterCard(
    icon: ImageVector? = null,
    imageRes: Int? = null,
    text: String
) {
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .height(30.dp)
            .shadow(5.dp, RoundedCornerShape(8.dp), clip = false),
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



//            Box(
//                modifier = Modifier
//                    .fillMaxHeight()
//                    .fillMaxWidth(),
//                contentAlignment = Alignment.Center
//            ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier.padding(2.dp)
//                ) {
//
//
//                    Box(
//                        modifier = Modifier
//                            .size(28.dp)
//                            .clickable { count++ },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Icon(
//                            Icons.Default.ArrowDropUp,
//                            contentDescription = "Increase",
//                            modifier = Modifier.size(50.dp)
//                        )
//                    }
//
//
//                    Text(
//                        text = "$count item",
//                        fontSize = 15.sp,
//                        modifier = Modifier.padding(vertical = 2.dp),
//                        fontFamily = cardfont,
//                        color = Color.Black.copy(alpha = 0.7f)
//                    )
//
//
//                    Box(
//                        modifier = Modifier
//                            .size(28.dp)
//                            .clickable { if (count > 0) count-- },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Icon(
//                            Icons.Default.ArrowDropDown,
//                            contentDescription = "Decrease",
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
//                }
//            }
//
