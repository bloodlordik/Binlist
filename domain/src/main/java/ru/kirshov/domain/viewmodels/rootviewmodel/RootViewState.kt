package ru.kirshov.domain.viewmodels.rootviewmodel

import ru.kirshov.data.states.NavigationState


data class RootViewState(
    val navigationState: NavigationState
){
    companion object {
        fun emptyState():RootViewState{
           return RootViewState(
                navigationState = NavigationState.Input
            )
        }
    }
}


