package com.sena.biblioteca.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sena.biblioteca.ui.sections.ReservaSection

@Composable

fun BookingScreen(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color(241, 251, 242)){
        ReservaSection()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    BookingScreen()
}