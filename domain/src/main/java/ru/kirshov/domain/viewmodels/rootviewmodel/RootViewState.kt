package ru.kirshov.domain.viewmodels.rootviewmodel

import ru.kirshov.data.states.NavigationState


data class RootViewState(
    val navigationState: NavigationState,
    val inputState: String
) {
    companion object {
        fun emptyState(): RootViewState {
            return RootViewState(
                navigationState = NavigationState.Input,
                inputState = ""
            )
        }
    }
}


