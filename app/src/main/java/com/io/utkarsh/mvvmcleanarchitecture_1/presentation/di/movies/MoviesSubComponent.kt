package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies

import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.movies.MoviesActivity
import dagger.Subcomponent

@MoviesScope
@Subcomponent(modules = [MoviesModule::class])
interface MoviesSubComponent {
    fun inject(moviesActivity: MoviesActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): MoviesSubComponent
    }
}