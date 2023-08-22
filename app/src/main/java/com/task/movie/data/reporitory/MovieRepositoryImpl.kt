package com.task.movie.data.reporitory

import com.task.movie.data.datastore.MovieCacheDataStore
import com.task.movie.data.datastore.MovieRemoteDataStore
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val remoteDataStore: MovieRemoteDataStore,
    private val cacheDataStore: MovieCacheDataStore,
): MovieRepository {
}