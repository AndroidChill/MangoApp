package com.mango.app.main

import com.mango.app.core.di.component.CoreComponent
import com.mango.app.main.di.ApplicationComponent
import com.mango.app.main.di.ApplicationModule
import com.mango.app.main.di.DaggerApplicationComponent

class MangoApplication : BaseApplication() {

    private val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        injectDependencies()


    }

    override fun getCoreComponent(): CoreComponent {
        return appComponent.baseComponent().create()
    }

    private fun injectDependencies() {
        appComponent.inject(this)
    }
}