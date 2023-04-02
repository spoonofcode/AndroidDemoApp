package com.spoonofcode.androiddemoapp

import android.app.Application
import com.spoonofcode.androiddemoapp.data.repository.di.dataModule
import com.spoonofcode.androiddemoapp.di.appModule
import com.spoonofcode.androiddemoapp.feature.profile.di.profileModule
import com.spoonofcode.androiddemoapp.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                appModule,
                networkModule,
                dataModule,
                profileModule,
            )
        }
    }
}