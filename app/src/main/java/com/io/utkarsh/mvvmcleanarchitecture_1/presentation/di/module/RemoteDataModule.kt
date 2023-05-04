package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import com.io.utkarsh.mvvmcleanarchitecture_1.data.api.TMDBService
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl.ArtistRemoteDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl.MovieRemoteDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey:String) {

    @Singleton
    @Provides
    fun provideMovieDataSource(tmdbService: TMDBService): MovieRemoteDataSource{
        return  MovieRemoteDataSourceImpl(tmdbService,apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistDataSource(tmdbService: TMDBService): ArtistRemoteDataSource{
        return  ArtistRemoteDataSourceImpl(tmdbService,apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowDataSource(tmdbService: TMDBService): TvShowRemoteDataSource{
        return  TvShowRemoteDataSourceImpl(tmdbService,apiKey)
    }
}