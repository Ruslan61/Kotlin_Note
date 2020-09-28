package com.geekbrains.kotlin_r61note_app.ui.splash

import com.geekbrains.kotlin_r61note_app.data.NotesRepository
import com.geekbrains.kotlin_r61note_app.data.errors.NoAuthException
import com.geekbrains.kotlin_r61note_app.ui.base.BaseViewModel

class SplashViewModel(val notesRepository: NotesRepository) :
    BaseViewModel<Boolean?, SplashViewState>() {

    fun requestUser() {
        notesRepository.getCurrentUser().observeForever {
            viewStateLiveData.value = if (it != null) {
                SplashViewState(authenticated = true)
            } else {
                SplashViewState(error = NoAuthException())
            }
        }
    }

}