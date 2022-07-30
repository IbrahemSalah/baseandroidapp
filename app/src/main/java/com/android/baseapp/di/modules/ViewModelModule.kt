package com.android.baseapp.di.modules

import com.android.baseapp.ui.landing.LandingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { LandingViewModel(get()) }
}