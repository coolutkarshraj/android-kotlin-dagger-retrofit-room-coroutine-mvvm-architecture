package com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist


interface ArtistRepository {

    suspend fun getArtist(): List<Artist>?

    suspend fun updateArtist(): List<Artist>?
}