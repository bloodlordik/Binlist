package ru.kirshov.domain.viewmodels.rootviewmodel

import ru.kirshov.data.actions.NavigationActions

sealed class RootViewActions{
    data class NavAction(
        val action: NavigationActions
    ):RootViewActions()
}
