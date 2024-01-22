package com.juhyeon.components.network

import UiEffect
import UiEvent
import UiState

interface NetworkContract {
    sealed interface Event : UiEvent

    data class State(
        val networkState: NetworkState
    ) : UiState

    sealed interface NetworkState {
        data object None : NetworkState
        data object Connected : NetworkState
        data object DisConnected : NetworkState
    }

    sealed interface Effect : UiEffect
}