package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowCasheDataSource

class TvShowCacheDataSourceImpl : TvShowCasheDataSource {
    private var tvShowList =  ArrayList<TvShows>()

    override suspend fun getTvShowFromCase(): List<TvShows> {
        return tvShowList
    }

    override suspend fun saveTvShowToCase(tvShow: List<TvShows>) {
        tvShowList = ArrayList(tvShow)
    }
}