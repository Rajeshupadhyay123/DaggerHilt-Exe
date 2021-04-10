package com.example.daggerhiltexe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhiltexe.model.Mobile
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mobile.run()
    }
}