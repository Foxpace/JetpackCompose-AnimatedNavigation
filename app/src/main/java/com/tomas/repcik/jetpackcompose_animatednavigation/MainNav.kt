package com.tomas.repcik.jetpackcompose_animatednavigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.tomas.repcik.jetpackcompose_animatednavigation.home.HomeScreen

fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    navigation(startDestination = MainNavOption.HomeScreen.name, route = NavRoutes.MainRoute.name) {
        composable(MainNavOption.HomeScreen.name, enterTransition = {
            return@composable slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Up,
                tween(2000)
            )
        }) {
            HomeScreen(navController)
        }
    }
}

enum class MainNavOption {
    HomeScreen
}
