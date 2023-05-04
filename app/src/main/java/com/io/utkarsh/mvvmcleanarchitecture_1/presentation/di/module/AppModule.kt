package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import android.content.Context
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists.ArtistSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies.MoviesSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [ArtistSubComponent::class,MoviesSubComponent::class,
TvShowSubComponent::class])
class AppModule(private val context:Context) {

    @Singleton
    @Provides
    fun provideApplcationContext():Context{
        return  context.applicationContext
    }
}