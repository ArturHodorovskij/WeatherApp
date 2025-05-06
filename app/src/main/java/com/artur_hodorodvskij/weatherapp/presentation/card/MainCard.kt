package com.artur_hodorodvskij.weatherapp.presentation.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.artur_hodorodvskij.weatherapp.R
import com.artur_hodorodvskij.weatherapp.data.WeatherResponse
import com.artur_hodorodvskij.weatherapp.ui.theme.CardColor

@Composable
fun MainCard(weatherData: WeatherResponse) {
    val current = weatherData.current
    val condition  = current.condition
    val location =weatherData.location
    Card(
        modifier = Modifier
            .fillMaxWidth()
        .padding(vertical = 4.dp, horizontal = 8.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = CardColor),
    )
    {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ) {
                AsyncImage(
                    model = "https:${condition.icon}",
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    fontSize = 16.sp,
                    text = location.localtime,
                    fontWeight = FontWeight.Normal
                )

                Text(
                    fontSize = 16.sp,
                    text = location.name,
                    fontWeight = FontWeight.Normal
                )

            }

//            Image(
//                modifier = Modifier
//                    .size(128.dp),
//                painter = painterResource(R.drawable.partlycloudy),
//                contentDescription = null
//            )

            Text(
                fontSize = 40.sp,
                text = "${current.temp_c}°C",
                fontWeight = FontWeight.Normal
            )

            Text(
                fontSize = 18.sp,
                text = condition.text,
                fontWeight = FontWeight.Normal
            )

        }
    }
}

