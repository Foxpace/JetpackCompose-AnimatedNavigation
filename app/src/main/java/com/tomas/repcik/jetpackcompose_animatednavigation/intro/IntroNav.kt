package com.tomas.repcik.jetpackcompose_animatednavigation.intro

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.tomas.repcik.jetpackcompose_animatednavigation.NavRoutes
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables.MotivationScreen
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables.RecommendationScreen
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables.WelcomeScreen

fun NavGraphBuilder.introGraph(navController: NavController) {
    navigation(
        startDestination = IntroNavOption.WelcomeScreen.name, route = NavRoutes.IntroRoute.name
    ) {
        composable(IntroNavOption.WelcomeScreen.name, enterTransition = {
            return@composable fadeIn(tween(1000))
        }, exitTransition = {
            return@composable fadeOut(tween(700))
        }, popEnterTransition = {
            return@composable slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.End, tween(700)
            )
        }) {
            WelcomeScreen(navController)
        }
        composable(
            IntroNavOption.MotivationScreen.name,
            enterTransition = {
                return@composable slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
                )
            },
            popExitTransition = {
                return@composable slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.End, tween(700)
                )
            },
        ) {
            MotivationScreen(navController)
        }
        composable(IntroNavOption.RecommendationScreen.name, enterTransition = {
            return@composable expandIn(tween(700))
        }, exitTransition = {
            return@composable shrinkOut(tween(700))
        }, popExitTransition = { return@composable shrinkOut() }) {
            RecommendationScreen(navController)
        }
    }
}

enum class IntroNavOption {
    WelcomeScreen, MotivationScreen, RecommendationScreen
}
