package com.artur_hodorodvskij.weatherapp.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.artur_hodorodvskij.weatherapp.data.WeatherResponse
import com.artur_hodorodvskij.weatherapp.presentation.card.DailyWeatherCard
import com.artur_hodorodvskij.weatherapp.presentation.card.DetailsCard
import com.artur_hodorodvskij.weatherapp.presentation.card.HourlyWeatherCard
import com.artur_hodorodvskij.weatherapp.presentation.card.MainCard


@Composable
fun MainScreen(weatherData: WeatherResponse) {

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .systemBarsPadding()
            .verticalScroll(rememberScrollState())
    ) {

        MainCard(weatherData = weatherData)
        HourlyWeatherCard(weatherData = weatherData)
        DailyWeatherCard(weatherData = weatherData)
        DetailsCard(weatherData = weatherData)

    }
}

