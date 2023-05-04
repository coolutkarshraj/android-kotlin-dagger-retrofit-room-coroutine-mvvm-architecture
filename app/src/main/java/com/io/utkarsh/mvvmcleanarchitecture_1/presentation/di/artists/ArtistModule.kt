package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists

import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.GetArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase.UpdateArtistUseCase
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.artists.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {



    @ArtistScope
    @Provides
    fun provideArtistviewModelFactory(getArtistUseCase: GetArtistUseCase,
    updateArtistUseCase: UpdateArtistUseCase): ArtistViewModelFactory{
        return ArtistViewModelFactory(getArtistUseCase,updateArtistUseCase)
    }
}