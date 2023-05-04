package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies

import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetMovieUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateMoviesUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies.MoviesViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MoviesModule {

    @MoviesScope
    @Provides
    fun provideMovies(
        getMovieUseCase: GetMovieUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MoviesViewModelFactory {
        return MoviesViewModelFactory(getMovieUseCase, updateMoviesUseCase)
    }
}