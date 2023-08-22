package com.task.movie.remote

import com.task.movie.data.model.Movie
import com.task.movie.data.source.MovieRemoteSource
import com.task.movie.remote.mapper.mapToMovie
import com.task.movie.remote.service.MovieService
import javax.inject.Inject

class MovieRemoteSourceImpl @Inject constructor(
    private val movieService: MovieService,
): MovieRemoteSource {
    override suspend fun getMovieList(): List<Movie> {
        val result = movieService.getMovieList()
        return result.listMovies.map { it.mapToMovie() }
    }

}