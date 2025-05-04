package com.artur_hodorodvskij.weatherapp.data

import android.health.connect.datatypes.units.Temperature
import com.artur_hodorodvskij.weatherapp.R

data class DailyWeather(
    val date:String = "04.05",
    val dayName: String = "Воскресенье",
    val image: Int =  R.drawable.partlycloudy,
    val nightTemperature: String = "2°",
    val daytimeTemperature: String = "8°",

)

