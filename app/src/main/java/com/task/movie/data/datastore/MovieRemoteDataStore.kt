package com.task.movie.data.datastore

import com.task.movie.data.source.MovieRemoteSource
import javax.inject.Inject

class MovieRemoteDataStore @Inject constructor(
    private val movieRemoteSource: MovieRemoteSource
): MovieDataStore {
}