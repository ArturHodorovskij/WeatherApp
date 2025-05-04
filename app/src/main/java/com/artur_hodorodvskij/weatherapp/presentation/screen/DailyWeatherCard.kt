package com.artur_hodorodvskij.weatherapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.artur_hodorodvskij.weatherapp.data.DailyWeather
import com.artur_hodorodvskij.weatherapp.ui.theme.CardColor

@Composable
fun DailyWeatherCard() {
    val dailyWeatherList = listOf(DailyWeather())
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = CardColor),
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            dailyWeatherList.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        Text(
                            fontSize = 14.sp,
                            text = item.date,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                        )
                    }
                    Box(modifier = Modifier.weight(2f),
                        contentAlignment = Alignment.CenterStart) {
                        Text(
                            fontSize = 14.sp,
                            text = item.dayName,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                        )
                    }

                    Box(
                        modifier = Modifier.weight(3f),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .size(40.dp),
                            painter = painterResource(item.image),
                            contentDescription = null
                        )
                    }
                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterEnd) {
                        Text(
                            fontSize = 14.sp,
                            text = "${item.nightTemperature} / ${item.daytimeTemperature}",
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHourlyDailyCard() {
    DailyWeatherCard()
}