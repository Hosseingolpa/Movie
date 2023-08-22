package com.task.movie.data.reporitory

import com.task.movie.data.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    suspend fun getMovieList(): Flow<Result<List<Movie>>>

}