package com.juhyeon.components.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.juhyeon.components.shared.ui.system.theme.White100

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val state = homeViewModel.stateFlow.collectAsState().value
    val postEvent = homeViewModel.eventHandler

    LaunchedEffect(true) {
        homeViewModel.effectFlow.collect { effect ->
            when (effect) {
                is HomeContract.Effect.NavigateToBack -> navController.popBackStack()
            }
        }
    }

    HomeContents(
        state = state
    )
}

@Composable
private fun HomeContents(
    state: HomeContract.State
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White100)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeContentsPreview() {
    HomeContents(
        state = HomeContract.State
    )
}