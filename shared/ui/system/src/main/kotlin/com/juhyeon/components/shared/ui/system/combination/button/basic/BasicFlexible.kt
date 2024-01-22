package com.juhyeon.components.shared.ui.system.combination.button.basic

sealed interface BasicFlexible {
    data object False : BasicFlexible
    data object True : BasicFlexible
}