package com.example.tugaskotlin.data

import android.icu.text.CaseMap.Title

data class HIsi(
    val id: Int,
    val title: String,
    val description: String,
    val harga: String,
    val HIsiImageId: Int = 0
    //detik ke 0:44 (Masukan Foto)
)