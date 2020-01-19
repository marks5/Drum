package br.com.domain.usecases

import br.com.domain.entities.Anime
import br.com.domain.repository.AnimeRepository
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single

class GetAnimesUseCases (
    private val repository: AnimeRepository,
    private val scheduler: Scheduler
){
    fun execute(forceUpdate: Boolean): Single<List<Anime>>{
        return repository.getAnimes(forceUpdate)
            .subscribeOn(scheduler)
    }
}