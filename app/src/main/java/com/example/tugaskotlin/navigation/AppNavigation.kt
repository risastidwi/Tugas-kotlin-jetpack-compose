package com.example.tugaskotlin.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tugaskotlin.Screens.HomeScreen
import com.example.tugaskotlin.Screens.ProfileScreen
import com.example.tugaskotlin.Screens.SettingsScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar{
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItems: NavItems ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any {it.route == navItems.route} == true,
                        onClick = {
                                  navController.navigate(navItems.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                                  },
                        icon = {
                               Icon(
                                   imageVector = navItems.icon,
                                   contentDescription = null
                               )
                        },
                        label = {
                            Text(text = navItems.label)
                        }
                    )
                }
            }

        }
    ) {paddingValues ->
        NavHost(
            navController = navController ,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name){
                HomeScreen()
            }
            composable(route = Screens.SettingsScreen.name) {
                SettingsScreen()
            }
            composable(route = Screens.ProfileScreen.name) {
                ProfileScreen()
            }
        }
    }
}