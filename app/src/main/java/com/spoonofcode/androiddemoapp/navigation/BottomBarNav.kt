package com.spoonofcode.androiddemoapp.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.spoonofcode.androiddemoapp.core.navigation.NavRoute

@Composable
fun BottomBarNav(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if (currentRoute == null || currentRoute == NavRoute.Login.path) {
        return
    }

    BottomNavigation {

        val homeSelected = currentRoute == NavRoute.Home.path
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = NavRoute.Home.path
                )
            },
            selected = homeSelected,
            onClick = {
                if(!homeSelected) {
                    navController.navigate(NavRoute.Home.path) {
                        popUpTo(NavRoute.Home.path) { inclusive = true }
                    }
                }
            },
            label = {Text(NavRoute.Home.path)}
        )

        val searchSelected =  currentRoute == NavRoute.Search.withArgsFormat(NavRoute.Search.query)
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = NavRoute.Home.path
                )
            },
            selected = searchSelected,
            onClick = {
                if(!searchSelected) {
                    navController.navigate(NavRoute.Search.withArgs("Liang Moi"))
                }
            },
            label = { Text(NavRoute.Search.path) }
        )
    }
}