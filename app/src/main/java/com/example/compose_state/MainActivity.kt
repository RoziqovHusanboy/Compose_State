package com.example.compose_state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_state.ui.theme.Compose_StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Headerr()
        }
    }
}

@Composable
fun Headerr() {

    var number by remember {
        mutableStateOf(1)
    }

     when (number) {

         1 -> {
                    Box(modifier = Modifier.fillMaxSize()) {

                        Card(
                            modifier = Modifier
                                .width(500.dp)
                                .height(600.dp)
                                .padding(20.dp),
                            elevation = 6.dp

                        ) {
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(30.dp)) {
                                Image(painter = painterResource(id = R.drawable.food1),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(500.dp)
                                        .width(500.dp),
                                    contentScale = ContentScale.Crop)
                            }
                        }
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 590.dp)) {

                            Card(modifier = Modifier
                                .width(500.dp)
                                .height(130.dp)
                                .padding(start = 20.dp, end = 20.dp, top = 0.dp),
                                elevation = 6.dp
                                ) {
                                Column(modifier = Modifier.padding(20.dp)) {
                                    Text(text = "Still Life of Blue Rose and Other Flowers",
                                        fontSize = 25.sp)
                                    Text(text = "Owen Scott(2021)",
                                        fontSize = 19.sp,
                                        fontWeight = FontWeight.Bold)

                                }
                            }

                        }
                        
                        Row(modifier = Modifier.padding(start = 80.dp,top = 740.dp)) {
                            Button(onClick =
                            { number--
                                if (number ==0) number = 5
                            }
                            , modifier = Modifier
                                    .width(100.dp)
                                    .height(37.dp)
                            ) {
                                Text(text = "Previous")
                            }
                            Spacer(modifier = Modifier.width(50.dp))
                            
                            Button(onClick = { number++}
                                   , modifier = Modifier
                                    .width(100.dp)
                                    .height(37.dp)) {
                                Text(text = "Next")
                            }
                        }
                    }
        }
         2 -> {
             Box(modifier = Modifier.fillMaxSize()) {

                 Card(
                     modifier = Modifier
                         .width(500.dp)
                         .height(600.dp)
                         .padding(20.dp),
                     elevation = 6.dp

                 ) {
                     Column(modifier = Modifier
                         .fillMaxSize()
                         .padding(30.dp)) {
                         Image(painter = painterResource(id = R.drawable.food2),
                             contentDescription = "",
                             modifier = Modifier
                                 .height(500.dp)
                                 .width(500.dp),
                             contentScale = ContentScale.Crop)
                     }
                 }
                 Box(modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 590.dp)) {

                     Card(modifier = Modifier
                         .width(500.dp)
                         .height(130.dp)
                         .padding(start = 20.dp, end = 20.dp, top = 0.dp),
                         elevation = 6.dp
                     ) {
                         Column(modifier = Modifier.padding(20.dp)) {
                             Text(text = "Still Life of Blue Rose and Other Flowers",
                                 fontSize = 25.sp)
                             Text(text = "Owen Scott(2022)",
                                 fontSize = 19.sp,
                                 fontWeight = FontWeight.Bold)

                         }
                     }

                 }

                 Row(modifier = Modifier.padding(start = 80.dp,top = 740.dp)) {
                     Button(onClick = { number--}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)
                     ) {
                         Text(text = "Previous")
                     }
                     Spacer(modifier = Modifier.width(50.dp))

                     Button(onClick = { number++}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)) {
                         Text(text = "Next")
                     }
                 }
             }
         }
         3 -> {
             Box(modifier = Modifier.fillMaxSize()) {

                 Card(
                     modifier = Modifier
                         .width(500.dp)
                         .height(600.dp)
                         .padding(20.dp),
                     elevation = 6.dp

                 ) {
                     Column(modifier = Modifier
                         .fillMaxSize()
                         .padding(30.dp)) {
                         Image(painter = painterResource(id = R.drawable.food3),
                             contentDescription = "",
                             modifier = Modifier
                                 .height(500.dp)
                                 .width(500.dp),
                             contentScale = ContentScale.Crop)
                     }
                 }
                 Box(modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 590.dp)) {

                     Card(modifier = Modifier
                         .width(500.dp)
                         .height(130.dp)
                         .padding(start = 20.dp, end = 20.dp, top = 0.dp),
                         elevation = 6.dp
                     ) {
                         Column(modifier = Modifier.padding(20.dp)) {
                             Text(text = "Still Life of Blue Rose and Other Flowers",
                                 fontSize = 25.sp)
                             Text(text = "Owen Scott(2021)",
                                 fontSize = 19.sp,
                                 fontWeight = FontWeight.Bold)

                         }
                     }

                 }

                 Row(modifier = Modifier.padding(start = 80.dp,top = 740.dp)) {
                     Button(onClick = { number--}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)
                     ) {
                         Text(text = "Previous")
                     }
                     Spacer(modifier = Modifier.width(50.dp))

                     Button(onClick = { number++}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)) {
                         Text(text = "Next")
                     }
                 }
             }
         }
         4 -> {
             Box(modifier = Modifier.fillMaxSize()) {

                 Card(
                     modifier = Modifier
                         .width(500.dp)
                         .height(600.dp)
                         .padding(20.dp),
                     elevation = 6.dp

                 ) {
                     Column(modifier = Modifier
                         .fillMaxSize()
                         .padding(30.dp)) {
                         Image(painter = painterResource(id = R.drawable.food4),
                             contentDescription = "",
                             modifier = Modifier
                                 .height(500.dp)
                                 .width(500.dp),
                             contentScale = ContentScale.Crop)
                     }
                 }
                 Box(modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 590.dp)) {

                     Card(modifier = Modifier
                         .width(500.dp)
                         .height(130.dp)
                         .padding(start = 20.dp, end = 20.dp, top = 0.dp),
                         elevation = 6.dp
                     ) {
                         Column(modifier = Modifier.padding(20.dp)) {
                             Text(text = "Still Life of Blue Rose and Other Flowers",
                                 fontSize = 25.sp)
                             Text(text = "Owen Scott(2021)",
                                 fontSize = 19.sp,
                                 fontWeight = FontWeight.Bold)

                         }
                     }

                 }

                 Row(modifier = Modifier.padding(start = 80.dp,top = 740.dp)) {
                     Button(onClick = { number--}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)
                     ) {
                         Text(text = "Previous")
                     }
                     Spacer(modifier = Modifier.width(50.dp))

                     Button(onClick = { number++}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)) {
                         Text(text = "Next")
                     }
                 }
             }
         }
         5 -> {
             Box(modifier = Modifier.fillMaxSize()) {

                 Card(
                     modifier = Modifier
                         .width(500.dp)
                         .height(600.dp)
                         .padding(20.dp),
                     elevation = 6.dp

                 ) {
                     Column(modifier = Modifier
                         .fillMaxSize()
                         .padding(30.dp)) {
                         Image(painter = painterResource(id = R.drawable.food5),
                             contentDescription = "",
                             modifier = Modifier
                                 .height(500.dp)
                                 .width(500.dp),
                             contentScale = ContentScale.Crop)
                     }
                 }
                 Box(modifier = Modifier
                     .fillMaxSize()
                     .padding(top = 590.dp)) {

                     Card(modifier = Modifier
                         .width(500.dp)
                         .height(130.dp)
                         .padding(start = 20.dp, end = 20.dp, top = 0.dp),
                         elevation = 6.dp
                     ) {
                         Column(modifier = Modifier.padding(20.dp)) {
                             Text(text = "Still Life of Blue Rose and Other Flowers",
                                 fontSize = 25.sp)
                             Text(text = "Owen Scott(2021)",
                                 fontSize = 19.sp,
                                 fontWeight = FontWeight.Bold)

                         }
                     }

                 }

                 Row(modifier = Modifier.padding(start = 80.dp,top = 740.dp)) {
                     Button(onClick = { number--}
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)
                     ) {
                         Text(text = "Previous")
                     }
                     Spacer(modifier = Modifier.width(50.dp))

                     Button(onClick =
                     { number++
                         if(number ==6){
                         number=1
                     } }
                         , modifier = Modifier
                             .width(100.dp)
                             .height(37.dp)) {
                         Text(text = "Next")
                     }
                 }
             }
         }

    }
}





