package com.juhyeon.components.shared.ui.system.combination.button.basic

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.juhyeon.components.shared.ui.common.extension.multipleEventsCutter
import com.juhyeon.components.shared.ui.system.component.icon.IconCommon
import com.juhyeon.components.shared.ui.system.theme.Normal14

@Composable
fun ButtonBasic(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.Normal14,
    onClick: () -> Unit,
    height: Dp,
    flexible: BasicFlexible,
    form: BasicForm,
    color: BasicColor,
    state: BasicState = BasicState.Enabled,
    position: BasicIcon = BasicIcon.None
) {
    val basicColorSet = when (state) {
        BasicState.Enabled -> {
            when (form) {
                BasicForm.Filled ->
                    when (color) {
                        BasicColor.Primary -> BasicColorSet.PrimaryFilled()
                        BasicColor.Gray -> BasicColorSet.GrayFilled()
                        BasicColor.DeepGray -> BasicColorSet.DeepGrayFilled()
                    }
                BasicForm.Line -> {
                    when (color) {
                        BasicColor.Primary -> BasicColorSet.PrimaryLine()
                        BasicColor.Gray -> BasicColorSet.GrayLine()
                        BasicColor.DeepGray -> BasicColorSet.DeepGrayLine()
                    }
                }
            }
        }
        BasicState.Disabled -> BasicColorSet.Disabled()
        BasicState.Error -> {
            when (form) {
                BasicForm.Filled -> BasicColorSet.ErrorFilled()
                BasicForm.Line -> BasicColorSet.ErrorLine()
            }
        }
    }
    
    NormalButton(
        height = height, 
        onClick = onClick, 
        contentPadding = when (position) {
            is BasicIcon.Only -> 0.dp
            else -> 16.dp
        }, 
        colors = basicColorSet.buttonColors(),
        enabled = state is BasicState.Enabled,
        modifier = modifier.let { 
            when (position) {
                is BasicIcon.Only -> it.size(height)
                else ->
                    when (flexible) {
                        is BasicFlexible.False ->
                            it
                                .defaultMinSize(minWidth = 328.dp)
                                .fillMaxWidth()
                        is BasicFlexible.True -> it.wrapContentWidth()
                    }
            }
        },
        borderColor = when (form) {
            is BasicForm.Line -> {
                when (state) {
                    BasicState.Enabled -> basicColorSet.borderColor
                    BasicState.Error -> basicColorSet.borderColor
                    else -> null
                }
            }
            else -> null
        }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            when (position) {
                is BasicIcon.None -> ButtonText(text, textStyle)
                is BasicIcon.Left -> {
                    IconCommon(common = position.common)
                    ButtonText(text = text, textStyle = textStyle)
                }
                is BasicIcon.Right -> {
                    ButtonText(text = text, textStyle = textStyle)
                    IconCommon(common = position.common)
                }
                is BasicIcon.Only -> IconCommon(common = position.common)
            }
        }
    }
}

@Composable
private fun NormalButton(
    height: Dp,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: Dp,
    colors: ButtonColors,
    borderColor: Color? = null,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    multipleEventsCutter { manager ->
        Button(
            onClick = { manager.processEvent(onClick) },
            enabled = enabled,
            modifier = modifier.height(height),
            shape = RoundedCornerShape(8.dp),
            border = borderColor?.let { BorderStroke(1.dp, borderColor) },
            colors = colors,
            contentPadding = contentPadding.paddingStartWithEnd(),
            content = content
        )
    }
}

private fun Dp.paddingStartWithEnd() = PaddingValues(start = this, end = this)

@Composable
private fun ButtonText(
    text: String,
    textStyle: TextStyle
) {
    Text(
        text = text,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        style = textStyle
    )
}