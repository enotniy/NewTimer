package ru.ekitselyuk.newtimer.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.ekitselyuk.newtimer.App
import ru.ekitselyuk.newtimer.managers.TimerManager
import java.util.prefs.Preferences

class DashboardViewModel(timerManager: TimerManager, preferences: Preferences) : ViewModel() {

    private var _state = MutableLiveData<DashboardState>()
    val state: LiveData<DashboardState> = _state



    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"

        App.manager?.start()
    }


    fun change() {
        _state.value = when (state.value) {
            is DashboardState.StoppedState -> DashboardState.RunningState(0, "new")
            is DashboardState.PauseState -> DashboardState.RunningState(1, "new")
            is DashboardState.RunningState -> DashboardState.PauseState(1)
            else -> DashboardState.StoppedState(0)
        }
    }
}