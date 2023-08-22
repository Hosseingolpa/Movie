package com.task.movie.ui.screen.moviedetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.task.movie.ui.screen.moviedetail.model.MovieDetailState
import com.task.movie.ui.theme.MovieTheme

@Preview
@Composable
fun SplashScreenPreview() {
    MovieTheme {
        MovieDetailScreen(
            state = fakeMovieDetailState,
        )
    }
}

private val fakeMovieDetailState = MovieDetailState()

@Composable
fun MovieDetailScreen(
    state: MovieDetailState,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {

        Text(text = "Movie Detail")

    }

}