package br.com.drum.di

import br.com.drum.feature.home.HomeFragment
import br.com.drum.feature.home.HomeListAdapter
import br.com.drum.feature.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.dsl.fragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val presentationModule = module {
    viewModel { HomeViewModel(get()) }
    single { HomeListAdapter() }
    fragment { HomeFragment(get()) }
}