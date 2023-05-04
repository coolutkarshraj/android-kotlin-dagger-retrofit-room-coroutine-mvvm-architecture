package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

interface MovieLocalDataSource {

    suspend fun getMoviesFromDb(): List<Movies>

    suspend fun saveMoviesTODb(movies:List<Movies>)

    suspend fun clearAll()
}