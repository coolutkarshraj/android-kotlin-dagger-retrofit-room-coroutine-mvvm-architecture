package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.MovieApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.MovieRepository

class MovieRepositoryImp(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {
    override suspend fun getMovies(): List<Movies>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movies>? {
        val newListOfMovie : List<Movies> = getMoviesFromApi()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesTODb(newListOfMovie)
        movieCacheDataSource.saveMoviesToCase(newListOfMovie)
        return newListOfMovie
    }

    private suspend fun getMoviesFromApi(): List<Movies> {
        lateinit var movieList: List<Movies>
        try {
            val response = movieRemoteDataSource.getMovies()
            val body: MovieApiResponse? = response.body()
            if (body != null) {
                movieList = body.movies
            }
        } catch (e: Exception) {
            println(e)
        }
        return movieList
    }

    private suspend fun getMoviesFromDB(): List<Movies> {
        lateinit var movieList: List<Movies>
        try {
         movieList = movieLocalDataSource.getMoviesFromDb()
        } catch (e: Exception) {
            println(e)
        }
        if(movieList.isNotEmpty()){
            return movieList
        }else{
            movieList = getMoviesFromApi()
            movieLocalDataSource.saveMoviesTODb(movieList)
        }
        return movieList
    }

    private suspend fun getMoviesFromCache(): List<Movies> {
        lateinit var movieList: List<Movies>
        try {
            movieList = movieCacheDataSource.getMoviesFromCase()
        } catch (e: Exception) {

        }
        if(movieList.isNotEmpty()){
            return movieList
        }else{
            movieList = getMoviesFromDB()
            movieLocalDataSource.saveMoviesTODb(movieList)
        }
        return movieList
    }
}