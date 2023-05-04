package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetMovieUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateMoviesUseCase

class MoviesViewModelFactory(private val getMovieUseCase: GetMovieUseCase,
                             private val updateModel: UpdateMoviesUseCase
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMovieUseCase,updateModel) as T
    }
}