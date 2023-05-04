package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows

interface TvShowCasheDataSource {

    suspend fun getTvShowFromCase(): List<TvShows>
    suspend fun saveTvShowToCase(movies:List<TvShows>)

}