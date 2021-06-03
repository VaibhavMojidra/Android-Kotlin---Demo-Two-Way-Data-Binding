package com.vaibhavmojidra.twowaydatabindingkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var text=MutableLiveData<String>()

}