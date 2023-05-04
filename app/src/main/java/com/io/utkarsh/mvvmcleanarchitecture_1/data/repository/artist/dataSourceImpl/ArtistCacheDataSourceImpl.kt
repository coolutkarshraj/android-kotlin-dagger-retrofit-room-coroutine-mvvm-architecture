package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {
    private var artistList =  ArrayList<Artist>()
    override suspend fun getPopularArtistFromCase(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistToCase(artist: List<Artist>) {
        artistList = ArrayList(artist)
    }
}