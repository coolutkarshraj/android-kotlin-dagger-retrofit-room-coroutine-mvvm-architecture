package com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.artist.Artist
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtist()
}