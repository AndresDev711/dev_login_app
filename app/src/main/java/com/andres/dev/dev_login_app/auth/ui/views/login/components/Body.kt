package com.andres.dev.dev_login_app.auth.ui.views.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.dev.dev_login_app.R

@Composable
fun BodyLogin(modifier: Modifier) {
  var email by rememberSaveable { mutableStateOf("") }
  var password by rememberSaveable {
    mutableStateOf("")
  }
  var isLoginEnabled by rememberSaveable {
    mutableStateOf(false)
  }
  Column(modifier = modifier) {
    LogoApp(modifier = Modifier.align(Alignment.CenterHorizontally))
    Spacer(modifier = Modifier.size(16.dp))
    Email(email = "", onTextChange = {})
    Spacer(modifier = Modifier.size(16.dp))
    Password(password = "", onTextChange = {})
    Spacer(modifier = Modifier.size(16.dp))
    Forgot(modifier = Modifier.align(Alignment.End))
    Spacer(modifier = Modifier.size(16.dp))
    ButtonLogin(isLoginEnabled)
  }
}

@Composable
fun LogoApp(modifier: Modifier) {
  Image(
    painter = painterResource(id = R.drawable.ic_login),
    contentDescription = "LogoApp",
    modifier = modifier
  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Email(email: String, onTextChange: (String) -> Unit) {
  TextField(value = email, onValueChange = { onTextChange(it) }, modifier = Modifier.fillMaxWidth())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password(password: String, onTextChange: (String) -> Unit) {
  TextField(
    value = password,
    onValueChange = { onTextChange(it) },
    modifier = Modifier.fillMaxWidth()
  )
}

@Composable
fun Forgot(modifier: Modifier) {
  Text(
    text = "FORGOT PASSWORD",
    fontSize = 12.sp,
    fontWeight = FontWeight.Bold,
    color = Color(0xFF4EA8E9),
    modifier = modifier
  )
}

@Composable
fun ButtonLogin(loginEnable: Boolean) {
  Button(onClick = { }, enabled = loginEnable, modifier = Modifier.fillMaxWidth()) {
    Text(text = "Log In")
  }
}