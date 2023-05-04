package com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.Movies
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShowApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowCasheDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowLocalDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.data.repository.tvShows.dataSource.TvShowRemoteDataSource
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowCacheDataSource: TvShowCasheDataSource,
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowLocalDataSource: TvShowLocalDataSource
) : TvShowRepository {

    override suspend fun getTvShows(): List<TvShows>? {
        return getTvShowFromCache()
    }

    override suspend fun updateTvShows(): List<TvShows>? {
        val newListOfTvShow : List<TvShows> = getTvShowFromApi()
        tvShowLocalDataSource.clearAll()
        tvShowLocalDataSource.saveMoviesTODb(newListOfTvShow)
        tvShowCacheDataSource.saveTvShowToCase(newListOfTvShow)
        return newListOfTvShow
    }

    private suspend fun getTvShowFromApi():List<TvShows>{
        lateinit var tvShowList : List<TvShows>
        try {
            val response = tvShowRemoteDataSource.getMovies()
            val body : TvShowApiResponse? = response.body()
            if(body != null){
                tvShowList = body.tvShows
            }
        }catch (e:Exception){
            println(e)
        }
        return tvShowList

    }
    private suspend fun getTvShowFromLocalDb():List<TvShows>{
        lateinit var tvShowList : List<TvShows>
        try {
           tvShowList = tvShowLocalDataSource.getTvShowsFromDb()

        }catch (e:Exception){
            println(e)
        }
        if(tvShowList.isNotEmpty()){
            return tvShowList
        }else{
            tvShowList = getTvShowFromApi()
            tvShowLocalDataSource.saveMoviesTODb(tvShowList)
            return tvShowList
        }

    }

    private suspend fun getTvShowFromCache():List<TvShows>{
        lateinit var tvShows: List<TvShows>
        try {
            tvShows = tvShowCacheDataSource.getTvShowFromCase()
        } catch (e: Exception) {

        }
        if(tvShows.isNotEmpty()){
            return tvShows
        }else{
            tvShows = getTvShowFromLocalDb()
            tvShowCacheDataSource.saveTvShowToCase(tvShows)
            return tvShows
        }

    }

}