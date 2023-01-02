package ru.kirshov.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import ru.kirshov.data.MVIViewModel
import ru.kirshov.data.states.NavigationState
import ru.kirshov.domain.viewmodels.rootviewmodel.RootViewActions
import ru.kirshov.domain.viewmodels.rootviewmodel.RootViewState

@Composable
fun RootScaffold(
    modifier: Modifier = Modifier,
    rootState: MVIViewModel<RootViewActions, RootViewState>
) {
    val state = rootState.state.collectAsState(initial = RootViewState.emptyState())
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            RootBottomBar(selected = { navItem ->
                rootState.dispatch(
                    actions = RootViewActions.NavAction(navItem)
                )
            })
        }
    ) { paddingValues ->
        Box(modifier = modifier.padding(paddingValues)) {
            when (state.value.navigationState){
                NavigationState.Input -> InputScreen()
                NavigationState.History -> HistoryScreen()
                NavigationState.Setting -> SettingScreen()
            }
        }
    }
}

