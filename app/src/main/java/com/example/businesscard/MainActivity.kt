package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.material3.Icon as Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardConstruct(
                        "Fabricio Alves Macali",
                        "Android developer",
                        "+55 54 999535279",
                        "https://www.linkedin.com/in/fabricio-alves-macali-561516259/",
                        "frcalvesmacali@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardConstruct(name: String, office: String, phoneNumber: String, socialMedia: String,
                            mail: String){
    val image = painterResource(id = R.drawable.android_logo)
    val iconPhone = painterResource(id = R.drawable.baseline_phone_24)
    val iconSocialMedia = painterResource(id = R.drawable.baseline_share_24)
    val iconMail = painterResource(id = R.drawable.baseline_email_24)
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Row(modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()) {
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
                Row {
                    Image(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier.height(150.dp)
                    )
                }
                Row {
                    Text(
                        text = name,
                        color = Color(0xff3DDC84),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row {
                    Text(
                        text = office,
                        color = Color(0xff3DDC84),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        Row{
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxSize()) {
                Row {
                    Icon(
                        painter = iconPhone,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.height(14.dp)
                    )
                    Text(
                        text = phoneNumber,
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
                Row(modifier = Modifier.padding(all = 8.dp)) {
                    Icon(
                        painter = iconMail,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.height(14.dp)
                    )
                    Text(
                        text = mail,
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
                Row(modifier = Modifier.padding(all = 8.dp)) {
                    Icon(
                        painter = iconSocialMedia,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.height(14.dp)
                    )
                    Text(
                        text = socialMedia,
                        color = Color.White,
                        fontSize = 11.sp
                    )

                }
            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardConstruct(
            "Fabricio Alves Macali",
            "Android developer",
            "+55 54 999535279",
            "https://www.linkedin.com/in/fabricio-alves-macali-561516259/",
            "frcalvesmacali@gmail.com"
        )
    }
}