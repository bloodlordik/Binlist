package ru.kirshov.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RootScaffold(){
    Scaffold { paddingValues->
        Box(modifier = Modifier.padding(paddingValues)){
            Text(text = "Scaffold")
        }
    }
}