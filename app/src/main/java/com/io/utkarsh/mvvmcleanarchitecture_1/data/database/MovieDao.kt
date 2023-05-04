package com.io.utkarsh.mvvmcleanarchitecture_1.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<Movies>)

    @Query("DELETE FROM popular_movie")
    suspend fun deleteAllMovie()

    @Query("SELECT * FROM popular_movie")
    suspend fun getALlMovie(): List<Movies>
}