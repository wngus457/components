package com.juhyeon.components.shared.ui.system.component.toggle

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.juhyeon.components.shared.ui.system.theme.Blue600
import com.juhyeon.components.shared.ui.system.theme.Gray450
import com.juhyeon.components.shared.ui.system.theme.White100

@Composable
fun Toggle(
    width: Dp = 72.dp,
    height: Dp = 30.dp,
    checkedTrackColor: Color = Blue600,
    uncheckedTrackColor: Color = Gray450,
    gapBetweenThumbAndTrackEdge: Dp = 8.dp,
    thumbInnerPadding: Dp = 4.dp,
    thumbSize: Dp = 20.dp,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val alignment by animateAlignmentAsSate(if (checked) 1f else -1f)

    Box(
        modifier = Modifier
            .size(width = width, height = height)
            .background(
                color = if (checked) checkedTrackColor else uncheckedTrackColor,
                shape = RoundedCornerShape(percent = 50)
            )
            .clickable(
                indication = null,
                interactionSource = interactionSource
            ) { onCheckedChange(!checked) },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = gapBetweenThumbAndTrackEdge)
                .fillMaxSize(),
            contentAlignment = alignment
        ) {
            Box(
                modifier = Modifier
                    .size(size = thumbSize)
                    .background(
                        color = White100,
                        shape = CircleShape
                    )
                    .padding(thumbInnerPadding)
            )
        }
    }
}


@Composable
private fun animateAlignmentAsSate(
    targetBiasValue: Float
): State<BiasAlignment> {
    val bias by animateFloatAsState(targetValue = targetBiasValue, label = "")
    return remember { derivedStateOf { BiasAlignment(horizontalBias = bias, verticalBias = 0f) } }
}

@Preview(showBackground = true)
@Composable
private fun TogglePreview() {
    var checked by remember { mutableStateOf(false) }
    Toggle(
        checked = checked,
        onCheckedChange = { checked = it }
    )
}