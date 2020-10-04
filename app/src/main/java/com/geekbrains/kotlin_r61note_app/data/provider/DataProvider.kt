package com.geekbrains.kotlin_r61note_app.data.provider

import com.geekbrains.kotlin_r61note_app.data.entity.Note
import com.geekbrains.kotlin_r61note_app.data.entity.User
import com.geekbrains.kotlin_r61note_app.data.model.NoteResult
import kotlinx.coroutines.channels.ReceiveChannel

interface DataProvider {
    fun subscribeToAllNotes(): ReceiveChannel<NoteResult>

    suspend fun getCurrentUser(): User?
    suspend fun saveNote(note: Note): Note
    suspend fun getNoteById(id: String): Note?
    suspend fun deleteNote(id: String)
}