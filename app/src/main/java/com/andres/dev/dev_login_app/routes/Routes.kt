package com.andres.dev.dev_login_app.routes

sealed class Routes(val route: String) {
  object SplashScreen : Routes("splash_screen")
  object LoginScreen : Routes("login_screen")
  object FirstScreen : Routes("first_screen")
}