package com.andres.dev.dev_login_app.auth.ui.views.login.components

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
    Email(email = email, onTextChange = {
      email = it
      isLoginEnabled = enableLogin(email, password)
    })
    Spacer(modifier = Modifier.size(16.dp))
    Password(password = password, onTextChange = {
      password = it
      isLoginEnabled = enableLogin(email, password)
    })
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
  TextField(
    value = email,
    onValueChange = { onTextChange(it) },
    modifier = Modifier.fillMaxWidth(),
    placeholder = { Text(text = "Email") },
    maxLines = 1,
    singleLine = true,
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
    colors = TextFieldDefaults.textFieldColors(
      textColor = Color(0xFFB2B2B2),
      containerColor = Color(0xFFFAFAFA),
      focusedIndicatorColor = Color.Transparent,
      unfocusedIndicatorColor = Color.Transparent
    )
  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password(password: String, onTextChange: (String) -> Unit) {
  var isVisibility by remember {
    mutableStateOf(false)
  }
  TextField(
    value = password,
    onValueChange = { onTextChange(it) },
    modifier = Modifier.fillMaxWidth(),
    placeholder = { Text(text = "Password") },
    maxLines = 1,
    singleLine = true,
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    colors = TextFieldDefaults.textFieldColors(
      textColor = Color(0xFFB2B2B2),
      containerColor = Color(0xFFFAFAFA),
      focusedIndicatorColor = Color.Transparent,
      unfocusedIndicatorColor = Color.Transparent
    ),
    trailingIcon = {
      val image = if (isVisibility) Icons.Filled.VisibilityOff else Icons.Filled.Visibility
      IconButton(
        onClick = { if (password.isNotEmpty()) isVisibility = !isVisibility }
      ) {
        Icon(imageVector = image, contentDescription = "show password")
      }
    },
    visualTransformation = if (isVisibility) VisualTransformation.None else PasswordVisualTransformation()
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
  Button(
    onClick = { },
    enabled = loginEnable,
    modifier = Modifier.fillMaxWidth(),
    colors = ButtonDefaults.buttonColors(
      containerColor = Color(0xFF4EABE9),
      contentColor = Color.White,
      disabledContainerColor = Color(0xFF78C8F9),
      disabledContentColor = Color.White
    )
  ) {
    Text(text = "Log In")
  }
}

fun enableLogin(email: String, password: String) =
  Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6