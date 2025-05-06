package com.eraysirdas.fourthwork.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.eraysirdas.fourthwork.R
import com.eraysirdas.fourthwork.databinding.FragmentPageYBinding


class PageY : Fragment() {
    private var _binding: FragmentPageYBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPageYBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                view.findNavController().navigate(R.id.action_pageY_to_main2)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)
        
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}