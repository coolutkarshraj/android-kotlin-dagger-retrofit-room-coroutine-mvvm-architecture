package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

interface MovieCacheDataSource {

    suspend fun getMoviesFromCase(): List<Movies>
    suspend fun saveMoviesToCase(movies:List<Movies>)

}