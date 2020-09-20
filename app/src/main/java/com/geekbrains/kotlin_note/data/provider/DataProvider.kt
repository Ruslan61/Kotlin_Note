package com.geekbrains.kotlin_note.data.provider

import androidx.lifecycle.LiveData
import com.geekbrains.kotlin_note.data.entity.Note
import com.geekbrains.kotlin_note.data.model.NoteResult

interface DataProvider {
    fun subscribeToAllNotes() : LiveData<NoteResult>
    fun saveNote(note: Note) : LiveData<NoteResult>
    fun getNoteById(id: String) : LiveData<NoteResult>
}