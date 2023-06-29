package com.google.samples.apps.nowinandroid.core.network.di

import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val dispatchersKoinModule = module {
    single { Dispatchers.IO }
}
