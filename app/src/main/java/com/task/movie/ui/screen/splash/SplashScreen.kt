package com.task.movie.ui.screen.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.task.movie.ui.screen.splash.model.SplashState
import com.task.movie.ui.theme.MovieTheme

@Preview
@Composable
fun SplashScreenPreview() {
    MovieTheme {
        SplashScreen(
            state = fakeSplashState,
            navigateToNextScreen = {},
        )
    }
}

private val fakeSplashState = SplashState(
    finishSplashScreen = false
)

@Composable
fun SplashScreen(
    state: SplashState,
    navigateToNextScreen: () -> Unit,
) {

    LaunchedEffect(key1 = state.finishSplashScreen) {
        if (state.finishSplashScreen) {
            navigateToNextScreen()
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.background
        )
    ) {

    }

}