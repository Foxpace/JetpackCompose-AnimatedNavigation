package com.tomas.repcik.jetpackcompose_animatednavigation

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.IntroViewModel
import com.tomas.repcik.jetpackcompose_animatednavigation.intro.introGraph
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.theme.AppAnimatedNavigationExample


@Composable
fun MainCompose(
    navController: NavHostController = rememberNavController(),
    vm: IntroViewModel = hiltViewModel()
) {
    AppAnimatedNavigationExample {
        Surface {
            val isOnboarded = vm.isOnboarded.collectAsState()
            NavHost(
                navController,
                startDestination = if (isOnboarded.value) NavRoutes.MainRoute.name else NavRoutes.IntroRoute.name
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