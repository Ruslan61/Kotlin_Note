package com.geekbrains.kotlin_note.data

import com.geekbrains.kotlin_note.data.entity.Note
import com.geekbrains.kotlin_note.data.provider.DataProvider
import com.geekbrains.kotlin_note.data.provider.FirestoreProvider

object NotesRepository {

    private val dataProvider: DataProvider = FirestoreProvider()

    fun getNotes() = dataProvider.subscribeToAllNotes()
    fun saveNote(note: Note) = dataProvider.saveNote(note)
    fun getNoteById(id: String) = dataProvider.getNoteById(id)

}