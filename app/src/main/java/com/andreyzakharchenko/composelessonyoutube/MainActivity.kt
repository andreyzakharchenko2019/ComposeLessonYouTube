package com.andreyzakharchenko.composelessonyoutube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.andreyzakharchenko.composelessonyoutube.ui.theme.ComposeLessonYouTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxHeight(0.85f)
                        .fillMaxWidth(0.5f),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello")
                    Text(text = "Madrid")
                    Text(text = "Kaspa")
                }

                Column(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .fillMaxHeight(0.5f)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello")
                    Text(text = "Madrid")
                    Text(text = "Kaspa")
                }
            }
        }
    }
}