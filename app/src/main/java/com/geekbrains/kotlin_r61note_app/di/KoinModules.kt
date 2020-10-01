package com.geekbrains.kotlin_r61note_app.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import com.geekbrains.kotlin_r61note_app.data.NotesRepository
import com.geekbrains.kotlin_r61note_app.data.provider.DataProvider
import com.geekbrains.kotlin_r61note_app.data.provider.FirestoreProvider
import com.geekbrains.kotlin_r61note_app.ui.main.MainViewModel
import com.geekbrains.kotlin_r61note_app.ui.note.NoteViewModel
import com.geekbrains.kotlin_r61note_app.ui.splash.SplashViewModel

val appModule = module {
    single { FirebaseAuth.getInstance() }
    single { FirebaseFirestore.getInstance() }
    single<DataProvider> { FirestoreProvider(get(), get()) }
    single { NotesRepository(get()) }
}

val splashModule = module {
    viewModel { SplashViewModel(get()) }
}

val mainModule = module {
    viewModel { MainViewModel(get()) }
}

val noteModule = module {
    viewModel { NoteViewModel(get()) }
}