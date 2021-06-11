package com.example.wilynleeandroid

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var user = MutableLiveData<User>()

    init {
        user.value = User("加油")
    }
}