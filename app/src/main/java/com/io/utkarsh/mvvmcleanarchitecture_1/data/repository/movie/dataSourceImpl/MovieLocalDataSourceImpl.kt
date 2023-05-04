package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.MovieDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMoviesFromDb(): List<Movies> = movieDao.getALlMovie()

    override suspend fun saveMoviesTODb(movies: List<Movies>) {
      CoroutineScope(Dispatchers.IO).launch {movieDao.insertMovie(movies)}
    }

    override suspend fun clearAll() {
            CoroutineScope(Dispatchers.IO).launch{
                movieDao.deleteAllMovie()
            }
    }
}