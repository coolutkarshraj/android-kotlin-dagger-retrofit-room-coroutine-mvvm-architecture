package com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

interface MovieRepository {

    suspend fun getMovies(): List<Movies>?

    suspend fun updateMovies(): List<Movies>?
}