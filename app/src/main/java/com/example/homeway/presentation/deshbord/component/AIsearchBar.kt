package com.example.homeway.presentation.deshbord.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.NewLabel
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.outlined.MicNone
import androidx.compose.material.icons.outlined.RecordVoiceOver
import androidx.compose.material.icons.outlined.SavedSearch
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
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
fun AIsearch(modifier: Modifier = Modifier) {


    val jonefont = FontFamily(
        Font(R.font.lato_regular, FontWeight.Normal)
    )

    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF7B7B7B)) {

        Box(modifier = Modifier.fillMaxSize()
            .background(Color(0xFFFFFFFF)),
            contentAlignment = Alignment.TopCenter
        ){



            Row(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .fillMaxWidth()
                    .padding(top =  30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(110.dp)
            ){
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.padding(7.dp)
                    )
            }

        Column(
            modifier = Modifier.padding(top = 150.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Card(
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .align(Alignment.CenterHorizontally),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE3E5FC)),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {

                Row(
                    modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 15.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){

                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        tint = Color(0xFF3B3B3B),
                        )

                    Text(
                        text = "Ask anything about food",
                        color = Color.Black.copy(alpha = 0.5f),
                        fontFamily = jonefont,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.width(45.dp))

                    Icon(
                        imageVector = Icons.Outlined.MicNone,
                        contentDescription = null,
                        tint = Color(0xFF3B3B3B),
                    )

                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                    ){
                        Icon(
                            imageVector = Icons.Outlined.RecordVoiceOver,
                            contentDescription = null,
                            tint = Color(0xFF3B3B3B),
                            modifier = Modifier.padding(7.dp)
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .height(50.dp)
                    .width(350.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Icon(
                    imageVector = Icons.Default.NewLabel,
                    contentDescription = null,
                    tint = Color(0xFF3B3B3B),
                )

                Spacer(modifier = Modifier.width(20.dp))

                Icon(
                    imageVector = Icons.Outlined.SavedSearch,
                    contentDescription = null,
                    tint = Color(0xFF3B3B3B),
                )

                Spacer(modifier = Modifier.width(20.dp))
                
                Icon(
                    imageVector = Icons.Default.PhotoLibrary,
                    contentDescription = null,
                    tint = Color(0xFF3B3B3B),
                )

            }


        }
      }



    }
}


