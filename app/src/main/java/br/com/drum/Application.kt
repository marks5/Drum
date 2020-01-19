package br.com.drum

import android.app.Application
import br.com.data.di.dataModules
import br.com.domain.di.domainModule
import br.com.drum.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin

class Application : Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Application)
            fragmentFactory()

            modules(domainModule + dataModules + listOf(presentationModule))
        }
    }
}
