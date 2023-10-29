package com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.NavRoutes
import com.tomas.repcik.jetpackcompose_animatednavigation.R
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.previews.AllScreenPreview

@Composable
fun RecommendationScreen(
    navController: NavController,
) = IntroCompose(
    navController = navController,
    text = "Recommendation",
    buttonText = R.string.start_app
) {
    navController.navigate(NavRoutes.MainRoute.name) {
        popUpTo(NavRoutes.IntroRoute.name)
    }
}

@AllScreenPreview
@Composable
fun RecommendationScreenPreview() {
    val navController = rememberNavController()
    RecommendationScreen(navController = navController)
}