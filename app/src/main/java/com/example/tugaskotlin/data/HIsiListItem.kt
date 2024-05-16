package com.example.tugaskotlin.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HIsiListItem(hIsi: HIsi){
    Card (
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            HisiImage(hIsi = hIsi)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = hIsi.title, style = typography.headlineMedium)
                Text(text = hIsi.harga, style = typography.bodyMedium)
            }
        }
    }
}
//Detik 2:54
@Composable
private fun HisiImage(hIsi: HIsi){
    Image(
        painter = painterResource(id = hIsi.HIsiImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.run {
            padding(8.dp)
                .size(84.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        }
    )
}
