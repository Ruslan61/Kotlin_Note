package com.geekbrains.kotlin_note

import androidx.lifecycle.MutableLiveData

class Model {
    private var counter = 0
    private val counterLiveData = MutableLiveData<Int>()

    fun counterLiveData(): MutableLiveData<Int> = counterLiveData

    fun riseCounter() {
        counter++
        counterLiveData.value = counter
    }
}