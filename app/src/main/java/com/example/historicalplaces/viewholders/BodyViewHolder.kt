package com.example.historicalplaces.viewholders

import com.bumptech.glide.Glide
import com.example.historicalplaces.base.BaseViewHolder
import com.example.historicalplaces.databinding.ItemBodyBinding
import com.example.historicalplaces.dto.BodyDTO


class BodyViewHolder(binding:ItemBodyBinding) : BaseViewHolder<BodyDTO>(binding) {
    private val _binding = binding
    override fun bindView(model: BodyDTO, position: Int) {
        _binding.textViewBody.text=model.description
        Glide.with(_binding.root.context)
            .load(model.imagePath)
            .into(_binding.ivNews)
    }
}