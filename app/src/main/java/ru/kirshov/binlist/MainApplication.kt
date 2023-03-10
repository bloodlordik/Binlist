package ru.kirshov.binlist

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import ru.kirshov.domain.di.domainModule
import ru.kirshov.localdatasource.di.localDataModule
import ru.kirshov.networkdatasource.di.networkModule
import ru.kirshov.repository.di.repositoryModule

class MainApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(domainModule, networkModule, localDataModule, repositoryModule)
        }
    }
}