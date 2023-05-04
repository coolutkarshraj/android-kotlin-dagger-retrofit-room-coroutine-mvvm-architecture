package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.PopularArtistDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.TvShowDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvShowDao: TvShowDao) : TvShowLocalDataSource{


    override suspend fun getTvShowsFromDb(): List<TvShows>  = tvShowDao.getALlTvShow()

    override suspend fun saveMoviesTODb(tvShow: List<TvShows>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.insertTvShow(tvShow)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           tvShowDao.deleteTvShow()
       }
    }
}