package com.spoonofcode.androiddemoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.spoonofcode.androiddemoapp.core.navigation.NavRoute
import com.spoonofcode.androiddemoapp.feature.home.HomeScreen
import com.spoonofcode.androiddemoapp.feature.login.LoginScreen
import com.spoonofcode.androiddemoapp.feature.profile.ProfileScreen
import com.spoonofcode.androiddemoapp.feature.search.SearchScreen

@Composable
fun NavGraph(modifier: Modifier = Modifier, navController: NavHostController) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavRoute.Login.path
    ) {
        addLoginScreen(navController, this)

        addHomeScreen(navController, this)

        addProfileScreen(navController, this)

        addSearchScreen(navController, this)
    }
}

private fun addLoginScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Login.path) {
        LoginScreen(
            navigateToHome = {
                navController.navigate(NavRoute.Home.path)
            }
        )
    }
}

private fun addHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {

        HomeScreen(
            navigateToProfile = { id, showDetails ->
                navController.navigate(NavRoute.Profile.withArgs(id.toString(), showDetails.toString()))
            },
            navigateToSearch = { query ->
                navController.navigate(NavRoute.Search.withArgs(query))
            },
            popBackStack = { navController.popBackStack() },
            popUpToLogin= { popUpToLogin(navController) },
        )
    }
}

private fun popUpToLogin(navController: NavHostController) {
    navController.popBackStack(NavRoute.Login.path, inclusive = false)
}

private fun addProfileScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Profile.withArgsFormat(NavRoute.Profile.id, NavRoute.Profile.showDetails),
        arguments = listOf(
            navArgument(NavRoute.Profile.id) {
                type = NavType.IntType
            }
            ,
            navArgument(NavRoute.Profile.showDetails) {
                type = NavType.BoolType
            }
        )
    ) { navBackStackEntry ->

        val args = navBackStackEntry.arguments

        ProfileScreen(
            popBackStack = { navController.popBackStack() },
            popUpToLogin = { popUpToLogin(navController) }
        )
    }
}

private fun addSearchScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(
        route = NavRoute.Search.withArgsFormat(NavRoute.Search.query),
        arguments = listOf(
            navArgument(NavRoute.Search.query) {
                type = NavType.StringType
                nullable = true
            }
        )
    ) { navBackStackEntry ->

        val args = navBackStackEntry.arguments

        SearchScreen(
            query = args?.getString(NavRoute.Search.query),
            popBackStack = { navController.popBackStack() },
            popUpToLogin = { popUpToLogin(navController) }
        )
    }
}
