package com.task.movie.data.datastore

import com.task.movie.data.model.Movie
import com.task.movie.data.source.MovieCacheSource
import javax.inject.Inject

class MovieCacheDataStore @Inject constructor(
    private val movieCacheSource: MovieCacheSource
): MovieDataStore {
    override suspend fun getMovieList(): List<Movie> {
        TODO("Not yet implemented")
    }
}