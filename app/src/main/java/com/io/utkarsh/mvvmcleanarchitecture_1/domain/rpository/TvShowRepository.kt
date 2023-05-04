package com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows

interface TvShowRepository {

    suspend fun getTvShows(): List<TvShows>?

    suspend fun updateTvShows(): List<TvShows>?
}