package com.juhyeon.components.shared.ui.system.combination.button.basic

sealed interface BasicState {
    data object Enabled : BasicState
    data object Disabled : BasicState
    data object Error : BasicState
}