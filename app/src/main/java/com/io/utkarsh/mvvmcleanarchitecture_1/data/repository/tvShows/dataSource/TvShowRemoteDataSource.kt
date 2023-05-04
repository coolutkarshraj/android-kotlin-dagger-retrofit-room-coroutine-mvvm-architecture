package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.MovieApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShowApiResponse
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getMovies(): Response<TvShowApiResponse>
}