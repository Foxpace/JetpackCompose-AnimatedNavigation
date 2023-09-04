package com.tomas.repcik.jetpackcompose_animatednavigation.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.previews.AllScreenPreview
import com.tomas.repcik.jetpackcompose_animatednavigation.ui.theme.AppAnimatedNavigationExample

@Composable
fun SettingsScreen(navController: NavHostController) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Settings")
        }
    }
}

@AllScreenPreview
@Composable
fun SettingsScreenPreview() {
    AppAnimatedNavigationExample {
        SettingsScreen(rememberNavController())
    }
}