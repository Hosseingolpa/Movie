package com.task.movie.data.reporitory

import com.task.movie.data.datastore.MovieCacheDataStore
import com.task.movie.data.datastore.MovieRemoteDataStore
import com.task.movie.util.apiCall
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val remoteDataStore: MovieRemoteDataStore,
    private val cacheDataStore: MovieCacheDataStore,
): MovieRepository {
    override suspend fun getMovieList() = flow {
        val remoteResult = apiCall { remoteDataStore.getMovieList() }
        emit(remoteResult)
    }

}