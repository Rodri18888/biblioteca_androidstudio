package com.sena.biblioteca.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.biblioteca.R
import com.sena.biblioteca.ui.components.ButtonComponent
import com.sena.biblioteca.ui.components.ReservaComponent

@Composable
fun ReservaSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(240.dp)
                .clip(CircleShape)
                .background(Color(220, 245, 225)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.check),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(35.dp)
                    .clip(CircleShape)
                    .background(Color(35, 186, 72)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.check),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }
            Box(contentAlignment = Alignment.CenterStart) {
                Text(
                    text = "Reserva Exitosa",
                    color = Color(16, 18, 80),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .size(width = 350.dp, height = 170.dp)
                .clip((RoundedCornerShape(16.dp)))
                .background(Color.White)
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                ReservaComponent(
                    icono = R.drawable.libro,
                    texto1 = "Libro:",
                    texto2 = "Clean Code"
                )
                Spacer(modifier = Modifier.height(10.dp))
                ReservaComponent(
                    icono = R.drawable.calendario,
                    texto1 = "Fecha:",
                    texto2 = "15/06/26"
                )


            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        ButtonComponent(
            icono = R.drawable.home,
            texto = "Volver al inicio",
            colorFondo = Color(35, 186, 72)
        )
    }
}

