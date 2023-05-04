package com.io.utkarsh.mvvmcleanarchitecture_1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows

@Database(
    entities = [Movies::class, TvShows::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun popularArtistDao(): PopularArtistDao
}