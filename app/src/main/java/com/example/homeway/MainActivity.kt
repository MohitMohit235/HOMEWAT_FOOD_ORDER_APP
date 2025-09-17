package com.example.homeway


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.homeway.presentation.deshbord.component.CallmainScreen


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

      CallmainScreen()

      //   CartScreen()



       //  checkout()

      //  FourColumnsFoodCategory()

//         FoodScreen(categories = categories,
//             selectedTabIndex = selectedTab,
//             onTabSelected = { selectedTab = it }, time = "30-60 min 3km")

      }
    }
  }
}


