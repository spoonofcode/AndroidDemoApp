package com.spoonofcode.androiddemoapp.data.repository.di

import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.data.repository.fake.FakeUsersRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    singleOf(::FakeUsersRepository) { bind<UsersRepository>() }
}