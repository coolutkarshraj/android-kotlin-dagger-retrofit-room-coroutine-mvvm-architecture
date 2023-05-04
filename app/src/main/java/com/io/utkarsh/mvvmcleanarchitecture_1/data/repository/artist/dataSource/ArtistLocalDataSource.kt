package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDb(): List<Artist>

    suspend fun saveArtistsTODb(movies:List<Artist>)

    suspend fun clearAll()
}