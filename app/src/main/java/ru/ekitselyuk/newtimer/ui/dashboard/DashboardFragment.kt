package ru.ekitselyuk.newtimer.ui.dashboard

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.ekitselyuk.newtimer.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        dashboardViewModel.state.observe(viewLifecycleOwner) { state ->
            when(state) {
                is DashboardState.RunningState -> {
                    showRunning(state)
                }
            }
        }

        binding.button.setOnClickListener {
            dashboardViewModel.change()
        }


        return root
    }

    private fun showRunning(state: DashboardState.RunningState) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}