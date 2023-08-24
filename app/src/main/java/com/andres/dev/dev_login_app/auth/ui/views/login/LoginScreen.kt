package com.andres.dev.dev_login_app.auth.ui.views.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.andres.dev.dev_login_app.auth.ui.views.login.components.BodyLogin
import com.andres.dev.dev_login_app.auth.ui.views.login.components.FooterLogin
import com.andres.dev.dev_login_app.auth.ui.views.login.components.HeaderLogin

@Composable
fun LoginScreen() {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .padding(8.dp)
  ) {
    HeaderLogin(Modifier.align(Alignment.TopEnd))
    BodyLogin(Modifier.align(Alignment.Center))
    FooterLogin(Modifier.align(Alignment.BottomCenter))
  }
}

