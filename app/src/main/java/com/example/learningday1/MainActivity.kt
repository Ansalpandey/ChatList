package com.example.learningday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningday1.ui.theme.LearningDay1Theme
import com.example.learningday1.ui.theme.Purple40

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      LearningDay1Theme {
        // A surface container using the 'background' color from the theme
        Column {
          //
          Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
              //
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
              MessageCard("Ansal Pandey", "Rohit Sharma is a very good batsman", R.drawable.profile)
              MessageCard("Hardik Pandya", "I am in the hospital", R.drawable.hardik)
              MessageCard("Virat Kohli", "I was not able to make runs", R.drawable.virat)
              MessageCard(
                  "Shubman Gill",
                  "I played amazing innings, but not in the final",
                  R.drawable.shubman_gill)
            }
          }
        }
      }
    }
  }
}

@Composable
fun MessageCard(headline: String, message: String, image: Int) {
  // Add padding around our message
  Row(modifier = Modifier.padding(all = 8.dp)) {
    Image(
        painter = painterResource(image),
        contentDescription = "Contact profile picture",
        modifier =
            Modifier
                // Set image size to 40 dp
                .size(70.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
                .border(2.5.dp, Purple40, CircleShape))

    // Add a horizontal space between the image and the column
    Spacer(modifier = Modifier.width(8.dp))

    Column {
      Text(text = headline, color = White, fontWeight = FontWeight.Bold)
      // Add a vertical space between the author and message texts
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = message, color = Color.Gray)
    }
  }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview() {
  LearningDay1Theme {
    val headline: String = ""
    val message: String = ""
    val image: Int = 0
    MessageCard(headline, message, image)
  }
}
