package ru.ekitselyuk.newtimer

import android.app.Application
import ru.ekitselyuk.newtimer.managers.TimerManager


class App: Application() {

    companion object {
        var manager: TimerManager? = null
    }

    override fun onCreate() {
        super.onCreate()



        manager = TimerManager()
    }
}