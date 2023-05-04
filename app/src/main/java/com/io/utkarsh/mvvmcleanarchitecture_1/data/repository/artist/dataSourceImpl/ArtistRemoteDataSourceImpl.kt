package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.api.TMDBService
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.PopularArtistApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDataSource {
    override suspend fun getMovies(): Response<PopularArtistApiResponse> {
        return tmdbService.getPopularArtist(apiKey)
    }
}