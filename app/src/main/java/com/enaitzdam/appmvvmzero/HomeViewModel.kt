package com.enaitzdam.appmvvmzero

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    fun countAlumnsByAge(age: Int): Int {
        return AlumnProvider.getAlumns().count { it.age == age }
    }
}
