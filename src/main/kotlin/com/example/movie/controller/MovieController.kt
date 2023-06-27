package com.example.movie.controller

import com.example.movie.service.Movie
import com.example.movie.service.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/movies")
class MovieController(
    private val movieService: MovieService
){

    // Controller -> Service (business logics) -> Repository (call database)
    @GetMapping("/movie/{id}")
    fun getMovie(@PathVariable id: Long): Optional<Movie>? {
        return movieService.getMovie(id)
    }

    @GetMapping("/movie/name/{name}")
    fun getMovieName(@PathVariable name: String): Optional<Movie>? {
        return movieService.getMovieName(name)
    }

//    @GetMapping("/topmovies")
//    fun getRecommendedMovies() {
//        //returns the top 10 recommended movies
//    }
}


