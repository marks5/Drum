package br.com.data.local.source

import br.com.domain.entities.Anime
import io.reactivex.Single

interface AnimesCacheDataSource {

    fun getAnimes() : Single<List<Anime>>

    fun insertData(list: List<Anime>)
    fun updateData(list: List<Anime>)

}