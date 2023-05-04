package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.PopularArtistApiResponse
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getMovies(): Response<PopularArtistApiResponse>
}