package com.io.utkarsh.mvvmcleanarchitecture_1.presentation.di.module

import android.content.Context
import androidx.room.Room
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.MovieDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.PopularArtistDao
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.TMDBDatabase
import com.io.utkarsh.mvvmcleanarchitecture_1.data.database.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideTmdbDatabase(context: Context): TMDBDatabase{
        return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbClient")
            .build()

    }
    @Singleton
    @Provides
    fun provideMovieDao(database:TMDBDatabase):MovieDao{
      return database.movieDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(database:TMDBDatabase):PopularArtistDao{
        return database.popularArtistDao()
    }

    @Singleton
    @Provides
    fun provideTvShowDao(database:TMDBDatabase):TvShowDao{
        return database.tvShowDao()
    }
}