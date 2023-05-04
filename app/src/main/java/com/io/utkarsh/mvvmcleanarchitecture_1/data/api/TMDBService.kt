package com.io.utkarsh.mvvmcleanarchitecture_1.data.api

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie.MovieApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.PopularArtistApiResponse
import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShowApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key")apiKey: String): Response<MovieApiResponse>

    @GET("tv/popular")
    suspend fun getPopularTVShows(@Query("api_key")apiKey: String): Response<TvShowApiResponse>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key")apiKey: String): Response<PopularArtistApiResponse>
}