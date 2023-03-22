package com.spoonofcode.androiddemoapp.feature.search

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.spoonofcode.androiddemoapp.core.ui.theme.AndroidDemoAppTheme

@Composable
fun SearchScreen(
    query: String?,
    popBackStack: () -> Unit,
    popUpToLogin: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Search Screen", fontSize = 40.sp)

        Spacer(modifier = Modifier.height(5.dp))
        Text("Query: $query", fontSize = 40.sp)

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
            SearchScreen(
                query = "Example query",
                popBackStack = {},
                popUpToLogin = {}
            )
        }
    }
}