package com.spoonofcode.androiddemoapp.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.spoonofcode.androiddemoapp.core.ui.theme.AndroidDemoAppTheme

@Composable
fun HomeScreen(
    navigateToProfile: (Int, Boolean) -> Unit,
    navigateToSearch: (String) -> Unit,
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit,
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home Screen", fontSize = 40.sp)

        Button(
            onClick = { navigateToProfile(7, true) }
        ) {
            Text(text = "Profile")
        }

        Button(
            onClick = { navigateToSearch("Example query") }
        ) {
            Text(text = "Search")
        }

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
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    AndroidDemoAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            HomeScreen(
                navigateToProfile = { _, _ -> },
                navigateToSearch = {},
                popBackStack = {},
                popUpToLogin = {})
        }
    }
}