package com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.previews.AllScreenPreview
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.theme.AppAnimatedNavigationExample
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.IntroNavOption


@Composable
fun MotivationScreen(navController: NavController) = IntroCompose(
    navController = navController,
    text = "Motivation"
) {
    navController.navigate(IntroNavOption.RecommendationScreen.name)
}

@AllScreenPreview
@Composable
fun MotivationPrivacyPreview() {
    val navController = rememberNavController()
    AppAnimatedNavigationExample {
        MotivationScreen(navController = navController)
    }
}

