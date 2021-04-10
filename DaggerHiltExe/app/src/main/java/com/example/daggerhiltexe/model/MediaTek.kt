package com.example.daggerhiltexe.model

import android.util.Log
import javax.inject.Inject

class MediaTek : Processor {

    @Inject
    constructor(clockSpeed:Int, core:Int){
        Log.i("mobile", ":mediatek created with clockpeed $clockSpeed core $core")
    }

    override fun start() {
        TODO("Not yet implemented")
    }
}