package com.example.viewmodelwithfragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class PageViewModel(application: Application):AndroidViewModel(application) {
    var content = MutableLiveData<String>()
    set(value) {
        field = value
    }
    get() {
        return field
    }
    val isRealtime: LiveData<String>
        get() = content
}