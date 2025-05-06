package com.artur_hodorodvskij.weatherapp.presentation.screen

import androidx.compose.ui.tooling.data.EmptyGroup.location
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.artur_hodorodvskij.weatherapp.api.WeatherRepository
import kotlinx.coroutines.launch

class MainScreenViewModel : ViewModel() {
    private var weatherRepository = WeatherRepository()

    private val _state = MutableLiveData<WeatherState>()
    val state: LiveData<WeatherState> = _state



     fun loadData(location: String) {
        _state.value = WeatherState.Loading
        viewModelScope.launch {
            try {
                val response = weatherRepository.getWeatherData(location)
                if (response != null) {
                    _state.value = WeatherState.Content(response)
                } else {
                    throw Exception()
                }
            } catch (e: Exception) {
                handleError(e.message.toString())
            }

        }
    }

    fun reloadData(location: String) {
//        loadData(ROOT_NEWS_TAG)
        loadData(location)
    }


    private fun handleError(errorMessage: String) {
        _state.value = WeatherState.Error(errorMessage = errorMessage)
    }
}


