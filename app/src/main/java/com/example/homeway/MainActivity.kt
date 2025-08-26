package com.example.homeway


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.homeway.presentation.deshbord.component.AIsearch
import com.example.homeway.presentation.deshbord.component.BlackFilterScreen
import com.example.homeway.presentation.deshbord.component.CallmainScreen
import com.example.homeway.presentation.deshbord.component.CartScreen
import com.example.homeway.presentation.deshbord.component.SEE_ALL
import com.example.homeway.presentation.deshbord.component.checkout


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



     Surface (modifier = Modifier.fillMaxSize()){

            //AIsearch()

         //BlackFilterScreen()

    //  CallmainScreen()

      //   CartScreen()

         SEE_ALL()

       //  checkout()

      //  FourColumnsFoodCategory()

      }
    }
  }
}





