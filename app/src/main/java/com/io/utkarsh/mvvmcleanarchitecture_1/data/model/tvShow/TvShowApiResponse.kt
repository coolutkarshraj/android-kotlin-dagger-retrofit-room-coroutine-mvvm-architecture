package com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow


import com.google.gson.annotations.SerializedName

data class TvShowApiResponse(
    @SerializedName("results")
    val tvShows: List<TvShows>,
)