package com.io.utkarsh.mvvmcleanarchitecture_1.domain.useCase

import com.io.utkarsh.mvvmcleanarchitecture_1.data.model.tvShow.TvShows
import com.io.utkarsh.mvvmcleanarchitecture_1.domain.rpository.TvShowRepository

class UpdateTvUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShows>? = tvShowRepository.updateTvShows()
}