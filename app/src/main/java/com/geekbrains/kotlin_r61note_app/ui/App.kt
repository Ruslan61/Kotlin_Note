package com.geekbrains.kotlin_r61note_app.ui

import android.app.Application
import org.koin.android.ext.android.startKoin
import com.geekbrains.kotlin_r61note_app.di.appModule
import com.geekbrains.kotlin_r61note_app.di.mainModule
import com.geekbrains.kotlin_r61note_app.di.noteModule
import com.geekbrains.kotlin_r61note_app.di.splashModule

class App : Application() {

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin(this, listOf(appModule, splashModule, mainModule, noteModule))
    }
}

