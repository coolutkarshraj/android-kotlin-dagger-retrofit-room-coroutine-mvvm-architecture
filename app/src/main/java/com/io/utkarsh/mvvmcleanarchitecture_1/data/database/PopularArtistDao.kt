package com.io.utkarsh.mvvmcleanarchitecture_1.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

@Dao
interface PopularArtistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArtist(artist: List<Artist>)

    @Query("DELETE FROM popular_movie")
    suspend fun deleteAllArtist()

    @Query("SELECT * FROM popular_movie")
    suspend fun getALlArtist():List<Artist>
}