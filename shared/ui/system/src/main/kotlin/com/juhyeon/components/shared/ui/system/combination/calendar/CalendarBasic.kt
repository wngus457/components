package com.juhyeon.components.shared.ui.system.combination.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import java.time.LocalDate

@Composable
fun CalendarBasic(
    baseDate: LocalDate,
    selectedDate: LocalDate,
    firstDayOfWeek: Int,
    onPrevMonthClick: () -> Unit,
    onNextMonthClick: () -> Unit,
    onSelectedDate: (LocalDate) -> Unit
) {
    Column {

    }
}