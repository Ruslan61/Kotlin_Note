package com.geekbrains.kotlin_note.ui.main

import androidx.lifecycle.Observer
import com.geekbrains.kotlin_note.data.NotesRepository
import com.geekbrains.kotlin_note.data.entity.Note
import com.geekbrains.kotlin_note.data.model.NoteResult
import com.geekbrains.kotlin_note.ui.base.BaseViewModel

class MainViewModel() : BaseViewModel<List<Note>?, MainViewState>() {

    private val notesObserver = Observer<NoteResult> { result ->
        result ?: return@Observer
        when (result) {
            is NoteResult.Success<*> -> viewStateLiveData.value = MainViewState(
                notes = result.data as? List<Note>
            )
            is NoteResult.Error -> viewStateLiveData.value = MainViewState(
                error = result.error
            )
        }
    }

    private val repositoryNotes = NotesRepository.getNotes()

    init {
        viewStateLiveData.value = MainViewState()
        repositoryNotes.observeForever(notesObserver)
    }

    override fun onCleared() {
        super.onCleared()
        repositoryNotes.removeObserver(notesObserver)
    }
}