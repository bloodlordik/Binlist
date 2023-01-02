package ru.kirshov.domain.viewmodels.rootviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import ru.kirshov.data.MVIViewModel
import ru.kirshov.data.actions.NavigationActions
import ru.kirshov.data.states.NavigationState

class RootViewModel:ViewModel(),MVIViewModel<RootViewActions, RootViewState> {
    private val _state = MutableStateFlow<RootViewState>(RootViewState.emptyState())
    override fun dispatch(actions: RootViewActions) {
        when(actions){
            is RootViewActions.NavAction-> {
                navigate(actions.action)
            }
            is RootViewActions.InputAction -> {
                inputController(actions.newValue)
            }
        }
    }
    private fun navigate(nav:NavigationActions){
        when(nav){
            NavigationActions.INPUT -> _state.value =_state.value.copy(navigationState = NavigationState.Input)
            NavigationActions.HISTORY -> _state.value.copy(navigationState = NavigationState.History)
            NavigationActions.SETTING -> _state.value = _state.value.copy(navigationState = NavigationState.Setting)
        }
    }
    private fun inputController(input:String){
        _state.value = _state.value.copy(
            inputState = input
        )
    }
    override val state: Flow<RootViewState>
        get() = _state
}