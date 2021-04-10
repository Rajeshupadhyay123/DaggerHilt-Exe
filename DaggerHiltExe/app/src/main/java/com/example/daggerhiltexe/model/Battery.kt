package com.example.daggerhiltexe.model

import android.util.Log
import javax.inject.Inject

class Battery {

    @Inject
    constructor(lithium: Lithium,cobalt: Cobalt){
        Log.i("mobile", "battery created: ")
    }
}