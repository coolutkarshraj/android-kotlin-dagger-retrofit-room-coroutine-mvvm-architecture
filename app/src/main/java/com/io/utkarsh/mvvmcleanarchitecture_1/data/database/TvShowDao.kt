package com.io.utkarsh.mvvmcleanarchitecture_1.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvShow(tvShow: List<TvShows>)

    @Query("DELETE FROM popular_tv_Show")
    suspend fun deleteTvShow()

    @Query("SELECT * FROM popular_tv_Show")
    suspend fun getALlTvShow():List<TvShows>
}