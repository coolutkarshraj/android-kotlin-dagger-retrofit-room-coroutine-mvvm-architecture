package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.api.TMDBService
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.PopularArtistApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShowApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDataSource {
    override suspend fun getMovies(): Response<TvShowApiResponse> {
       return tmdbService.getPopularTVShows(apiKey)
    }

}