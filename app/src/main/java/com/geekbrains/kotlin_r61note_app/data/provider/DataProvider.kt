package com.geekbrains.kotlin_r61note_app.data.provider

import androidx.lifecycle.LiveData
import com.geekbrains.kotlin_r61note_app.data.entity.Note
import com.geekbrains.kotlin_r61note_app.data.entity.User
import com.geekbrains.kotlin_r61note_app.data.model.NoteResult

interface DataProvider {
    fun getCurrentUser(): LiveData<User?>
    fun subscribeToAllNotes(): LiveData<NoteResult>
    fun saveNote(note: Note): LiveData<NoteResult>
    fun getNoteById(id: String): LiveData<NoteResult>
    fun deleteNote(id: String): LiveData<NoteResult>
}