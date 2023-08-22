package com.task.movie.data.source

import com.task.movie.cache.model.MovieCache
import com.task.movie.data.model.Movie

interface MovieCacheSource {

    suspend fun getMovieList(): List<Movie>

    suspend fun saveMovies(movies: List<MovieCache>)
}