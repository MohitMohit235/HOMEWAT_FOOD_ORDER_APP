package com.example.homeway.presentation.deshbord.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import kotlin.math.roundToInt

@Preview
@Composable
fun SliderMinimalExample() {
    val jonefont = FontFamily(
        Font(R.font.amethysta_regular, FontWeight.Normal)
    )
    var sliderPosition by remember { mutableStateOf(0) }
    val values = listOf(1.0f, 2.5f, 3.5f, 4.5f, "Any")

    Column(modifier = Modifier.padding(20.dp)) {

        Text(
            text = "Rating: ${values[sliderPosition]}",
            style = MaterialTheme.typography.caption,
            fontFamily = jonefont,
            color = Color.Black.copy(alpha = 0.70f),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Slider(
            modifier = Modifier.width(350.dp),
            value = sliderPosition.toFloat(),
            onValueChange = { index -> sliderPosition = index.roundToInt() },

            valueRange = 0f..(values.size - 1).toFloat(),
            colors = SliderDefaults.colors(
                thumbColor = Color(0xFF6471FF),
                activeTrackColor = Color(0xFF6471FF),
                inactiveTrackColor = Color(0xFF626161).copy(alpha = 0.50f),

                )
        )
    }
}



@Preview
@Composable
fun SliderAdvancedExample12() {
    val jonefont =FontFamily(
        Font(R.font.amethysta_regular, FontWeight.Normal))
    var sliderPosition by remember { mutableIntStateOf(0) } // Int value

    Column (modifier = Modifier.padding(20.dp)){

        Text(text = "Cost for two",
            fontFamily =jonefont,
            fontSize = 15.sp, modifier = Modifier
                .align(Alignment.CenterHorizontally) )

        Spacer(modifier = Modifier.height(10.dp))


        Text(text = "₹0 - ₹$sliderPosition",
            fontFamily =jonefont,
            color = Color(0xFF626161),
            modifier = Modifier
                .padding(start = 80.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))


        Slider(
            value = sliderPosition.toFloat(),
            onValueChange = { sliderPosition = it.toInt() },
            colors = SliderDefaults.colors(
                thumbColor =Color(0xFF6471FF),
                activeTrackColor = Color(0xFF6471FF),
                inactiveTrackColor = Color(0xFF626161).copy(alpha = 0.40f),
            ),
            steps = 0,
            valueRange = 0f..2000f // Range 0 se 2000
        )
    }
}
