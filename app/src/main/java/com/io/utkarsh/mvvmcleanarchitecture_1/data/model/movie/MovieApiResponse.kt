package com.io.utkarsh.mvvmcleanarchitecture_1.data.model.movie


import com.google.gson.annotations.SerializedName

data class MovieApiResponse(
    @SerializedName("results")
    val movies: List<Movies>,
)