package com.example.e1p1

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e1p1.ui.theme.E1P1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            E1P1Theme {
                Resume()

            }
        }
    }
}

@Composable
fun Resume(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.screenshot_2025_08_03_122029),
            contentDescription ="profile picture",
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp))
        Text(text = "MY REGISTRATION NUMBER IS: 2301020487",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom=10.dp,start= 30.dp)
                .align(alignment = Alignment.Start)
        )
        Text(text = "MY OFFICIAL NAME IS: ADITYA PRAKASH",
                fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom=10.dp,start= 30.dp)
                .align(alignment = Alignment.Start))

    }
}

@Preview(showBackground = true)
@Composable
fun ResumePreview(){
    E1P1Theme {
        Resume()
    }
}

