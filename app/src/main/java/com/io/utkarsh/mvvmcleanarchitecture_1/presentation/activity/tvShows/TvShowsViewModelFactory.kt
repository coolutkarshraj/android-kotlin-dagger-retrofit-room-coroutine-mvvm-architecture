package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetTVShowUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateTvUseCase

class TvShowsViewModelFactory(private val tvShowUseCase: GetTVShowUseCase,
                              private val updateTVShowUseCase: UpdateTvUseCase
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(tvShowUseCase,updateTVShowUseCase) as T
    }
}