package com.example.tugaskotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugaskotlin.data.HomeContent
import com.example.tugaskotlin.navigation.AppNavigation
import com.example.tugaskotlin.ui.theme.TugasKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasKotlinTheme {
                MyApp()
                AppNavigation()

                //Fragment Compose Jangan lupa dipelajari
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(){
    Scaffold {
        HomeContent()
        AppNavigation()
    }
}
