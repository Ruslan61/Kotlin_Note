package com.geekbrains.kotlin_note.ui.note

import com.geekbrains.kotlin_note.data.entity.Note
import com.geekbrains.kotlin_note.ui.base.BaseViewState

class NoteViewState(note: Note? = null, error: Throwable? = null) :
    BaseViewState<Note?>(note, error)