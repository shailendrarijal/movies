package com.example.movie.repository

import com.example.movie.service.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MovieRepository: JpaRepository<Movie, Long> {
    override fun findById(id: Long): Optional<Movie>
    fun findByMovieName(movie_name: String): Optional<Movie>
}