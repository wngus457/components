package com.juhyeon.components.shared.ui.system.component.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.juhyeon.components.shared.ui.common.extension.clickableSingle

@Composable
fun IconCommon(
    modifier: Modifier = Modifier.size(24.dp),
    common: Icon.IconCommon,
    tint: Color = Color.Unspecified,
    contentDescription: String? = null,
    onClick: () -> Unit = { }
) {
    Icon(
        painter = painterResource(id = common.resId),
        contentDescription = contentDescription,
        modifier = Modifier
            .then(modifier)
            .clickableSingle { onClick() },
        tint = tint
    )
}