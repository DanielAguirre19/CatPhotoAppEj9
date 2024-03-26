package com.mexiti.catphotoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mexiti.catphotoapp.ui.DogApp
import com.mexiti.catphotoapp.ui.theme.CatPhotoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatPhotoAppTheme {
                //Initial App without Model
                DogApp()
            }
        }
    }
}

