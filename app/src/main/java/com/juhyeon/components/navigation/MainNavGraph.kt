package com.juhyeon.components.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.juhyeon.components.network.NetworkContract
import com.juhyeon.components.network.NetworkViewModel

@Composable
fun MainNavGraph(
    navController: NavHostController,
    networkViewModel: NetworkViewModel = hiltViewModel()
) {
    val networkState = networkViewModel.stateFlow.collectAsState().value.networkState
    val isNetworkErrorModalVisible = remember { mutableStateOf(false) }

    when (networkState) {
        is NetworkContract.NetworkState.DisConnected -> isNetworkErrorModalVisible.value = true
        else -> isNetworkErrorModalVisible.value = false
    }

}