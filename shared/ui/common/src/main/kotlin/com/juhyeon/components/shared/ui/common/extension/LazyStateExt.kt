package com.juhyeon.components.shared.ui.common.extension

import androidx.compose.foundation.gestures.stopScroll
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState

fun LazyGridState.isScrolledToEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1

fun LazyGridState.isFirstItem() =
    firstVisibleItemIndex == 0

fun LazyListState.isScrolledToEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1

fun LazyListState.isFirstItem() =
    firstVisibleItemIndex == 0

suspend fun LazyListState.safetyAnimateScrollToTop() = run {
    this.stopScroll()

    if (!this.isScrollInProgress) {
        this.animateScrollToItem(0)
    }
}