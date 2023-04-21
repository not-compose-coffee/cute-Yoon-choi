package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(modifier: Modifier = Modifier, message: String, from: String) {
    Column(modifier = Modifier) {
        Text(text = message)
        Text(text = from, fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Sam!", from = "from yoonjung")
    }
}