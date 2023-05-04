package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetMovieUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMovieUseCase: GetMovieUseCase,
    private val updateModel: UpdateMoviesUseCase
) : ViewModel() {
    fun getListOfMovie() = liveData {
        val movieList = getMovieUseCase.execute()
        emit(movieList)
    }

    fun updateMovie() = liveData {
        val movieList = updateModel.execute()
        emit(movieList)
    }

}