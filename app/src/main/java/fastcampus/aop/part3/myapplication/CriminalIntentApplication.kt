package fastcampus.aop.part3.myapplication

import android.app.Application

class CriminalIntentApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        CrimeRepository.initialize(this)
    }
}