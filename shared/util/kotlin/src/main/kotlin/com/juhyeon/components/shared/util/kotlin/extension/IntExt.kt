package com.juhyeon.components.shared.util.kotlin.extension

import java.text.DecimalFormat

fun Int.formatToTime(): String = "${(this / 60).toString().padStart(2, '0')}:${(this % 60).toString().padStart(2, '0')}"
fun Int.applyCommaFormat(): String = DecimalFormat("###,###").format(this)