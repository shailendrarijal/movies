package com.example.movie.service

import com.example.movie.repository.MovieRepository
import jakarta.persistence.*
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service
class MovieService(
    private val movieRepository: MovieRepository
) {
    fun getMovie(id: Long): Optional<Movie>? {
        return movieRepository.findById(id)
    }

    fun getMovieName(name: String): Optional<Movie>? {
        return movieRepository.findByMovieName(name)
    }
}

@Entity
@Table(name="movies", schema="public")
data class Movie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val movieName: String,
    val releaseYear: LocalDate,
    val stars: List<String>,
    val wasSuperhit: Boolean
)