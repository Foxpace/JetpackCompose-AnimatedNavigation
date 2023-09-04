package com.tomas.repcik.jetpackcompose_animatednavigation.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.previews.AllScreenPreview
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.theme.AppAnimatedNavigationExample
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.IntroNavOption

@Composable
fun WelcomeScreen(navController: NavController = rememberNavController()) = IntroCompose(
    navController = navController,
    text = "Welcome",
    showBackButton = false
) {
    navController.navigate(IntroNavOption.MotivationScreen.name)
}


@AllScreenPreview
@Composable
fun WelcomeScreenPreview() {
    AppAnimatedNavigationExample {
        WelcomeScreen()
    }
}

