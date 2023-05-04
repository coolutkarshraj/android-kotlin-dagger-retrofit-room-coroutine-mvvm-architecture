package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSourceImpl.ArtistCacheDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSourceImpl.MovieCacheDataSourceImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowCasheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun providesMovesCache(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun providesArtistCache(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun providesTvShowCache(): TvShowCasheDataSource {
        return TvShowCacheDataSourceImpl()
    }
}