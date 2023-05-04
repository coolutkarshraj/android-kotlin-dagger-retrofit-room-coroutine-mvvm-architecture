package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDb(): List<TvShows>

    suspend fun saveMoviesTODb(movies:List<TvShows>)

    suspend fun clearAll()
}