package com.juhyeon.components.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

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

    HomeContents()
}

@Composable
private fun HomeContents(

) {

}

@Preview(showBackground = true)
@Composable
private fun HomeContentsPreview() {
    HomeContents()
}