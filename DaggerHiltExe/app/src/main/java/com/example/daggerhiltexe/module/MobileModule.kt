package com.example.daggerhiltexe.module

import com.example.daggerhiltexe.model.Camera
import com.example.daggerhiltexe.model.MediaTek
import com.example.daggerhiltexe.model.Processor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MobileModule {

    //===========================================================
    @Provides
    @ClockSpeed
    fun getClockSpeed():Int=64

    @Provides
    @Core
    fun getCore():Int=2

    @Provides
    @Singleton
    fun getProcessor():Processor{
        return MediaTek(getClockSpeed(),getCore())
    }
//================================================================================
    @Provides
    @MegaPx
    fun getMegaPx():Int=64

    @Provides
    @Singleton
    fun getCamera():Camera{
        return Camera(getMegaPx())
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ClockSpeed

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Core

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MegaPx