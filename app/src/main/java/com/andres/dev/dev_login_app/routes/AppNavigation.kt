package com.andres.dev.dev_login_app.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andres.dev.dev_login_app.auth.ui.views.login.LoginScreen
import com.andres.dev.dev_login_app.boarding.FirstScreen
import com.andres.dev.dev_login_app.splash.SplashScreen

@Composable
fun AppNavigation() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = Routes.SplashScreen.route,
  ) {
    composable(Routes.SplashScreen.route) { SplashScreen(navController) }
    composable(Routes.LoginScreen.route) { LoginScreen() }
    composable(Routes.FirstScreen.route) { FirstScreen() }
  }
}