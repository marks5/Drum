package br.com.data.di

import br.com.data.local.database.AnimesDB
import br.com.data.local.source.AnimesCacheDataSource
import br.com.data.local.source.AnimesCacheSourceImp
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val cacheDataModule = module {
    single { AnimesDB.createDB(androidContext()) }
    factory<AnimesCacheDataSource> { AnimesCacheSourceImp(animesDB = get()) }
}