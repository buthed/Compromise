package com.example.compromise.view.dispute

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.compromise.databinding.FragmentDisputeBinding
import com.example.compromise.databinding.FragmentSettingsBinding
import com.example.compromise.model.Dispute
import com.example.compromise.viewmodel.DisputeViewModel
import kotlinx.android.synthetic.main.fragment_dispute.*
import java.util.*
import kotlin.collections.ArrayList

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data: MutableList<Dispute> = ArrayList()
        data.add(Dispute(1,"Earth",1,"#0069c0"))
        data.add(Dispute(2,"Mars",1,"#0069c0"))
        data.add(Dispute(3,"Pizza",1,"#0069c0"))
        data.add(Dispute(4,"Rome",1,"#0069c0"))

        val adapter = DisputeAdapter(
            object : OnListItemClickListner {
                override fun onItemClick(dispute: Dispute) {
                    Log.d("AAA", "Click"+dispute.id)
                }
            }, data)
        binding.disputeRecyclerView.adapter = adapter
        binding.addDisputePosition.setOnClickListener{
            adapter.addDisputeItem()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): DisputeFragment {
            return DisputeFragment()
        }
    }
}