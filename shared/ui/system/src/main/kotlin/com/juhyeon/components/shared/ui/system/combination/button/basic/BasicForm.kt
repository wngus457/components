package com.juhyeon.components.shared.ui.system.combination.button.basic

sealed interface BasicForm {
    data object Filled : BasicForm
    data object Line : BasicForm
}