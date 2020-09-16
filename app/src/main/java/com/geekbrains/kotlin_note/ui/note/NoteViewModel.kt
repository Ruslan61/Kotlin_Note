package com.geekbrains.kotlin_note.ui.note

import androidx.lifecycle.ViewModel
import com.geekbrains.kotlin_note.data.NotesRepository
import com.geekbrains.kotlin_note.data.entity.Note

class NoteViewModel : ViewModel() {

    private var pendingNote: Note? = null

    fun save(note: Note) {
        pendingNote = note
    }

    override fun onCleared() {
        pendingNote?.let {
            NotesRepository.saveNote(it)
        }
    }

}