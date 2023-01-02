package ru.kirshov.data

import kotlinx.coroutines.flow.Flow

interface MVIViewModel<ACTIONS,STATES> {
    fun dispatch(actions: ACTIONS)
    val state: Flow<STATES>
}