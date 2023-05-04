package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.PopularArtistApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShowApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.ArtistRepository
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.MovieRepository

class PopularArtistRepositoryImpl(
    private val artistCacheDataSource: ArtistCacheDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistRemoteDataSource: ArtistRemoteDataSource
) : ArtistRepository {
    override suspend fun getArtist(): List<Artist>? {
       return getArtistFromCache()
    }

    override suspend fun updateArtist(): List<Artist>? {
        val artistList: List<Artist> = getTvShowFromApi()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistsTODb(artistList)
        artistCacheDataSource.saveArtistToCase(artistList)
        return artistList
    }


    private suspend fun getTvShowFromApi(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            val response = artistRemoteDataSource.getMovies()
            val body: PopularArtistApiResponse? = response.body()
            if (body != null) {
                artistList = body.artists
            }
        } catch (e: Exception) {
            println(e)
        }
        return artistList

    }

    private suspend fun getTvShowFromLocalDb(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            artistList = artistLocalDataSource.getArtistsFromDb()

        } catch (e: Exception) {
            println(e)
        }
        if (artistList.isNotEmpty()) {
            return artistList
        } else {
            artistList = getTvShowFromApi()
            artistLocalDataSource.saveArtistsTODb(artistList)
            return artistList
        }

    }

    private suspend fun getArtistFromCache(): List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            artistList = artistCacheDataSource.getPopularArtistFromCase()
        } catch (e: Exception) {
            println(e)
        }
        if (artistList.isNotEmpty()) {
            return artistList
        } else {
            artistList = getTvShowFromLocalDb()
            artistCacheDataSource.saveArtistToCase(artistList)
            return artistList
        }

    }

}