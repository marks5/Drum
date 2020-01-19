package br.com.domain.repository

import br.com.domain.entities.Anime
import io.reactivex.Single

interface AnimeRepository {
    fun getAnimes(forceUpdate: Boolean): Single<List<Anime>>
}