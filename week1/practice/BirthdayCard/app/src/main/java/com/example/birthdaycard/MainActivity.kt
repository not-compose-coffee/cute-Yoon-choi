package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGerrtubgWithImage(message = "Happy", from = "yoon")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(modifier: Modifier = Modifier, message: String, from: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        modifier.fillMaxSize()
        Text(text = message, fontSize = 36.sp, modifier = Modifier.padding(16.dp))
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 16.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        )

    }
}

@Composable
fun BirthdayGerrtubgWithImage(
    message: String,
    from: String,
//    modifier: Modifier
) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
    }
    BirthdayGreetingWithText(message = message, from = from)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardTheme {
        BirthdayGerrtubgWithImage(
            stringResource(R.string.happy_birthday_text),
            stringResource(R.string.signature_text)
        )
    }
}
