package com.mango.app.main

import android.app.Application
import com.mango.app.core.di.component.CoreComponent

abstract class BaseApplication : Application() {

    abstract fun getCoreComponent(): CoreComponent

}