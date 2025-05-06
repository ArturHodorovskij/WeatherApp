package com.artur_hodorodvskij.weatherapp.presentation.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artur_hodorodvskij.weatherapp.data.WeatherResponse
import com.artur_hodorodvskij.weatherapp.ui.theme.CardColor

@Composable
fun DetailsCard(weatherData: WeatherResponse) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = CardColor),
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Влажность",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "83%",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Видимость",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "15 км",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Вероятность дождя",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "100%",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Осадки",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "0 мм",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Направление ветра",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "83%",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Скорость ветра",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "25 км/ч",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "УФ индекс ",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "0",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Атмосферное давление",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "750 мпа",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Восход",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "05:42",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Закат",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "20:59",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Фаза луны",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "Первая четверть",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Text(
                    fontSize = 14.sp,
                    text = "Лунный цикл",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )
                Text(
                    fontSize = 14.sp,
                    text = "День 8",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                )


            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewDetailsCard() {
    DetailsCard()
}