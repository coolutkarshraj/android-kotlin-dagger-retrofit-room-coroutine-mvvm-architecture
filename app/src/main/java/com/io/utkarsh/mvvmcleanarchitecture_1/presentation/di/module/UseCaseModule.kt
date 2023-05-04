package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.ArtistRepository
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.MovieRepository
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.TvShowRepository
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetMovieUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetTVShowUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateMoviesUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateTvUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideMoviesUseCase(movieRepository: MovieRepository):GetMovieUseCase{
        return GetMovieUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository):UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideArtistUseCase(artistRepository: ArtistRepository):GetArtistUseCase{
        return GetArtistUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository):UpdateArtistUseCase{
        return UpdateArtistUseCase(artistRepository)
    }

    @Provides
    fun provideTvShowUseCase(tvShowRepository: TvShowRepository):GetTVShowUseCase{
        return GetTVShowUseCase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository):UpdateTvUseCase{
        return UpdateTvUseCase(tvShowRepository)
    }
}