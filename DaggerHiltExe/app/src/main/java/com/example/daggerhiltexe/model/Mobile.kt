package com.example.daggerhiltexe.model

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(val battery: Battery,val processor: Processor,val camera: Camera) {

    init {
        Log.i("mobile", "batter is : $battery and processor is : $processor")
    }

    fun run(){
        Log.i("mobile", "run: ")
    }

}