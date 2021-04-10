package com.example.daggerhiltexe.model

import android.util.Log
import javax.inject.Inject

class Cobalt {

    @Inject
    constructor(){
        Log.i("mobile", "cobalt created: ")
    }
}