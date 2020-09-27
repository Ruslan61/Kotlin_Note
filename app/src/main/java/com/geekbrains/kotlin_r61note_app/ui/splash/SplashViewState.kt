package com.geekbrains.kotlin_r61note_app.ui.splash

import com.geekbrains.kotlin_r61note_app.ui.base.BaseViewState

class SplashViewState(authenticated: Boolean? = null, error: Throwable? = null) :
    BaseViewState<Boolean?>(authenticated, error)