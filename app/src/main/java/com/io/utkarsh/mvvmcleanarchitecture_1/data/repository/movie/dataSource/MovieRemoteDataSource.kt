package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.MovieApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieApiResponse>
}