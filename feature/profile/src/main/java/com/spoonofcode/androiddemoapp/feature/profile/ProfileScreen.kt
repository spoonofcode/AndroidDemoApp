package com.spoonofcode.androiddemoapp.feature.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.spoonofcode.androiddemoapp.core.ui.theme.AndroidDemoAppTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun ProfileScreen(
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit
) {
    val viewModel = koinViewModel<ProfileViewModel>()
    val viewState by viewModel.stateFlow.collectAsState()

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = popBackStack
        ) {
            Text(text = "Back")
        }

        Button(
            onClick = popUpToLogin
        ) {
            Text(text = "Log Out")
        }

//        Button(
//            onClick = { viewModel.triggerStateFlow() }
//        ) {
//            Text(text = "Test Bartek")
//        }

        Text(text = "ID: ")
        Text(text = viewState.id)
        Text(text = "First name:")
        Text(text = viewState.firstName)
        Text(text = "Last name")
        Text(text = viewState.lastName)


    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    AndroidDemoAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            ProfileScreen(
                popBackStack = {},
                popUpToLogin = {}
            )
        }
    }
}