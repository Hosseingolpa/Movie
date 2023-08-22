package com.task.movie.data.model

data class MovieDetail(
    val title: String,
    val year: String,
    val rated: String,
    val released: String,
    val runtime: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val country: String,
    val awards: String,
    val poster: String,
    val metaScore: String,
    val imdbRating: String,
    val imdbVotes: String,
    val imdbID: String,
    val type: String,
    val dvd: String,
    val boxOffice: String,
    val rating: List<Rating>
)