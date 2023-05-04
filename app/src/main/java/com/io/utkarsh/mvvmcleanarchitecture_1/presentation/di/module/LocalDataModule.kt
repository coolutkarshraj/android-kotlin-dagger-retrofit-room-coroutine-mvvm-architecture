package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.MovieDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.PopularArtistDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.TvShowDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl.ArtistLocalDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl.MovieLocalDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMoveLocalDataSources(moviesDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(moviesDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSources(artistDao: PopularArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }
    @Singleton
    @Provides
    fun provideTvShowsLocalDataSources(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }
}