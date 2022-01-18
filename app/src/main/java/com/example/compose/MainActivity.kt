package com.example.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .background(Color(0xFFF2F2F2))
                    .fillMaxSize()
            ) {
                Image(
                    painterResource(
                        R.drawable
                            .happy_meal
                    ),
                    "",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop

                )

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy meal",
                            style = TextStyle(
                                fontSize = 26.sp,
                                fontFamily = FontFamily.SansSerif,
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                        Text(
                            text = "$5.99",
                            style = TextStyle(
                                color = Color(0xff85bb65),
                                fontSize = 18.sp,
                                fontFamily = FontFamily.SansSerif,
                            )
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = FontFamily.SansSerif,
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Order Now")
                    }
                }
            }
        }
    }
}
