package com.artur_hodorodvskij.weatherapp.presentation.screen

import com.artur_hodorodvskij.weatherapp.data.WeatherResponse

sealed class WeatherState {
        data object Initial : WeatherState()
        data object Loading : WeatherState()
        data class Content(val weatherData: WeatherResponse) : WeatherState()
        data class Error(val errorMessage: String) : WeatherState()
    }
