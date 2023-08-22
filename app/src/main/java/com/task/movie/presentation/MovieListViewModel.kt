package com.task.movie.presentation

import android.util.Log
import com.task.movie.base.BaseViewModel
import com.task.movie.data.reporitory.MovieRepository
import com.task.movie.ui.screen.movielist.model.MovieListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) : BaseViewModel<MovieListState>() {

    override val viewModelState: MutableStateFlow<MovieListState> =
        MutableStateFlow(MovieListState())

    init {
        getMovieList()
    }

    private fun getMovieList() {
        getData(
            action = {
                movieRepository.getMovieList()
            },
            onLoadingAction = {
                Log.d("hossein", "getMovieList: loading")
            },
            onSuccessAction = {
                Log.d("hossein", "getMovieList: $it")
            },
            onErrorAction = {
                Log.d("hossein", "getMovieList: $it")
            }
        )
    }
}