package br.com.drum.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import br.com.drum.feature.viewmodel.ViewModel

inline fun <reified State : UIState, reified Action : UIAction> LifecycleOwner.onStateChange(
    viewModel: ViewModel<State, Action>,
    crossinline handleStates: (State) -> Unit
) {
    viewModel.state.observe(this, Observer { state -> handleStates(state as State) })
}

interface UIState
interface UIAction