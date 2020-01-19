package br.com.data.local.mapper

import br.com.data.local.model.AnimesCache
import br.com.domain.entities.Anime

object AnimesCacheMapper {

    fun map(cacheData: List<AnimesCache>) = cacheData.map { map(it) }

    private fun map(cacheData: AnimesCache) = Anime(
        //id = cacheData.id,
        ano = cacheData.ano,
        categoria = cacheData.categoria,
        desc = cacheData.desc,
        idApi = cacheData.idApi,
        imagem = cacheData.imagem,
        nome = cacheData.nome,
        rank = cacheData.rank,
        status = cacheData.status
    )

    fun mapAnimesToCache(animes: List<Anime>) = animes.map { map(it) }

    private fun map(data: Anime) = AnimesCache(
        status = data.status,
        rank = data.rank,
        nome = data.nome,
        imagem = data.imagem,
        idApi = data.idApi,
        desc = data.desc,
        categoria = data.categoria,
        ano = data.ano
        //id = data.id
    )
}