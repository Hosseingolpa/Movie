package com.task.movie.data.datastore

import com.task.movie.data.model.Movie
import com.task.movie.data.source.MovieRemoteSource
import javax.inject.Inject

class MovieRemoteDataStore @Inject constructor(
    private val movieRemoteSource: MovieRemoteSource
): MovieDataStore {
    override suspend fun getMovieList(): List<Movie> {
        return movieRemoteSource.getMovieList()
    }

    override suspend fun saveMovies(movies: List<Movie>) {
        throw UnsupportedOperationException("Save movies unsupported on remote")
    }

}