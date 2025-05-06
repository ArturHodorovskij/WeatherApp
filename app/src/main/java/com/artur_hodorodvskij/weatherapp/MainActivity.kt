package com.artur_hodorodvskij.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.artur_hodorodvskij.weatherapp.presentation.design.DownloadIndicator
import com.artur_hodorodvskij.weatherapp.presentation.card.ErrorCard
import com.artur_hodorodvskij.weatherapp.presentation.screen.MainScreen
import com.artur_hodorodvskij.weatherapp.presentation.screen.MainScreenViewModel
import com.artur_hodorodvskij.weatherapp.presentation.screen.WeatherState
import com.artur_hodorodvskij.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                val viewModel: MainScreenViewModel = viewModel()
                val state by viewModel.state.observeAsState()
                val homeLocation = "Гродно"

                LaunchedEffect(Unit) {
                    viewModel.loadData(location = homeLocation)
                }

                Column(
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .systemBarsPadding()
                        .verticalScroll(rememberScrollState())
                ) {
                    Crossfade(
                        modifier = Modifier.weight(1f),
                        targetState = state
                    ) { targetState ->
                        when (targetState) {
                            is WeatherState.Initial -> Unit
                            is WeatherState.Loading -> DownloadIndicator()
                            is WeatherState.Content -> { MainScreen(weatherData = targetState.weatherData)
                            }
                            is WeatherState.Error -> ErrorCard(errorMessage = targetState,
                                refreshData = { viewModel.reloadData(location = homeLocation) })

                            else -> Unit

                        }

                    }


                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}