package br.com.drum.feature.home

import br.com.domain.repository.AnimeRepository
import br.com.drum.extensions.UIAction
import br.com.drum.extensions.UIState
import br.com.drum.feature.viewmodel.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class HomeViewModel(
    repository: AnimeRepository
) : ViewModel<HomeViewState, HomeViewAction>(HomeViewState.initialState) {

    init {
        repository.getAnimes(false)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { setState { HomeViewState(isProgressBarVisible = true) } }
            .map {
                it.map { anime ->
                    AnimeListState(
                        poster = anime.imagem,
                        name = anime.nome
                    )
                }
            }
            .subscribeBy(
                onSuccess = { animes ->
                    setState { HomeViewState(isListVisible = true, listItems = animes) }
                },
                onError = {
                    setState { HomeViewState(isError = true) }
                }
            )
            .handleDisposable()
    }
}

sealed class HomeViewAction : UIAction
data class HomeViewState(
    val isProgressBarVisible: Boolean = false,
    val isError: Boolean = false,
    val isListVisible: Boolean = false,
    val listItems: List<AnimeListState> = emptyList()
) : UIState {

    companion object {
        val initialState
            get() = HomeViewState()
    }
}