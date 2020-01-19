package br.com.data.local.source

import br.com.data.local.database.AnimesDB
import br.com.data.local.database.AnimesDao
import br.com.data.local.mapper.AnimesCacheMapper
import br.com.domain.entities.Anime
import io.reactivex.Single

class AnimesCacheSourceImp(
    private val animesDB: AnimesDB
) : AnimesCacheDataSource {

    private val animesDao by lazy {
        animesDB.animesDao()
    }

    override fun getAnimes(): Single<List<Anime>> {
        return animesDao.getAnimes().map { AnimesCacheMapper.map(it) }
    }

    override fun insertData(list: List<Anime>) {
        animesDao.insertAll(AnimesCacheMapper.mapAnimesToCache(list))
    }

    override fun updateData(list: List<Anime>) {
        animesDao.insertAll(AnimesCacheMapper.mapAnimesToCache(list))
    }

}