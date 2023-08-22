package com.task.movie.remote.mapper

import com.task.movie.data.model.Rating
import com.task.movie.remote.model.RatingRemote

fun RatingRemote.mapToMovie(): Rating {
    return Rating(
        source = source,
        value = value
    )
}