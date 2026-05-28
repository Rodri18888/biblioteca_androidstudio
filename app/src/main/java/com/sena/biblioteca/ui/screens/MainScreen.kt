package com.sena.biblioteca.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.biblioteca.ui.sections.InicioSection

@Composable

fun MainScreen(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.White){
        InicioSection()
    }
}