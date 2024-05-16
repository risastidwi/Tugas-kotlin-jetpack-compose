package com.example.tugaskotlin.dataprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

//jetpack compose UI Design tutorial [7:28] Sekarang ke [8:50]
//https://www.youtube.com/watch?v=RnSdhupE4ss
@Preview
@Composable
public fun ProfileContent(){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#f2f1f6"))),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout(
            Modifier
                .height(250.dp)
                .background(color = Color(android.graphics.Color.parseColor("#32357a")))
        ){
            val (topImg, profile, title, back, pen) = createRefs()

            Image(painterResource(id = com.example.tugaskotlin.R.drawable.polygon), null, Modifier
                .fillMaxWidth()
                .constrainAs(topImg) {
                    bottom.linkTo(parent.bottom)
                })
            Image(painterResource(id = com.example.tugaskotlin.R.drawable.chi), null, Modifier
                .fillMaxWidth()
                .constrainAs(profile) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(topImg.bottom)
                })
            Text(text = "About",
                style = TextStyle(color = Color.White,
                    fontSize = 30.sp),
                modifier = Modifier
                    .constrainAs(title){
                        top.linkTo(parent.top, margin = 32.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
            //Cari foto arrow ke kiri
            Image(painterResource(id = com.example.tugaskotlin.R.drawable.back), null, Modifier
                .constrainAs(back) {
                    top.linkTo(parent.top, margin = 24.dp)
                    start.linkTo(parent.start, margin = 24.dp)
                })
            //Cari foto write [11:26]
            Image(painterResource(id = com.example.tugaskotlin.R.drawable.announcement), null, Modifier
                    .constrainAs(pen) {
                        top.linkTo(profile.top)
                        start.linkTo(profile.end)
                    })

        }
        Text(
            text = "Risasti Dwi Ardini",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp),
            color = Color(android.graphics.Color.parseColor("#32357a"))
        )
        Text(
            text = "risastidwiardini7@gmail.com",
            fontSize = 18.sp,
            color = Color(android.graphics.Color.parseColor("#747679"))
        )
        // [17:10]
        Row (
            modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 32.dp, top = 16.dp, bottom = 10.dp)
            .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
            //Notification
        ){
           Column(
               modifier = Modifier.fillMaxHeight(),
               verticalArrangement = Arrangement.Center
           ) {
               Image(painter = painterResource(id = com.example.tugaskotlin.R.drawable.university),
                   null,
                   modifier = Modifier
                       .padding(end = 5.dp)
                       .clickable { })
           }
           Column(
               modifier = Modifier
                   .padding(start = 16.dp)
                   .weight(1f)
           ) {
           Text(
               text = "Universitas Muhammadiyah Sumatera Utara",
               color = Color.Black,
               fontSize = 18.sp,
               fontWeight = FontWeight.SemiBold
               )
           }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
            //Galery
        ){
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(painter = painterResource(id = com.example.tugaskotlin.R.drawable.major),
                    null,
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Teknologi Informasi",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
//            //Calendar
//        ){
//            Column(
//                modifier = Modifier.fillMaxHeight(),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Image(painter = painterResource(id = com.example.tugaskotlin.R.drawable.calendar),
//                    null,
//                    modifier = Modifier
//                        .padding(end = 5.dp)
//                        .clickable { })
//            }
//            Column(
//                modifier = Modifier
//                    .padding(start = 16.dp)
//                    .weight(1f)
//            ) {
//                Text(
//                    text = "Calendar",
//                    color = Color.Black,
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.SemiBold
//                )
//            }
//            //[18:05]
//            Column(
//                modifier = Modifier.fillMaxHeight(),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Image(
//                    painter = painterResource(id = com.example.tugaskotlin.R.drawable.arrowr),
//                    null,
//                    Modifier
//                        .padding(start = 5.dp)
//                        .clickable { })
//            }
//            //}
//        }
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
//                .height(55.dp),
//            verticalAlignment = Alignment.CenterVertically
//            //Notification
//        ){
//            Column(
//                modifier = Modifier.fillMaxHeight(),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Image(painter = painterResource(id = com.example.tugaskotlin.R.drawable.announcement),
//                    null,
//                    modifier = Modifier
//                        .padding(end = 5.dp)
//                        .clickable { })
//            }
//            Column(
//                modifier = Modifier
//                    .padding(start = 16.dp)
//                    .weight(1f)
//            ) {
//                Text(
//                    text = "Notification",
//                    color = Color.Black,
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.SemiBold
//                )
//            }
//            //[18:05]
//            Column(
//                modifier = Modifier.fillMaxHeight(),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Image(
//                    painter = painterResource(id = com.example.tugaskotlin.R.drawable.arrowr),
//                    null,
//                    Modifier
//                        .padding(start = 5.dp)
//                        .clickable { })
//            }
//            //}
//        }
//        Row (
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
//                .height(55.dp),
//            verticalAlignment = Alignment.CenterVertically
            //Logout
        ){
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(painter = painterResource(id = com.example.tugaskotlin.R.drawable.logout),
                    null,
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Logout",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            //[18:05]
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
            }
            //}
        }
    }
}