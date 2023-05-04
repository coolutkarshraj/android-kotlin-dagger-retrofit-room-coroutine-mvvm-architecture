package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.PopularArtistDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: PopularArtistDao) : ArtistLocalDataSource{
    override suspend fun getArtistsFromDb(): List<Artist> = artistDao.getALlArtist()

    override suspend fun saveArtistsTODb(artists: List<Artist>) {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.insertArtist(artists)
       }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteAllArtist()
       }
    }
}