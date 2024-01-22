package com.juhyeon.components.shared.ui.common.extension

import androidx.compose.ui.focus.FocusRequester

fun FocusRequester.isFocusOut() = !this.freeFocus()