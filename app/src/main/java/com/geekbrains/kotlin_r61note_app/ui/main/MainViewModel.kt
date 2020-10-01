package com.geekbrains.kotlin_r61note_app.ui.main

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.Observer
import com.geekbrains.kotlin_r61note_app.data.NotesRepository
import com.geekbrains.kotlin_r61note_app.data.entity.Note
import com.geekbrains.kotlin_r61note_app.data.model.NoteResult
import com.geekbrains.kotlin_r61note_app.ui.base.BaseViewModel

class MainViewModel(notesRepository: NotesRepository) :
    BaseViewModel<List<Note>?, MainViewState>() {

    private val notesObserver = Observer<NoteResult> { result ->
        result ?: return@Observer
        when (result) {
            is NoteResult.Success<*> -> viewStateLiveData.value =
                MainViewState(notes = result.data as? List<Note>)
            is NoteResult.Error -> viewStateLiveData.value = MainViewState(error = result.error)
        }
    }

    private val repositoryNotes = notesRepository.getNotes()

    init {
        viewStateLiveData.value = MainViewState()
        repositoryNotes.observeForever(notesObserver)
    }

    @VisibleForTesting
    public override fun onCleared() {
        super.onCleared()
        repositoryNotes.removeObserver(notesObserver)
    }
}