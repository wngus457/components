package com.juhyeon.components.shared.ui.system.component.icon

import androidx.annotation.DrawableRes

sealed interface Icon {
    data class IconCommon(@DrawableRes val resId: Int, val iconId: String = "") : Icon
}