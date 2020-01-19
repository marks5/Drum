package br.com.data

import br.com.data.local.source.AnimesCacheDataSource
import br.com.data.remote.source.RemoteDataSource
import br.com.domain.entities.Anime
import br.com.domain.repository.AnimeRepository
import io.reactivex.Single

class AnimesJobRepositoryImpl (
    private val animesCacheDataSource: AnimesCacheDataSource,
    private val remoteDataSource: RemoteDataSource
): AnimeRepository {
    override fun getAnimes(forceUpdate: Boolean): Single<List<Anime>> {
        return if (forceUpdate)
            getAnimesRemote(forceUpdate)
        else
            animesCacheDataSource.getAnimes()
                .flatMap { animeList ->
                    when{
                        animeList.isEmpty() -> getAnimesRemote(false)
                        else -> Single.just(animeList)
                    }
                }
    }

    private fun getAnimesRemote(isUpdate: Boolean): Single<List<Anime>>{
        return remoteDataSource.getAnimes()
            .flatMap { animeList ->
                if (isUpdate)
                    animesCacheDataSource.updateData(animeList)
                else
                    animesCacheDataSource.insertData(animeList)
                Single.just(animeList)
            }
    }
}