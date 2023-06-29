package com.spoonofcode.androiddemoapp.data.repository.di

import com.google.samples.apps.nowinandroid.core.network.di.dispatchersKoinModule
import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.data.repository.fake.FakeUsersRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    includes(dispatchersKoinModule)
    singleOf(::FakeUsersRepository) { bind<UsersRepository>() }
}