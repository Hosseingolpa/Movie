package com.task.movie.presentation

import com.task.movie.base.BaseViewModel
import com.task.movie.ui.screen.movielist.model.MovieListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor() : BaseViewModel<MovieListState>() {

    override val viewModelState: MutableStateFlow<MovieListState> =
        MutableStateFlow(MovieListState())

}