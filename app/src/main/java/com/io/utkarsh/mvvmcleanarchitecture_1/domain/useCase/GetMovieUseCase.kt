package com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movies>? = movieRepository.getMovies()
}