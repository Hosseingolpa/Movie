package com.task.movie.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.task.movie.cache.model.MovieCache

@Dao
interface MovieDao {

    @Insert
    suspend fun saveMovies(movies: List<MovieCache>)

    @Query("SELECT * FROM movie")
    suspend fun getMovieList(): List<MovieCache>

}