package com.mango.app.main.di

import android.app.Application
import com.mango.app.core.di.component.CoreComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ApplicationModule::class]
)
interface ApplicationComponent {

    fun inject(application: Application)

    fun baseComponent(): CoreComponent.Factory

}