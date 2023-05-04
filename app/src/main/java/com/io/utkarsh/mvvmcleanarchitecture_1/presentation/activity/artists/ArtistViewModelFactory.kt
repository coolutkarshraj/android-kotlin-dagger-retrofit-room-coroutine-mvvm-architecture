package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.artists

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase

class ArtistViewModelFactory(private val getArtistUseCase: GetArtistUseCase,
                             private val updateArtistUseCase: UpdateArtistUseCase
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArtistviewModel(getArtistUseCase,updateArtistUseCase) as T
    }
}