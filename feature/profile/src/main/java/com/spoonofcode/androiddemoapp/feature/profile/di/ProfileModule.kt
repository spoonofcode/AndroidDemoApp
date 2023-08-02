package com.spoonofcode.androiddemoapp.feature.profile.di

import com.spoonofcode.androiddemoapp.feature.profile.ProfileViewModel
import com.spoonofcode.androiddemoapp.feature.profile.ProfileUseCase
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val profileModule = module {
    singleOf(::ProfileUseCase)
    viewModelOf(::ProfileViewModel)
}