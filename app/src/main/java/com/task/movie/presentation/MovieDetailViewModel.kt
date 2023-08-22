package com.task.movie.presentation

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.google.gson.Gson
import com.task.movie.base.BaseViewModel
import com.task.movie.data.reporitory.MovieRepository
import com.task.movie.ui.navigation.MovieDestinationsArgs
import com.task.movie.ui.screen.moviedetail.model.MovieDetailState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val movieRepository: MovieRepository,
    private val gson: Gson,
    savedStateHandle: SavedStateHandle
) : BaseViewModel<MovieDetailState>() {

    private val movieId: String? = savedStateHandle[MovieDestinationsArgs.MOVIE_ID_ARG]

    override val viewModelState: MutableStateFlow<MovieDetailState> =
        MutableStateFlow(MovieDetailState())

    init {
        Log.d("hossein", " $movieId")
    }

}