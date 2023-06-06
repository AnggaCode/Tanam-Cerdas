package com.nine.tanamcerdas.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nine.tanamcerdas.R
import com.nine.tanamcerdas.core.data.Plants
import com.nine.tanamcerdas.databinding.PopularItemBinding

class PopularAdapter(private val onNavigateToDetail: ((Plants) -> Unit)? = null) :
    ListAdapter<Plants, PopularAdapter.PopularViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularAdapter.PopularViewHolder {
        val binding = PopularItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val data = getItem(position) ?: return
        holder.bind(data)
        holder.itemView.setOnClickListener { onNavigateToDetail?.invoke(data) }
    }

    inner class PopularViewHolder(private val binding: PopularItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Plants) {
            Glide.with(itemView.context)
                .load(data.plantPhoto)
                .placeholder(R.drawable.grass)
                .centerCrop()
                .into(binding.ivBackground)
            binding.tvPlantName.text = data.plantName
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Plants>() {
            override fun areItemsTheSame(oldItem: Plants, newItem: Plants): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Plants, newItem: Plants): Boolean {
                return oldItem == newItem
            }

        }
    }
}