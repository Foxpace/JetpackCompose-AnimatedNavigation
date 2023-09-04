package com.tomas.repcik.jetpackcompose_animatednavigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.tomas.repcik.jetpackcompose_animatednavigation.about.AboutScreen
import com.tomas.repcik.jetpackcompose_animatednavigation.home.HomeScreen
import com.tomas.repcik.jetpackcompose_animatednavigation.settings.SettingsScreen

fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    navigation(startDestination = MainNavOption.HomeScreen.name, route = NavRoutes.MainRoute.name) {
        composable(MainNavOption.HomeScreen.name){
            HomeScreen(navController)
        }
        composable(MainNavOption.SettingsScreen.name){
            SettingsScreen(navController)
        }
        composable(MainNavOption.AboutScreen.name){
            AboutScreen(navController)
        }
    }
}

enum class MainNavOption {
    HomeScreen,
    AboutScreen,
    SettingsScreen,
}
