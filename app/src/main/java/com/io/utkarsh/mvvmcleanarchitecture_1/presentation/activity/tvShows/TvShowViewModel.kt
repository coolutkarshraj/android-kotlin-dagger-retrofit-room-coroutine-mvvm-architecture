package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetTVShowUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateTvUseCase

class TvShowViewModel(private val tvShowUseCase: GetTVShowUseCase,
private val updateTVShowUseCase: UpdateTvUseCase
):ViewModel() {

    fun getListOfTvShow() = liveData {
        val movieList = tvShowUseCase.execute()
        emit(movieList)
    }

    fun updateTvShow() = liveData {
        val movieList = updateTVShowUseCase.execute()
        emit(movieList)
    }
}