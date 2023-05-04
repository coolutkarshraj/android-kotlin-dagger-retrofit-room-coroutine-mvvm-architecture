package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.api.TMDBService
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.MovieApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieApiResponse> {
        return tmdbService.getPopularMovies(apiKey)
    }
}