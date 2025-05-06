package com.artur_hodorodvskij.weatherapp.api

import com.artur_hodorodvskij.weatherapp.data.WeatherResponse

val apiKey = ApiKey().API_KEY

class WeatherRepository {
    suspend fun getWeatherData(location:String): WeatherResponse? {
        val weatherData = RetrofitInstance.api.getWeatherForecast(apiKey, location )
        return weatherData
    }
}
