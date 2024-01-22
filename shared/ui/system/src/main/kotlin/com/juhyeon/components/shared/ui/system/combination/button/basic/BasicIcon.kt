package com.juhyeon.components.shared.ui.system.combination.button.basic

import com.juhyeon.components.shared.ui.system.component.icon.Icon

sealed interface BasicIcon {
    data object None : BasicIcon
    data class Left(val common: Icon.IconCommon) : BasicIcon
    data class Right(val common: Icon.IconCommon) : BasicIcon
    data class Only(val common: Icon.IconCommon) : BasicIcon
}