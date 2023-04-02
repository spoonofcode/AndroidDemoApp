package com.spoonofcode.androiddemoapp.network.di

import com.spoonofcode.androiddemoapp.network.NetworkDataSource
import com.spoonofcode.androiddemoapp.network.fake.FakeNetworkDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.bind
import org.koin.dsl.module

val networkModule = module {
    singleOf(::FakeNetworkDataSource) { bind<NetworkDataSource>() }
}