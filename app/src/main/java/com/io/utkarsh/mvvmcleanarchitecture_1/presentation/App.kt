package com.io.utkarsh.mvvmcleanarchitecture_1.presentation

import android.app.Application
import com.io.utkarsh.mvvmcleanarchitecture_1.BuildConfig
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.AppComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.DaggerAppComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.Injector
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.artists.ArtistSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.AppModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.NetModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module.RemoteDataModule
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.movies.MoviesSubComponent
import com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.tvShows.TvShowSubComponent

class App: Application(),Injector {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext)).netModule(NetModule(BuildConfig.BASE_URL)).remoteDataModule(
                RemoteDataModule(BuildConfig.API_KEY)
            ).build()

    }
    override fun createMoviesSubComponent(): MoviesSubComponent {
        return appComponent.getMovesSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.getTvShowsSubComponent().onCreate()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
       return appComponent.getArtistsSubComponent().create()
    }
}