package com.geekbrains.kotlin_note.ui.main

import com.geekbrains.kotlin_note.data.entity.Note
import com.geekbrains.kotlin_note.ui.base.BaseViewState

class MainViewState(val notes: List<Note>? = null, error: Throwable? = null) :
    BaseViewState<List<Note>?>(notes, error)