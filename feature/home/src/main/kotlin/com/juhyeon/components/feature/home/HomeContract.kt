package com.juhyeon.components.feature.home

import UiEffect
import UiEvent
import UiState

interface HomeContract {
    sealed interface Event : UiEvent {
        data object OnBackClick : Event
    }

    data object State : UiState

    sealed interface Effect : UiEffect {
        data object NavigateToBack : Effect
    }
}