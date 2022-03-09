package com.example.compromise.view.dispute

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.compromise.R
import com.example.compromise.databinding.FragmentDisputeBinding
import com.example.compromise.databinding.FragmentHistoryBinding
import com.example.compromise.view.history.HistoryFragment

class DisputeFragment : Fragment() {

    private var _binding: FragmentDisputeBinding? = null
    val binding: FragmentDisputeBinding
        get() {
            return _binding!!
        }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDisputeBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        fun newInstance(): DisputeFragment {
            return DisputeFragment()
        }
    }
}