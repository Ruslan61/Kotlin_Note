package com.geekbrains.kotlin_note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val viewStateLiveData = MutableLiveData<String>()
    private val model = Model()

    init {
        model.counterLiveData().observeForever {
            viewStateLiveData.value = "" + it + " click"
        }
    }

    fun getViewState(): LiveData<String> = viewStateLiveData

    fun buttonClick() {
        model.riseCounter()
    }
}