package ru.kirshov.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RootScaffold(modifier: Modifier = Modifier){
    Scaffold(modifier = modifier.fillMaxSize()) { paddingValues->
        Box(modifier = modifier.padding(paddingValues)){
            Text(text = "Scaffold")
        }
    }
}

@Composable
@Preview
private fun RootScaffoldPreview(){
    RootScaffold()
}