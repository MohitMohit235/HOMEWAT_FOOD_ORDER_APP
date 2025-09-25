package com.example.homeway

import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.homeway.presentation.deshbord.component.CallmainScreen
import kotlinx.coroutines.delay


private const val SplashTime: Long= 4000

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    Box (
        modifier = Modifier.background(Color(0xFF6471FF)),
        contentAlignment = Alignment.Center
    ){
        val currentTime by rememberUpdatedState(onTimeout)

        LaunchedEffect(Unit){
                delay(SplashTime)
                currentTime()}
    }


}

@Preview
@Composable
fun MyApp() {
    var showSplash by remember { mutableStateOf(true) }

    if (showSplash) {
       SplashScreen {
        showSplash = false
       }
    } else {
        CallmainScreen()

    }
}
