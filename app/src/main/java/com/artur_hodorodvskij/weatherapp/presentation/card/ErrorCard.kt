package com.artur_hodorodvskij.weatherapp.presentation.card

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artur_hodorodvskij.weatherapp.presentation.screen.WeatherState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ErrorCard(errorMessage: WeatherState.Error, refreshData: () -> Unit) {
    Box(modifier = Modifier) {
        BasicAlertDialog(onDismissRequest = { refreshData() }) {
            Card {
                Text(
                    text = "$errorMessage try again later",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }
}
