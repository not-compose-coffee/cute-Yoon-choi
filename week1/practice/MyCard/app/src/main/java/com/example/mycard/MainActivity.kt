package com.example.mycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycard.ui.theme.MyCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCardTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyCardApp()
                }
            }
        }
    }
}

@Composable
fun MyCardApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyProfile()
        Column(
            modifier = Modifier.padding(top = 160.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Divider(color = Color.Black, thickness = 1.dp)
            MycardText(
                icon = painterResource(id = R.drawable.ic_phone_24), description = stringResource(
                    id = R.string.phone_num
                )
            )
            Divider(color = Color.Black, thickness = 1.dp)
            MycardText(
                icon = painterResource(id = R.drawable.ic_share_24), description = stringResource(
                    id = R.string.android_developer
                )
            )
            Divider(color = Color.Black, thickness = 1.dp)
            MycardText(
                icon = painterResource(id = R.drawable.ic_mail_24), description = stringResource(
                    id = R.string.my_email
                )
            )
        }
    }
}

@Composable
fun MyProfile() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_android),
            contentDescription = "android image",
            modifier = Modifier.size(160.dp)
        )
        Text(
            text = stringResource(id = R.string.my_name),
            fontSize = 50.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(id = R.string.android_developer),
            fontSize = 10.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MycardText(icon: Painter, description: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 5.dp)
    ) {
        Image(
            painter = icon,
            contentDescription = description,
        )
        Text(description, fontSize = 20.sp, modifier = modifier.padding(start = 30.dp))
    }
    Spacer(modifier = Modifier.padding(top = 10.dp))
//    Divider(color = Color.Black, thickness = 1.dp)
}

@Preview(showBackground = true)
@Composable
fun MyCardPreview() {
    MyCardTheme {
        MyCardApp()
    }
}