package com.example.tugaskotlin.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItems(
        label = "Screen 1",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        label = "Screen 2",
        icon = Icons.Default.Menu,
        route = Screens.SettingsScreen.name
    ),
    NavItems(
        label = "About",
        icon = Icons.Default.Person,
        route = Screens.ProfileScreen.name
    ),
)