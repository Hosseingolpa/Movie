package com.task.movie.cache

import com.task.movie.cache.dao.MovieDao
import com.task.movie.data.source.MovieCacheSource
import javax.inject.Inject

class MovieCacheSourceImpl @Inject constructor(
    private val movieDao: MovieDao,
): MovieCacheSource {
}