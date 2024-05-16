package com.example.tugaskotlin.data

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun HomeContent(){
    val hIsi = remember {DataProvider.HIsiList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items = hIsi,
            itemContent = {
                HIsiListItem(hIsi = it)
            }
        )
    }
}