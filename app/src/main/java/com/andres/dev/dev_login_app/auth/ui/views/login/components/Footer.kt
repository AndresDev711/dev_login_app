package com.andres.dev.dev_login_app.auth.ui.views.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FooterLogin(modifier: Modifier) {
  Column(modifier = modifier.fillMaxWidth()) {
    Divider(
      Modifier
        .background(Color(0xFF2196F3))
        .height(1.dp)
        .fillMaxWidth()
    )
    Spacer(modifier = Modifier.size(16.dp))
    SignUp()
  }
}

@Composable
fun SignUp() {
  Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
    Text(text = "Don't have a account", fontSize = 12.sp)
    Text(
      text = "Sign up",
      Modifier.padding(horizontal = 8.dp),
      fontSize = 13.sp,
      fontWeight = FontWeight.Bold,
      color = Color(0xFF2196F3)
    )
  }
}