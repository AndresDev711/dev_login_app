package com.andres.dev.dev_login_app.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.andres.dev.dev_login_app.R
import com.andres.dev.dev_login_app.routes.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

  LaunchedEffect(key1 = true) {
    delay(3000)
    navController.popBackStack()
//        navController.navigate(Routes.LoginScreen.route)
    navController.navigate(Routes.LoginScreen.route)

  }
  Splash()
}

@Composable
fun Splash() {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {

    Image(
      painter = painterResource(id = R.drawable.ic_login),
      contentDescription = "Logo Splash",
      Modifier.size(140.dp, 150.dp)
    )

    Text(text = "BIENVENIDOS", fontSize = 30.sp, fontWeight = FontWeight.Bold)

  }
}