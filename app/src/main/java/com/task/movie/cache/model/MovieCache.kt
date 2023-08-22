package com.task.movie.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class MovieCache(
    @PrimaryKey(autoGenerate = true)
    val id: Int
)
