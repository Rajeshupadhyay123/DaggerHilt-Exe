package com.example.daggerhiltexe.model

import android.util.Log
import javax.inject.Inject

class Lithium {

    @Inject
    constructor(){
        Log.i("mobile", "lithium created: ")
    }
}