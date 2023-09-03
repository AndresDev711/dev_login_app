package com.andres.dev.dev_login_app.boarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andres.dev.dev_login_app.R
import com.andres.dev.dev_login_app.ui.theme.BottomCardShape
import com.andres.dev.dev_login_app.ui.theme.colorBlue
import com.andres.dev.dev_login_app.ui.theme.colorGreen
import com.andres.dev.dev_login_app.ui.theme.colorRed
import com.andres.dev.dev_login_app.ui.theme.colorYellow
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Composable
fun FirstScreen() {
  Box(modifier = Modifier.fillMaxSize()) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Top,
      modifier = Modifier.background(colorYellow)
    ) {
      Image(
        painter = painterResource(id = R.drawable.food), contentDescription = "Image Boarding"
      )
      Box() {
        Card(
          colors = CardDefaults.cardColors(containerColor = colorRed),
          modifier = Modifier.fillMaxSize(),
          elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
          shape = BottomCardShape.large
        ) {
          Box() {
            Column(
              horizontalAlignment = Alignment.CenterHorizontally
            ) {
              Text(
                text = "TITLE",
                modifier = Modifier
                  .fillMaxWidth()
                  .padding(top = 20.dp, end = 30.dp),
//                            color = Color(0xFF292D32),
                color = colorBlue,
                textAlign = TextAlign.Right,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
              )

              Text(
                text = "DESCRIPCTION",
                modifier = Modifier.padding(top = 20.dp, start = 40.dp, end = 20.dp),
                color = Color.Gray,
                fontSize = 17.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraLight
              )

            }
            Box(
              modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(30.dp)
            ) {
              Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
              ) {


                TextButton(onClick = {
                  //skip
                }) {
                  Text(
                    text = "Skip Now",
                    color = Color(0xFF292D32),
                    textAlign = TextAlign.Right,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                  )
                }

                OutlinedButton(
                  onClick = {},
                  border = BorderStroke(
                    14.dp, colorGreen
                  ),
                  shape = RoundedCornerShape(50), // = 50% percent
                  //or shape = CircleShape
                  colors = ButtonDefaults.outlinedButtonColors(contentColor = colorYellow),
                  modifier = Modifier.size(65.dp)
                ) {
                  Icon(
                    painter = painterResource(id = R.drawable.ic_login),
                    contentDescription = "",
                    tint = colorYellow,
                    modifier = Modifier.size(20.dp)
                  )
                }
//              Button(
//                onClick = {
//                },
//                modifier = Modifier.fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(
//                  backgroundColor = item[pagerState.currentPage].mainColor
//                ),
//                contentPadding = PaddingValues(vertical = 12.dp),
//                elevation = ButtonDefaults.elevation(
//                  defaultElevation = 0.dp
//                )
//              ) {
//                Text(
//                  text = "Get Started",
//                  color = Color.White,
//                  fontSize = 16.sp
//                )
//              }
              }
            }
          }
        }

      }
    }
  }

}