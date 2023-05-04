package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di

import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists.ArtistSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies.MoviesSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows.TvShowSubComponent

interface Injector {
    fun createMoviesSubComponent():MoviesSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent
}