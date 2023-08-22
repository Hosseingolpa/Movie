package com.task.movie.data.datastore

import com.task.movie.data.model.Movie

interface MovieDataStore {

    suspend fun getMovieList(): List<Movie>

    suspend fun saveMovies(movies: List<Movie>)

}