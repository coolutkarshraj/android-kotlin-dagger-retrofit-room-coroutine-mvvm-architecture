package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists

import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.artists.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {

    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): ArtistSubComponent
    }
}