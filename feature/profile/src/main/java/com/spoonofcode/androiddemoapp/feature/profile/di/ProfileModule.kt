package com.spoonofcode.androiddemoapp.feature.profile.di

import com.spoonofcode.androiddemoapp.feature.profile.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val profileModule = module {
    viewModelOf(::ProfileViewModel)
}