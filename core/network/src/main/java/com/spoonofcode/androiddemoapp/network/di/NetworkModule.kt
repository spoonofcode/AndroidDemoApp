package com.spoonofcode.androiddemoapp.network.di

import com.spoonofcode.androiddemoapp.network.NetworkDataSource
import com.spoonofcode.androiddemoapp.network.fake.FakeAssetManager
import com.spoonofcode.androiddemoapp.network.fake.FakeNetworkDataSource
import kotlinx.serialization.json.Json
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.bind
import org.koin.dsl.module

val networkModule = module {
    singleOf(::FakeNetworkDataSource) { bind<NetworkDataSource>() }
    single { FakeAssetManager(androidContext().assets::open) }
    single { Json { ignoreUnknownKeys = true } }
}