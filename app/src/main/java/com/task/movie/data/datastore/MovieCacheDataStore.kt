package com.task.movie.data.datastore

import com.task.movie.data.mapToMovieCache
import com.task.movie.data.model.Movie
import com.task.movie.data.model.MovieDetail
import com.task.movie.data.source.MovieCacheSource
import javax.inject.Inject

class MovieCacheDataStore @Inject constructor(
    private val movieCacheSource: MovieCacheSource
): MovieDataStore {
    override suspend fun getMovieList(): List<Movie> {
        return movieCacheSource.getMovieList()
    }

    override suspend fun saveMovies(movies: List<Movie>) {
        val moviesCache = movies.map { it.mapToMovieCache() }
        return movieCacheSource.saveMovies(movies = moviesCache)
    }

    override suspend fun getMovieDetail(movieId: String): MovieDetail {
        TODO("Not yet implemented")
    }
}