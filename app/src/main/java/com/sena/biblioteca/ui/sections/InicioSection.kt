package com.sena.biblioteca.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.biblioteca.R

@Composable
fun InicioSection(){
    Column(modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier.size(220.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.inicio),
                contentDescription = null,
                modifier = Modifier.size(220.dp),
                contentScale = ContentScale.Fit
            )
        }
        Text(
            text = "¡Bienvenido a tu Biblioteca!",
            fontSize = 20.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Descubre, aprende y reserva tus libros favoritos.",
            fontSize = 10.sp,
            color = Color.LightGray
        )
    }
}