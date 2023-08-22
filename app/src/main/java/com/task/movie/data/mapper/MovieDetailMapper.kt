package com.task.movie.data.mapper

import com.task.movie.cache.model.MovieDetailCache
import com.task.movie.data.model.MovieDetail

fun MovieDetail.mapToMovieDetailCache(): MovieDetailCache {
    return MovieDetailCache(
        title = title,
        year = year,
        rated = rated,
        released = released,
        runtime = runtime,
        genre = genre,
        director = director,
        actors = actors,
        plot = plot,
        country = country,
        awards = awards,
        poster = poster,
        metaScore = metaScore,
        imdbRating = imdbRating,
        imdbVotes = imdbVotes,
        id = imdbID,
        type = type,
        dvd = dvd,
        boxOffice = boxOffice,
        rating = rating.map { it.mapToRatingCache() },
    )
}