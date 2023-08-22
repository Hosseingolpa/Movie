package com.task.movie.remote

import com.task.movie.data.source.MovieRemoteSource
import com.task.movie.remote.service.MovieService
import javax.inject.Inject

class MovieRemoteSourceImpl @Inject constructor(
    private val movieService: MovieService,
): MovieRemoteSource {
}