package com.eraysirdas.fourthwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.eraysirdas.fourthwork.R
import com.eraysirdas.fourthwork.databinding.FragmentPageABinding


class PageA : Fragment() {
    private var _binding: FragmentPageABinding? = null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPageABinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToFragmentBBTn.setOnClickListener {
            it.findNavController().navigate(R.id.action_pageA_to_pageB)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}