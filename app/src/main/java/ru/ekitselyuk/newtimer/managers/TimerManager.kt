package ru.ekitselyuk.newtimer.managers

import android.os.CountDownTimer


class TimerManager {

    fun start() {}

    fun stop() {}

    val timer = object : CountDownTimer(0 , 0) {
        override fun onTick(millisUntilFinished: Long) {
            TODO("Not yet implemented")
        }

        override fun onFinish() {
            TODO("Not yet implemented")
        }

    }
}