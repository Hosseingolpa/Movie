package com.task.movie.ui.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.task.movie.ui.navigation.MovieScreen.SPLASH_SCREEN


class MovieNavigationActions(private val navController: NavHostController) {

    fun navigatesToSplash() {
        navController.navigate(
            route = SPLASH_SCREEN
        ) {
            this.popUpTo(id = navController.graph.findStartDestination().id) {
//                inclusive = true
//                saveState = true
            }

            launchSingleTop = true
//            restoreState = true
        }
    }

}