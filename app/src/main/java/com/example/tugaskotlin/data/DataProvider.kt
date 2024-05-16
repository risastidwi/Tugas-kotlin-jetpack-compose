package com.example.tugaskotlin.data

import com.example.tugaskotlin.R

object DataProvider{

    val HIsi =
        HIsi(
            id = 1,
            title = "Kentang Goreng",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 10.000",
            HIsiImageId = R.drawable.kentanggoreng
        )

    val HIsiList = listOf(
        HIsi,
        HIsi(
            id = 2,
            title = "Nasi Goreng",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 20.000",
            HIsiImageId = R.drawable.download
        ),
        HIsi(
            id = 3,
            title = "Dimsum",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 30.000",
            HIsiImageId = R.drawable.dimsum
        ),
        HIsi(
            id = 4,
            title = "Mie Goreng",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 40.000",
            HIsiImageId = R.drawable.miegoreng
        ),
        HIsi(
            id = 5,
            title = "Nugget Ayam",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 50.000",
            HIsiImageId = R.drawable.nuggetayam
        ),
        HIsi(
            id = 6,
            title = "Nasi Lemak",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 60.000",
            HIsiImageId = R.drawable.nasilemak
        ),
        HIsi(
            id = 7,
            title = "Mie Ayam",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 70.000",
            HIsiImageId = R.drawable.mieayam
        ),
        HIsi(
            id = 8,
            title = "Bakso",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 80.000",
            HIsiImageId = R.drawable.bakso
        ),
        HIsi(
            id = 9,
            title = "Soto",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 90.000",
            HIsiImageId = R.drawable.soto
        ),
        HIsi(
            id = 10,
            title = "Ayam Geprek",
            description = "Makanan yang terbuat dari nasi yang digoreng",
            harga = "Rp 100.000",
            HIsiImageId = R.drawable.ayamgeprek
        ),
    )
}