package com.juhyeon.components.shared.ui.system.combination.calendar

import androidx.compose.ui.graphics.Color
import com.juhyeon.components.shared.ui.system.theme.Black900
import com.juhyeon.components.shared.ui.system.theme.Blue600
import com.juhyeon.components.shared.ui.system.theme.Red500
import java.time.DayOfWeek

enum class CalendarDayOfWeek(val title: String, val color: Color) {
    SUNDAY("일", Red500),
    MONDAY("월", Black900),
    TUESDAY("화", Black900),
    WEDNESDAY("수", Black900),
    THURSDAY("목", Black900),
    FRIDAY("금", Black900),
    SATURDAY("토", Blue600)
}

fun DayOfWeek.toCalendarDayOfWeek(): CalendarDayOfWeek = when (this) {
    DayOfWeek.SUNDAY -> CalendarDayOfWeek.SUNDAY
    DayOfWeek.MONDAY -> CalendarDayOfWeek.MONDAY
    DayOfWeek.TUESDAY -> CalendarDayOfWeek.TUESDAY
    DayOfWeek.WEDNESDAY -> CalendarDayOfWeek.WEDNESDAY
    DayOfWeek.THURSDAY -> CalendarDayOfWeek.THURSDAY
    DayOfWeek.FRIDAY -> CalendarDayOfWeek.FRIDAY
    DayOfWeek.SATURDAY -> CalendarDayOfWeek.SATURDAY
}