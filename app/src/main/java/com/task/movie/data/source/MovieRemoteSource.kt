package com.task.movie.data.source

import com.task.movie.data.model.Movie

interface MovieRemoteSource {

    suspend fun getMovieList(): List<Movie>

}