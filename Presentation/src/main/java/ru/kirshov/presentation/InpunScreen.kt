package ru.kirshov.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ru.kirshov.presentation.inputelements.InputLabel


@Composable
fun InputScreen(modifier: Modifier = Modifier, inputState: String, onChange:(String)->Unit) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputLabel(
            input = inputState,
            onValueChange = onChange
        )

    }
}