package br.com.data.remote.source

import br.com.domain.entities.Anime
import io.reactivex.Single

interface RemoteDataSource {
    fun getAnimes(): Single<List<Anime>>
}