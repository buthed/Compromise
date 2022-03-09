package com.example.compromise.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.compromise.R
import com.example.compromise.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    val binding: FragmentMainBinding
        get() {
            return _binding!!
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toHistoryButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_historyFragment)
        }
        binding.toSettingsButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
        }
        binding.toResolvePageButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_disputeFragment)
        }
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}