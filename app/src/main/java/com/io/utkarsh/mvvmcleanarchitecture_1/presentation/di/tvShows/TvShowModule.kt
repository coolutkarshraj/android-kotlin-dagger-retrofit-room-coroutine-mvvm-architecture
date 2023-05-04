package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows

import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetTVShowUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateTvUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows.TvShowsViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun getTvShowUseCase(getTVShowUseCase: GetTVShowUseCase,
    updateTvUseCase: UpdateTvUseCase):TvShowsViewModelFactory{
        return TvShowsViewModelFactory(getTVShowUseCase,updateTvUseCase)
    }
}