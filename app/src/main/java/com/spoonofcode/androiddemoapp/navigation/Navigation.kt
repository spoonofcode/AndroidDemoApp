package com.spoonofcode.androiddemoapp.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBarNav(navController = navController) }
    ) { paddingValues ->
        NavGraph(
            modifier = Modifier.padding(
                bottom = paddingValues.calculateBottomPadding()
            ),
            navController = navController
        )
    }
}