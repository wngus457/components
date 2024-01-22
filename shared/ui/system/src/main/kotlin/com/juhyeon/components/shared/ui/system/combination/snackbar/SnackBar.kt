package com.juhyeon.components.shared.ui.system.combination.snackbar

import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.juhyeon.components.shared.ui.system.theme.DeepGray900
import com.juhyeon.components.shared.ui.system.theme.White100

@Composable
fun SnackBar(
    hostState: SnackbarHostState,
    modifier: Modifier = Modifier,
    actionColor: Color = White100,
    containerColor: Color = DeepGray900,
    contentColor: Color = White100
) {
    SnackbarHost(hostState = hostState, modifier = modifier) {
        Snackbar(
            containerColor = containerColor,
            contentColor = contentColor,
            actionColor = actionColor,
            snackbarData = it
        )
    }
}