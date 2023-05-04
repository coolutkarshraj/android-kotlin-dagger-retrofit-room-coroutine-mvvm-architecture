package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows

import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.activity.tvShows.TvShowsActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {

    fun inject(tvShowsActivity: TvShowsActivity)

    @Subcomponent.Factory
    interface Factory{
        fun onCreate(): TvShowSubComponent
    }
}