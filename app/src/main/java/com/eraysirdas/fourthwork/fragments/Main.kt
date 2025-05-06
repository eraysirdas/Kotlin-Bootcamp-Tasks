package com.eraysirdas.fourthwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eraysirdas.fourthwork.R
import com.eraysirdas.fourthwork.databinding.FragmentMainBinding
import androidx.navigation.findNavController


class Main : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToFragmentABtn.setOnClickListener {
            val action = MainDirections.actionMain2ToPageA()
            it.findNavController().navigate(action)

        }

        binding.goToFragmentXBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_main2_to_pageX)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}