package br.com.data.di

import br.com.data.AnimesJobRepositoryImpl
import br.com.domain.repository.AnimeRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<AnimeRepository> {
        AnimesJobRepositoryImpl(
            animesCacheDataSource = get(),
            remoteDataSource = get()
        )
    }
}

val dataModules = listOf(remoteDataSourceModule, repositoryModule, cacheDataModule)