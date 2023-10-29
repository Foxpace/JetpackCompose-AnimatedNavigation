package com.tomas.repcik.jetpackcompose_animatednavigation

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.introGraph
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.theme.AppAnimatedNavigationExample


@Composable
fun MainCompose(
    navController: NavHostController = rememberNavController(),
) {
    AppAnimatedNavigationExample {
        Surface {
            NavHost(
                navController,
                startDestination = NavRoutes.IntroRoute.name
            ) {
                introGraph(navController)
                mainGraph(navController)
            }
        }
    }
}

enum class NavRoutes {
    IntroRoute,
    MainRoute,
}

@Preview
@Composable
fun MainActivityPreview() {
    MainCompose()
}