package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getPopularArtistFromCase(): List<Artist>
    suspend fun saveArtistToCase(movies:List<Artist>)

}