package com.example.homeway.presentation.deshbord.component

import android.media.Image
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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


@Composable
fun CustomizeFoodScreen(image : Int, Dishname : String, Price: Int) {

    val cardfont = FontFamily(
        Font(R.font.opensans_regular, FontWeight.Normal)
    )

    var checkbox by remember { mutableStateOf(false) }

    Surface{
        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row (
                modifier = Modifier.fillMaxWidth().padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ){
                Box(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .clip(CircleShape)
                ){
                    Image(
                        painter = painterResource(id = image),
                        contentDescription = "Addition food",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()

                    )}

                Column (
                    modifier = Modifier
                        .width(280.dp)
                        .height(50.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(
                        text = Dishname,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily =cardfont,
                        color = Color.Black.copy(alpha = 0.6f)
                    )

                    Text(
                        text ="₹${Price}",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily =cardfont,
                        color = Color.Black.copy(alpha = 0.6f)
                    )
                }

                Checkbox(
                    checked = checkbox,
                    onCheckedChange = { checkbox = it }
                )

            }
        }




        }
    }
}

@Preview
@Composable
private fun cus() {
    CustomizeFoodScreen(
    image =R.drawable.jirarice,
        Dishname = "jira rice",
        Price = 140
    )
}