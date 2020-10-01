package com.geekbrains.kotlin_r61note_app.ui.note

import com.geekbrains.kotlin_r61note_app.data.entity.Note
import com.geekbrains.kotlin_r61note_app.ui.base.BaseViewState

class NoteViewState(data: Data = Data(), error: Throwable? = null) :
    BaseViewState<NoteViewState.Data>(data, error) {
    data class Data(val isDeleted: Boolean = false, val note: Note? = null)
}