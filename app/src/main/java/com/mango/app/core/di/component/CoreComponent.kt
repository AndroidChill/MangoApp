package com.mango.app.core.di.component

import com.mango.app.core.di.module.NetworkModule
import dagger.Subcomponent

@Subcomponent(
    modules = [
        NetworkModule::class
    ]
)
interface CoreComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): CoreComponent
    }

}