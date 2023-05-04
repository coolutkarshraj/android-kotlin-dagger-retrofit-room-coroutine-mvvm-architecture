package com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist


import com.google.gson.annotations.SerializedName

data class PopularArtistApiResponse(
    @SerializedName("results")
    val artists: List<Artist>,

    )