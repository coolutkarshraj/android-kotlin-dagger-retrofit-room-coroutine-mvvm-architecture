package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.artists

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetMovieUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateMoviesUseCase
import kotlinx.coroutines.Dispatchers

class ArtistviewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {

    fun getListOfArtist() = liveData {
        val movieList = getArtistUseCase.execute()
        emit(movieList)
    }

    fun updateArtist() = liveData {
        val movieList = updateArtistUseCase.execute()
        emit(movieList)
    }

}