package com.artur_hodorodvskij.weatherapp.data

import com.artur_hodorodvskij.weatherapp.R

data class HourlyWeather(
    val time: String = "12:00",
    val temperature: String = "8°",
    val image: Int =  R.drawable.partlycloudy

)