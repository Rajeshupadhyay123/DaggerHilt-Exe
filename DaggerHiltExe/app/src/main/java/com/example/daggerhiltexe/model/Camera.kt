package com.example.daggerhiltexe.model

import android.util.Log
import com.example.daggerhiltexe.module.MegaPx

class Camera {

    //lets it is a third party library and we cannot provide constructor inject here

    constructor(megaPx:Int){
        Log.i("mobile", "Camera created: with mp : $megaPx")
    }
}