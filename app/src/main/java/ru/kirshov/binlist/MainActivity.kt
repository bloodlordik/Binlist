package ru.kirshov.binlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.kirshov.binlist.ui.theme.BinlistTheme
import ru.kirshov.presentation.RootScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BinlistTheme {
               RootScaffold()
            }
        }
    }
}

