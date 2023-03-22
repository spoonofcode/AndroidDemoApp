package com.spoonofcode.androiddemoapp.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.spoonofcode.androiddemoapp.navigation.NavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = NavRoute.Login.route) {
//        composable(route = NavRoute.Login.route) {
//            LoginScreen(navController = navController)
//        }
//        composable(
//            route = NavRoute.Dashboard.route + "/{name}",
//            arguments = listOf(
//                navArgument("name") {
//                    type = NavType.StringType
//                    defaultValue = "Bartek"
//                    nullable = true
//                }
//            )
//        ) { navBackStackEntry ->
//            DashboardScreen(name = navBackStackEntry.arguments?.getString("name"))
//        }

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