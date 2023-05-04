package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var  movieList = ArrayList<Movies>()
    override suspend fun getMoviesFromCase(): List<Movies> {
        return movieList
    }

    override suspend fun saveMoviesToCase(movies: List<Movies>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}