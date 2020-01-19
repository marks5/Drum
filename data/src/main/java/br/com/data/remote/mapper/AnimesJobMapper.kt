package br.com.data.remote.mapper

import br.com.data.remote.model.AnimeJobPayload
import br.com.data.remote.model.AnimePayload
import br.com.domain.entities.Anime

object AnimesJobMapper {

    fun map(payload: AnimeJobPayload) = payload.animesPayload.map { map(it) }

    private fun map(payload: AnimePayload) = Anime(
        idApi = payload.idApi,
        ano = payload.ano,
        categoria = payload.categoria,
        desc = payload.desc,
        imagem = payload.imagem,
        nome = payload.nome,
        rank = payload.rank,
        status = payload.status
    )
}