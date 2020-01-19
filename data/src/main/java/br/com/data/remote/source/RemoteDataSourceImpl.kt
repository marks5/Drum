package br.com.data.remote.source

import br.com.data.remote.api.ServerApi
import br.com.data.remote.mapper.AnimesJobMapper
import br.com.domain.entities.Anime
import io.reactivex.Single

class RemoteDataSourceImpl(private val serverApi: ServerApi): RemoteDataSource {

    override fun getAnimes(): Single<List<Anime>> {
        return serverApi.fetchAnimes().map{
            AnimesJobMapper.map(it)
        }
    }

}