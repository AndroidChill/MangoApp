package com.mango.app.main.di

import android.content.Context
import com.mango.app.main.MangoApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule (private val application: MangoApplication){

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application.applicationContext
    }

}