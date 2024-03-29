package com.android.baseapp.di.modules

import com.android.baseapp.ui.landing.MovieListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { MovieListViewModel(get()) }
}