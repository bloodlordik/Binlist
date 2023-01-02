package ru.kirshov.binlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.kirshov.binlist.ui.theme.BinlistTheme
import ru.kirshov.domain.viewmodels.rootviewmodel.RootViewModel
import ru.kirshov.presentation.RootScaffold

class MainActivity : ComponentActivity() {
    private val viewModel by viewModel<RootViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BinlistTheme {
               RootScaffold(rootState = viewModel)
            }
        }
    }
}

