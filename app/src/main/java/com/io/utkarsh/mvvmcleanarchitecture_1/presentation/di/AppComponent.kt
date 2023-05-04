package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di

import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists.ArtistSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.AppModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.CacheDataModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.DatabaseModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.LocalDataModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.NetModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.RemoteDataModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.RepositoryModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.UseCaseModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies.MoviesSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, CacheDataModule::class,
        DatabaseModule::class, LocalDataModule::class, NetModule::class, RemoteDataModule::class, RepositoryModule::class,
        UseCaseModule::class]
)
interface AppComponent {

    fun getMovesSubComponent():MoviesSubComponent.Factory
    fun getArtistsSubComponent():ArtistSubComponent.Factory
    fun getTvShowsSubComponent():TvShowSubComponent.Factory
}