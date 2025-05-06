package com.artur_hodorodvskij.weatherapp.presentation.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artur_hodorodvskij.weatherapp.data.HourlyWeather
import com.artur_hodorodvskij.weatherapp.ui.theme.CardColor
import androidx.compose.material3.Text
import com.artur_hodorodvskij.weatherapp.data.WeatherResponse


@Composable
fun HourlyWeatherCard(weatherData: WeatherResponse) {
    val hourlyWeatherList = listOf(HourlyWeather())

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = CardColor)
    ) {

        LazyRow(
            modifier = Modifier,
            state = rememberLazyListState(),
            contentPadding = PaddingValues(0.dp),

        ) {

            items(hourlyWeatherList) { item ->
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {

                    Text(
                        fontSize = 14.sp,
                        text = item.time,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                    )
                    Image(
                        modifier = Modifier
                            .size(36.dp),
                        painter = painterResource(item.image),
                        contentDescription = null
                    )
                    Text(
                        fontSize = 20.sp,
                        text = item.temperature,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier

                    )

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHourlyWeatherCard() {
    HourlyWeatherCard()
}