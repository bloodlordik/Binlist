package ru.kirshov.domain.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.kirshov.domain.viewmodels.rootviewmodel.RootViewModel

val domainModule = module {
    viewModel<RootViewModel> { RootViewModel() }
}