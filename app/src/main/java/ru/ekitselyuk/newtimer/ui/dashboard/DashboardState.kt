package ru.ekitselyuk.newtimer.ui.dashboard

sealed class DashboardState {

    class StoppedState(val time: Long): DashboardState()

    class RunningState(val time: Long, val type: String): DashboardState()

    class PauseState(val time: Long): DashboardState()

}
