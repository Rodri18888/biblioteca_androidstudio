package com.sena.biblioteca.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.biblioteca.R

@Composable
fun InicioSection(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.size(270.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.inicio),
                contentDescription = null,
                modifier = Modifier.size(270.dp),
                contentScale = ContentScale.Fit
            )
        }
        Box(modifier = Modifier.padding(horizontal = 20.dp),
            contentAlignment = Alignment.CenterStart) {
        Text(
            text = "¡Bienvenido a tu Biblioteca!",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color(16, 18, 80),
            fontWeight = FontWeight.Bold
        )
    }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(horizontal = 20.dp),
            contentAlignment = Alignment.CenterStart) {
            Text(
                text = "Descubre, aprende y reserva tus libros favoritos.",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = Color(111, 119, 146),
                fontWeight = FontWeight.Bold
            )
        }
    }
}