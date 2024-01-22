package com.juhyeon.components.shared.ui.system.combination.button.basic

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.juhyeon.components.shared.ui.system.theme.Black900
import com.juhyeon.components.shared.ui.system.theme.Blue600
import com.juhyeon.components.shared.ui.system.theme.DeepGray900
import com.juhyeon.components.shared.ui.system.theme.Gray300
import com.juhyeon.components.shared.ui.system.theme.Gray400
import com.juhyeon.components.shared.ui.system.theme.Red600
import com.juhyeon.components.shared.ui.system.theme.White100

sealed interface BasicColor {
    data object Primary : BasicColor
    data object Gray : BasicColor
    data object DeepGray : BasicColor
}

sealed interface BasicColorSet {
    val backgroundColor: Color
    val borderColor: Color
    val textColor: Color

    data class PrimaryFilled(
        override val backgroundColor: Color = Blue600,
        override val borderColor: Color = Blue600,
        override val textColor: Color = White100
    ) : BasicColorSet

    data class GrayFilled(
        override val backgroundColor: Color = Gray400,
        override val borderColor: Color = Gray400,
        override val textColor: Color = White100
    ) : BasicColorSet

    data class DeepGrayFilled(
        override val backgroundColor: Color = DeepGray900,
        override val borderColor: Color = DeepGray900,
        override val textColor: Color = White100
    ) : BasicColorSet

    data class ErrorFilled(
        override val backgroundColor: Color = Red600,
        override val borderColor: Color = Red600,
        override val textColor: Color = White100
    ) : BasicColorSet

    data class PrimaryLine(
        override val backgroundColor: Color = White100,
        override val borderColor: Color = Blue600,
        override val textColor: Color = Black900
    ) : BasicColorSet

    data class GrayLine(
        override val backgroundColor: Color = White100,
        override val borderColor: Color = Gray400,
        override val textColor: Color = Gray400
    ) : BasicColorSet

    data class DeepGrayLine(
        override val backgroundColor: Color = White100,
        override val borderColor: Color = DeepGray900,
        override val textColor: Color = DeepGray900
    ) : BasicColorSet

    data class ErrorLine(
        override val backgroundColor: Color = White100,
        override val borderColor: Color = Red600,
        override val textColor: Color = Red600
    ) : BasicColorSet

    data class Disabled(
        override val backgroundColor: Color = Gray300,
        override val borderColor: Color = Gray300,
        override val textColor: Color = Gray400
    ) : BasicColorSet
}

@Composable
fun BasicColorSet.buttonColors() = ButtonDefaults.buttonColors(
    containerColor = backgroundColor,
    contentColor = textColor,
    disabledContainerColor = Gray300,
    disabledContentColor = Gray400
)