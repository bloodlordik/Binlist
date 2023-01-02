package ru.kirshov.presentation.inputelements

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun InputLabel(modifier: Modifier = Modifier, input: String = "", onValueChange:(String)->Unit) {

    TextField(
        value = input,
        onValueChange = onValueChange,
        readOnly = false,
        keyboardOptions = KeyboardOptions(autoCorrect = false, keyboardType = KeyboardType.Number),
        singleLine = true,
        placeholder = { Text(text = "**** ****") }

    )
}