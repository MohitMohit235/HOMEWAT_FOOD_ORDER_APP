package com.example.homeway


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homeway.presentation.deshbord.component.AIsearch
import com.example.homeway.presentation.deshbord.component.BlackFilterScreen
import com.example.homeway.presentation.deshbord.component.CallmainScreen
import com.example.homeway.presentation.deshbord.component.CartScreen
import com.example.homeway.presentation.deshbord.component.FoodScreen
import com.example.homeway.presentation.deshbord.component.SEE_ALL
import com.example.homeway.presentation.deshbord.component.checkout
import java.nio.file.WatchEvent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



     Surface (modifier = Modifier.fillMaxSize()){
         var selectedTab by remember { mutableStateOf(0) }
         val categories = listOf(
             "Overview", "Online","Review","Menu",

             )

            //AIsearch()

         //BlackFilterScreen()

      //CallmainScreen()

      //   CartScreen()

       //  SEE_ALL()

       //  checkout()

      //  FourColumnsFoodCategory()

         FoodScreen(categories = categories,
             selectedTabIndex = selectedTab,
             onTabSelected = { selectedTab = it }, time = "30-60 min 3km")

      }
    }
  }
}



@Composable
 fun FoodOdringCard(DishName: String, Discription: String, Price: String, img: Int,veg: Int) {

    val jonefont = FontFamily(
        Font(R.font.mergeone_regular, FontWeight.Normal)
    )
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(380.dp)
            .background(Color.White)
    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Box(
                modifier = Modifier
                    .height(140.dp)
                    .width(160.dp)
                    .padding(start = 5.dp, bottom = 20.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "food image",
                    contentScale = ContentScale.FillBounds)
            }

            Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                horizontalAlignment = Alignment.Start
            ){

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Image(
                        painter = painterResource(id = veg),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 10.dp)

                    )

                }


                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = DishName,
                        fontFamily = jonefont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.8f)
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "₹$Price",
                        fontFamily = jonefont,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.8f)
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text =Discription,
                    fontFamily =jonefont,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black.copy(alpha = 0.5f),
                    modifier = Modifier
                        .padding(end = 5.dp)
                )
            }

        }
    }
}









@Preview
@Composable
private fun ppp() {
    FoodOdringCard(
        veg = R.drawable.circal_veg,
        img = R.drawable.chole_bhature,
        DishName = "Chole Bhature",
        Price = "240",
        Discription = "Famous chole bhature."
    )
}