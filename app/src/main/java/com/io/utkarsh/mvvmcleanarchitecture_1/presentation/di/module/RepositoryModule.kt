package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.PopularArtistRepositoryImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.artist.dataSource.ArtistRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.MovieRepositoryImp
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieCacheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.movie.dataSource.MovieRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.TvShowRepositoryImpl
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowCasheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.ArtistRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun providesMovieRepository(movieRemoteDataSource: MovieRemoteDataSource,
    movieLocalDataSource: MovieLocalDataSource,movieCacheDataSource: MovieCacheDataSource):MovieRepositoryImp{
        return MovieRepositoryImp(movieRemoteDataSource,movieLocalDataSource,movieCacheDataSource)

    }

    @Singleton
    @Provides
    fun providesArtistRepository(artistRemoteDataSource: ArtistRemoteDataSource,
                                artistLocalDataSource: ArtistLocalDataSource,
                                 artistCacheDataSource: ArtistCacheDataSource):PopularArtistRepositoryImpl{
        return PopularArtistRepositoryImpl(artistCacheDataSource,artistLocalDataSource,artistRemoteDataSource)

    }

    @Singleton
    @Provides
    fun providesTvShowsRepository(tvRemoteDataSource: TvShowRemoteDataSource,
                                  tvLocalDataSource: TvShowLocalDataSource,
                                  tvShowCasheDataSource: TvShowCasheDataSource):TvShowRepositoryImpl{
        return TvShowRepositoryImpl(tvShowCasheDataSource,tvRemoteDataSource,tvLocalDataSource)

    }
}