package com.juhyeon.components.shared.ui.system.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.juhyeon.components.shared.ui.common.extension.textDp
import com.juhyeon.components.shared.ui.system.R
import androidx.compose.material3.Typography

val font = FontFamily(
    Font(R.font.pretendard_regular, weight = FontWeight.Normal),
    Font(R.font.pretendard_bold, weight = FontWeight.Bold),
    Font(R.font.pretendard_light, weight = FontWeight.Light),
    Font(R.font.pretendard_semibold, weight = FontWeight.SemiBold),
    Font(R.font.pretendard_medium, weight = FontWeight.Medium)
)

val Typography.Normal10: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.Normal,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Medium10: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.Medium,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.SemiBold10: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Bold10: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.Bold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )
val Typography.Normal12: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 12.textDp,
        fontWeight = FontWeight.Normal,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Medium12: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 12.textDp,
        fontWeight = FontWeight.Medium,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.SemiBold12: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 12.textDp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Bold12: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 12.textDp,
        fontWeight = FontWeight.Bold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )
val Typography.Normal14: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 14.textDp,
        fontWeight = FontWeight.Normal,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Medium14: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 14.textDp,
        fontWeight = FontWeight.Medium,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.SemiBold14: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 14.textDp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Bold14: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 14.textDp,
        fontWeight = FontWeight.Bold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )
val Typography.Normal16: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 16.textDp,
        fontWeight = FontWeight.Normal,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Medium16: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 16.textDp,
        fontWeight = FontWeight.Medium,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.SemiBold16: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 16.textDp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Bold16: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 16.textDp,
        fontWeight = FontWeight.Bold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )
val Typography.Normal18: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 18.textDp,
        fontWeight = FontWeight.Normal,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Medium18: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 18.textDp,
        fontWeight = FontWeight.Medium,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.SemiBold18: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )

val Typography.Bold18: TextStyle
    @Composable
    get() = TextStyle(
        fontSize = 10.textDp,
        fontWeight = FontWeight.Bold,
        fontFamily = font,
        platformStyle = PlatformTextStyle(includeFontPadding = false)
    )