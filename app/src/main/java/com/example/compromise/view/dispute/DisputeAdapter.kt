package com.example.compromise.view.dispute

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.compromise.R
import com.example.compromise.databinding.ItemDisputeBinding
import com.example.compromise.model.Dispute
import kotlinx.android.synthetic.main.item_dispute.view.*


class DisputeAdapter(
    private var onListItemClickListner: OnListItemClickListner,
    private var dispute: List<Dispute>
): RecyclerView.Adapter<DisputeAdapter.DisputeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisputeViewHolder {
//        return RecyclerItemViewHolder(
//            LayoutInflater.from(parent.context)
//                .inflate(R.layout.item_dispute, parent, false)
//        )
        val binding: ItemDisputeBinding =  ItemDisputeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DisputeViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: DisputeViewHolder, position: Int) {
        (holder as DisputeViewHolder).bind(dispute[position])
    }

    override fun getItemCount() = dispute.size

    inner class RecyclerItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(dispute: Dispute){
            ItemDisputeBinding.bind(itemView).apply {
                nameDispute.text = dispute.name
                weightDispute.text = dispute.weight.toString()
            }
        }
    }

    interface OnItemClickListner {
        fun onItemClicked(id:String)
    }

    inner class DisputeViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(dispute: Dispute){
            ItemDisputeBinding.bind(itemView).apply {
                nameDispute.text = dispute.name
                weightDispute.text = dispute.weight.toString()
                itemView.setOnClickListener{
                    onListItemClickListner.onItemClick(dispute)
                }
            }
        }
    }
}

