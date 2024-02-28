package com.fdmgroup.FitnessTrackerApp

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fdmgroup.FitnessTrackerApp.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.addButton.setOnClickListener {
            addBox()
        }

        return binding.root
    }

    private fun addBox() {
        val newBox = TextView(requireContext())
        newBox.text = "New Box"
        newBox.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
        newBox.setBackgroundResource(R.drawable.small_box_background)
        newBox.setPadding(8, 8, 8, 8)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(4, 4, 4, 4)
        newBox.layoutParams = params

        binding.boxContainer.addView(newBox)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}